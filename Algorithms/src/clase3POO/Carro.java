
package clase3POO;

/**
 * Esta clase contiene todos los atributos y comportamientos del carro en nuestro sistema,
 * Como bien se pudo notar en la clase, el proceso de abstracción pudo haber generado más variables (atributos)
 * pero es de vital importancia hacer una buena abstracción para no colocar variables de más.
 * @author Braulio Juan Carlos Padilla Rosales
 * @since 6.0
 */
public class Carro {
    //variables globales!!
    private String modelo;
    private boolean encendido;
    private int gasolina;
    private int velocidad;
    /**
     * Constructor de la clase, necesario para poder utilizar los objetos del tipo carro
     * @param modelo Es el modelo de carro que estamos manejando. 
     */
    public Carro(String modelo){
        this.modelo = modelo;
        velocidad = 0;
        gasolina = 1;
        encendido  = false;
    }
    /**
     * Este metodo enciende el motor, desde el punto de vista del auto, aquí el auto ve si 
     * tiene gasolina, antes para poder encenderse.
     */
    public void encenderMotor() {
        if(gasolina > 0) { 
            this.encendido = true;
            System.out.println("ENCENDIDO");
        }
        else{
            System.out.println("NO HAY GASOLINA");
        }
    }
    /**
     * Este metodo apaga el motor del auto.
     */
    public void apagarMotor(){
        this.encendido = false;
        System.out.println("MOTOR APAGADO SATISFACTORIAMENTE");
    }
    /**
     * Este metodo podemos explicarlo como cuando los sensores que se encuentran en el tanque
     * de gasolina observan que el nivel de gasolina subio, entonces el indicador de gasolina tambien sube.
     * @param gasolina 
     */

    public void anadirGasolina(int gasolina) {
        this.gasolina = this.gasolina +  gasolina;
        System.out.println("SE INCREMENTO " + gasolina + " DE GASOLINA");
    }
    
    /**
     * Este metodo sirve para acelerar el carro, ejemplificando, aquí harían combustion los pistones etc;
     * por cada vez que aceleramos, se nos quita uno de gasolina.
     */
    public void acelerar() {
        if(encendido && gasolina > 0){            
            this.velocidad++;        
            this.gasolina--;
            System.out.println("ACELERAR");
            System.out.println("NUEVA VELOCIDAD " + velocidad );
            System.out.println("NUEVA GASOLINA " + gasolina );
        }
        else{
            System.out.println("MOTOR APAGADO O NO HAY GASOLINA");
        }
    }
    /**
     * Este metodo ejemplificado ocurriría cuando las azapatas de los frenos presionan al disco.
     */
    public void frenar(){
        if(velocidad > 0){
            velocidad--;
            System.out.println("FRENAR");
            System.out.println("NUEVA VELOCIDAD " + velocidad );
        }
        else{
            System.out.println("CARRO DETENIDO");
        }
    }

    /**
     * Este metodo nos devuelve si el carro esta encendido o apagado
     * @return boolean
     */
    public boolean isEncendido() {
        return encendido;
    }
    /**
     * Obtiene el nivel de gasolina del tanque, (cuando miramos el nivel de gasolina
     * en el carro)
     * @return 
     */
    public int getGasolina() {
        return gasolina;
    }
    /**
     * Obtiene la velocidad del carro, (cuando miramos al velocimetro).
     * @return 
     */
    public int getVelocidad() {
        return velocidad;
    }
    
    
    @Override
    public String toString(){
        return " Carro : Marca " + this.modelo + " "
                + "Gasolina : " + this.gasolina + " "
                + "Encendido : " + this.encendido + " "
                + "Velocidad : " + this.velocidad;
    }
    
    
}
