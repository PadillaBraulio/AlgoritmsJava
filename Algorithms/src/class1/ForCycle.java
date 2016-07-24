/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1;

import java.util.Scanner;

/**
 *
 * @author pc2
 */
public class ForCycle {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //TIPOS DE FOR
        //Obtener datos
        System.out.println("Bienvenido \n ingrese un nùmero \n");
        int numero = entrada.nextInt();
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
