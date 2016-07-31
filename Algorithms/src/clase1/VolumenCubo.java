
package clase1;

import java.util.Scanner;

/**
 * En esta clase calcularemos el volumen de un cubo :), que chilero!.
 * @author Braulio Juan Carlos Padilla Rosales Tutor academico sección D.
 * @since 1.0
 */
public class VolumenCubo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Esta variable nos sirve para obtener datos del teclado
        Scanner entrada = new Scanner(System.in);
        //Declaraci[on de variables
        //Tipo de datos primitivos, no necesitan inicializarse, poseen un valor por default (investigar y si quieren envienos un correo con lo que investigaron :) !)
        int A;
        int B;
        int C;
        int V;        
        //Obtenciòn de datos
        System.out.println("Bienvenido");
        System.out.println("Ingrese el primer numero");
        A = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        B = entrada.nextInt();
        System.out.println("Ingrese el tercer numero");
        C = entrada.nextInt();
        //Calculo del volumen
        V = A * B * C;
        //Muestra del volumen
        System.out.println("Gracias, el volumen es " + V);
        //fin
        
    }
    
}
