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
 * Ejemplo de un menu
 */
public class PricesMenu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //INICIO
        //Mostrar titulo
        System.out.println("Bienvenido \n "
                + "Seleccione el platillo que desea comprar \n"
                + "1) Frijoles \n"
                + "2) Tostadas \n"
                + "3) Huevos");
        int opcion = entrada.nextInt();
        
        if(opcion == 1){
            System.out.println("Opcion 1, los frilojes valen 20 quetzales");
        }else if (opcion == 2 ){
            System.out.println("Opcion 2, las tostadas valen 15 quetzales");
            
        }else{
            System.out.println("Opcion 3, los frilojes valen 5 quetzales");
            
        }
        
        //FIN
    }
}
