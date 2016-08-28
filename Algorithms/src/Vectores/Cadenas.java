/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores;

import java.util.Scanner;

/**
 *
 * @author pc2
 */
public class Cadenas {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String cadena = entrada.nextLine(); //IPC1
        char [] vectorCaracteres = cadena.toCharArray();
 for(int i = vectorCaracteres.length - 1  ; i >=0; i--){
            System.out.println(vectorCaracteres[i]);
        }
    }
    
}
