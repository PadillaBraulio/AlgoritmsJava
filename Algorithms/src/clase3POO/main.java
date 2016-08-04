
package clase3POO;

/**
 * Pequeño ejemplo de programación orientada a objetos,
 * Es un sistema que esta conformado por conductores y automoviles; Los conductores pueden realizar las acciones
 * de arrancar el motor, acelerar, frenar, apagar, y la clase Carro a su vez puede realizar acciones como arrancar el auto, acelerar el auto, 
 * frenar el auto, apagar el auto; Aunque paresca raro, las acciones acelerar no son las mismas para las clases carro y persona, como ejemplificacion
 * cuando nosotros llamamos al metodo acelerar desde un objeto persona, este se restringe unicamente logicamente hablando a apachar el pedal del acelerador
 * por lo que se provoca que se llame al metodo acelerar del objeto carro, el cual ya depende de que el carro este encendido y tenga gasolina para poder acelerar;
 * Aunque se llamen igual, cada uno realiza diferentes acciones que estan relacionadas con su alcance como objetos.
 * @author Braulio Juan Carlos Padilla Rosales
 * @since 6.0
 */
public class main {
    public static void main(String[] args) {
        // Creamos un nuevo carro -> recordar la parte new Carro(" Mazda 323 "); nos sirve para reservar memoria para utilizar la variable.
        Carro mazda = new Carro(" Mazda 323 ");
       
        //Creamos un nuevo conductor -> recordar la parte new Conductor("juan"); nos sirve para reservar memoria para utilizar la variable.
        Conductor juan = new Conductor("juan");
        
        //Recordar que si no instancamos los objetos con la palabra NEW, no podremos utilizarlos.
        
        //El conductor se monta a su auto.
        juan.montarAuto(mazda);
        //El conductor enciende el auto
        juan.EncenderAuto();
        //El conductor acelera el auto, presionando el acelardor
        juan.acelerarAuto();
        //El conductor frena el auto, presionando el freno
        juan.frenarAuto();
        //El conductor le hecha gasolina al auto, en la gasolinera
        juan.hecharGasolina(7);
        
        //El conductor acelera el auto presionando el acelerador
        juan.acelerarAuto();
        juan.acelerarAuto();
        juan.acelerarAuto();
        juan.acelerarAuto();
        juan.acelerarAuto();
        juan.acelerarAuto();
        
        
        // el conductor presiona el freno
        juan.frenarAuto();
        juan.frenarAuto();
        juan.frenarAuto();
        juan.frenarAuto();
        juan.frenarAuto();
        juan.frenarAuto();
        juan.frenarAuto();
        
        
        //El conductor apaga el carro y se sale del mismo
        juan.ApagarAuto();
        
    }
}
