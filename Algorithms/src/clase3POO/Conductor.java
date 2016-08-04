
package clase3POO;

/**
 * Esta clase contiene todos los atributos y comportamientos del Conductor.
 * @author Braulio Juan Carlos Padilla Rosales
 * @since 6.0
 */
public class Conductor {
    
    private final String nombre;
    //Por medio de la variable tipo carro se comunicaran la clase Conductor y Persona
    private Carro carro = null;
    
    /**
     * Metodo constructor, necesario para poder inicializar los objetos de esta clase.
     * @param nombre Es el nombre del conductor.
     */
    public Conductor(String nombre){
        this.nombre = nombre;
    }
    /**
     * Metodo en el cual se simula que el conductor se sube a manejar al carro,
     * En este punto es cuando la variable carro deja de ser null y obtiene un valor.
     * @param carro Sera el carro que el conductor ira a manejar.
     */
    public void montarAuto(Carro carro){
        this.carro = carro;
    }
    /**
     * Metodo que enciende el motor del carro, esto ocurre cuando la persona gira las llaves
     * en el carro.
     */
    public void EncenderAuto(){
        this.carro.encenderMotor();
    }
    /**
     * Metodo que apaga el motor del carro, esto ocurre cuando la persona quita las llaves
     * del carro.
     */    
    public void ApagarAuto(){
        carro.apagarMotor();
        carro = null;
    }
    /**
     * Metodo que simula cuando el conductor presiona el pedal del acelerador.
     */    
    public void acelerarAuto(){
        //presionar el acelerador
         this.carro.acelerar();
    }
    /**
     * Metodo que simula cuando el conductor presiona el pedal del freno.
     */  
    public void frenarAuto(){
        this.carro.frenar();
    }
    /**
     * Metodo que simula cuando el conductor hecha gasolina.
     */      
    public void hecharGasolina(final int  gasolina){
        carro.anadirGasolina(gasolina);
    }
    

    @Override
    public String toString(){
        if(carro == null) return " Conductor : nombre " + nombre;
        return " Conductor : nombre " + nombre + " " + carro.toString() ;       
    }
    
}
