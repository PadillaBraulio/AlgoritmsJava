package Recursividad;

/**
 * Esta clase nos servirá para aprender acerca de recursividad,
 * para empezar definiremos este termino.
 * Recursividad: Significa literalmente llamarse a si mísmo y en el 
 * ambito de programación significa llamar al metodo dentro del metodo
 * un número indefnido de veces.
 * @author pc2
 */
public class Recursividad1 {
    public static int Factorial(int numero){
        if(numero == 1 ) { return 1 ; }
        return numero * Factorial(numero-1);
    }
    public static int Fibonacci(int num){
        if(num == 1 || num == 0 ) return num;
        int anterior = Fibonacci(num - 1);
        int actual = Fibonacci(num - 2);
        return anterior + actual;  
    }
    public static void main(String[] args){
        System.out.println(Fibonacci(6));
        
    }
}
