package Vectores;

import static Recursividad.Recursividad1.Fibonacci;

/**
 *
 * @author pc2
 */
public class Vector {
    public int enteros [] = {2,3,4};
    public char caracteres[];
    public Persona personas[];
    
    public Vector(){
        caracteres = new char[25];
        personas = new Persona[10];
        personas[0] = new Persona("Braulio","Padilla");
        personas[1] = new Persona("Daniel","Chavarria");
        personas[2] = new Persona("Javier","Carpio");
        personas[0] = new Persona("Luis","Peralta");
        personas[0] = new Persona("Andrea","Aldana");
                
    }
    public void llenarVectorEnteros(){
        for(int i = 0 ;  i < enteros.length ; i++){
            enteros[i] = i;
        }
    }
    public void mostrarEnteros(){
        for(int i = 0 ; i < enteros.length ; i++){
            System.out.println(enteros[i]);
        }
    }
    
    public void llenarCaracteres(){
        for(int i = 0 ; i < caracteres.length ; i++){
            caracteres[i] = (char)(i+97);
        }
    }
    public void MostrarCaracteres(){
        for(int i = 0 ; i < caracteres.length ; i++){
            System.out.println(caracteres[i]);
        }
    }
    
    public void MostrarVectorPersonas(){
        for(int i = 0 ; i < personas.length ; i++){
            System.out.println(personas[i].nombre + " " + personas[i].apellido);
        }
    }

    public static void main(String[] args){
        Vector prueba = new Vector();
        prueba.llenarVectorEnteros();
        prueba.mostrarEnteros();
    }
}
