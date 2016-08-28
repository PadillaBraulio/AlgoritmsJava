/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casteos;

import ProblemaPractica.Operaciones;

/**
 *
 * @author pc2
 */
public class Casteos {
    
    public static void castear(){
        int entero = 20000;
        long largo = 2000;
        boolean booleano = false;
        char caracter = 'a';
        byte BYTE = 127;
        double Double = 97;
        //de double a entero
        System.out.println((int)Double);
        //de entero a double
        System.out.println((double)entero);
        //de double a boolean?
        //System.out.println((boolean)largo);
        //de double a byte
        System.out.println((byte)Double);
        //de char a entero
        System.out.println((char)Double);
       
        String braulio = "123";
        int numero = Integer.parseInt(braulio);
        double d = (double)Float.parseFloat(braulio);
        //System.out.println((int)braulio);
         
    }
    public static void main(String[] args){
        castear();
    }
    
}
