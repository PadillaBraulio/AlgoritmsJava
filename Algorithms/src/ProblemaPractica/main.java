/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemaPractica;

/**
 *
 * @author pc2
 */
public class main {
    public static void main(String[] args){
        System.out.println((int)'0' );
        System.out.println((int)'1' );
        System.out.println((int)'8' );
        System.out.println((int)'9' );
        Operaciones a = new Operaciones();
        if(a.Comparar("brAulio123t#$%^*".toCharArray(), "brAulio123f#$%^*".toCharArray())){
            System.out.println("SI SON IGUALES LAS PALABRAS");
        }
        else{
            System.out.println("NO SON IGUALES LAS PALABRAS");
        }
    }
}
