package clase2;

import java.util.Scanner;

/**
 * @author Braulio Juan Carlos Padilla Rosales, IPC1 TUTOR SECCION D
 * En esta clase, expondremos los tipos de variables : LOCALES Y GLOBALES
 * Tenga la libertad de hacer cambios a los metodos con el fin de comprender mejor los temas,
 * Si tiene alguna duda envienos un correo o dirgase a los horarios de dsi.
 * 
 * Variables LOCALES: Pertenecen unicamente a su ambito, osea el metodo donde fuerón declarados.
 * Variables GLOBALES: Pertenecen a cualquier ambito, osea pueden llamarse desde cualquier metodo.
 */
public class TiposVariables {
    //Variables globlales, Se declaran afuera de los metodos.
    public double PI = 3.14159265; 
    
    /**
     * Esta función devuelve el area de un circulo, declarando dos variables
     * locales,  radio , area y entrada (que solo se pueden utilizar en este metodo); 
     * además calculamos el area del mismo utilizando la variable global PI.
     * @since 4.0
     * @return area del circulo 
     */
    public double CalcularAreaCirculo(){
        //variables locales, se declaran adentro de los metodos
        Scanner entrada = new Scanner(System.in);
        double radio;
        double area;
        
        System.out.println("Ingrese el radio del circulo");
        radio = entrada.nextDouble();
        
        /**
         * Como se observa en la linea de abajo llamamos a la variable PI que no esta definida en el metodo
         * pero como es global, es posible utilizarla.
         */
        area = PI * radio * radio;
        
        return area;
        
    }
    /**
     * Este metodo cambia el valor de la variable global PI y le pone el valor que se ingrese en el metodo.
     * @since 4.0
     * @param pi 
     */
    public void CambiarPi(double pi){
        /**
         * Es posible actualizar el valor de una variable desde cualquier metodo, pero cuidado
         * si usted cambia el valor de una variable global, esta cambiara para siempre.
         */
        PI = pi;
    }
    
}
