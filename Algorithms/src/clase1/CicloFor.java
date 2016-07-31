
package clase1;

import java.util.Scanner;

/**
 * Esta clase tiene como finalidad, mostrarle las diferentes formas de utilizar
 * el ciclo for, sientase libre de analizar, borrar, probar, descuanchinflinar el codigo, con
 * la finalidad de aprender, si tiene alguna duda, envianos un correo o llega a nuestro
 * horario de dsi.
 * @author Braulio Juan Carlos Padilla Rosales Tutor academico Sección D.
 * @since 1.0
 * 
 */
public class CicloFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Obtener datos
        System.out.println("Bienvenido \n ingrese un nùmero \n");
        int numero = entrada.nextInt();
        
        //TIPOS DE FOR
        //For basico,  tres argumentos, 1) declaracion , condicion , incremento
        for(int i = 0 ; i < numero ; i++){
            System.out.println("For 1 numero " + i);
        }
        // for sin primer argumento , condicion , incremento
        int y = 0;
        for(   ;   y < numero ; y = y + 1 ){
            System.out.println("For 2 numero " + y);
        }
        // for mostrando solo numeros pares, incrementos pares
        for( y = 0 ;   y < numero ; y = y + 2 ){
            System.out.println("For 3 numero " + y);
        }
        
        //FOR INFINITO, si lo ejecutàs, entrearemos a un ciclo infinito
        //             for (;;){}
        //FIN
    }
}
