package Ejercicios;

import java.util.Scanner;
/**
 * Esta clase crea una piramide dependiendo del numero que ingresemos.
 * Ejemplo: Ingresamos el numero 5
 * La salida sera
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 * 
 * @author Ricardo Hernandez, Tutor Academico IPC1 Seccion
 * 
 */
public class EjemploPiramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables locales.
        int np = 0;
        int lineaActual;
        int columna = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("numero de columnas(dato numerico mayor a 0):");
        np = entrada.nextInt(); 
        lineaActual = 1;
        
        /**
            mientras la linea actual sea menor o igual al número ingresado 
            por el usuario
        */
        while(lineaActual <= np){
            columna = 1;
            /**
             * Asignamos columna igual a uno y escribimos un número de asteriscos
             * igual al valor de la linea actual, esto con el fin de crear la forma
             * de la piramide, si estamos en la primera linea solo escribiremos un asterisco,
             * si estamos en la segunda escribiremos dos y así sucesivamente.
             */
            while(columna <= lineaActual){
                System.out.print("*");
                columna = columna +1;
            }
            lineaActual = lineaActual +1;
            System.out.print("\n");
        }
    }
    
}
