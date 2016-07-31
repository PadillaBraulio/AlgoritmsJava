
package clase1;

import java.util.Scanner;

/**
 * En esta clase se crea un menu y dependiendo de la selección del usuario se muestra
 * el precio del producto; Aquí aprendera la sintaxis del IF, se puede utilizar el if solo
 * el if anidad con else if y de ultimo se le puede añadir la clausula else.
 * 
 * Sientase libre de analizar el codigo, cualquier duda, puede convocarse con nosotros
 * por medio de un correo electronico o asistiendo a nuestor horario de dsi.
 * 
 * @author Braulio Juan Carlos Padilla Rosales Tutor ipc1 sección D
 * @since 1.0
 */
public class PreciosMenu {
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
