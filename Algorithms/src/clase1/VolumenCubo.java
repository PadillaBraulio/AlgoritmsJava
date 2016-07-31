/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author pc2
 * Ejemplo del calculo del volumen de un cubo por consola
 */
public class VolumenCubo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Esta variable nos sirve para obtener datos del teclado
        Scanner entrada = new Scanner(System.in);
        //Declaraci[on de variables
        //Tipo de datos primitivos, no necesitan inicializarse, poseen un valor por default (investigar)
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
