package AlgoritmosDificiles;

import AlgoritmosDificiles.BarraDeChocolate.arbol.nodo;
import java.util.ArrayList;

/**
 * INSTRUCCIONES All submissions for this problem are available. Chocolate in
 * its many forms is enjoyed by millions of people around the world every day.
 * It is a truly universal candy, available in virtually every country around
 * the world. You find that the only thing better than eating chocolate is to
 * share it with friends. Unfortunately, your friends are very picky and have
 * different appetites: some would like more and others less of the chocolate
 * that you offer them. You have found it increasingly difficult to determine
 * whether their demands can be met. It is time to write a program that solves
 * the problem once and for all! Your chocolate comes as a rectangular bar. The
 * bar consists of same-sized rectangular pieces. To share chocolate, you may
 * break one bar into two pieces along a division between rows or columns of the
 * bar. You may then repeatedly break the resulting pieces in the same manner.
 * Each of your friends insists on a getting a single rectangular portion of the
 * chocolate that has a specified number of pieces. You are a little bit
 * insistent as well: you will break up your bar only if all of it can be
 * distributed to your friends, with none left over.
 *
 * For example, Figure shows one way that a chocolate bar consisting of 3 × 4
 * pieces can be split into 4 parts that contain 6, 3, 2, and 11 pieces
 * respectively, by breaking it 3 times. (This corresponds to the first sample
 * input.)
 *
 * |_|_|_|_| |_|_|_|_| |_|_|_|_|
 *
 * |
 * |
 * v
 *
 * _ _ _ _
 * |_|_|_| |_| |_|_|_| |_| _ _ _ _ |_| |_|_||_|
 *
 *
 * @author pc2
 */
public class BarraDeChocolate {

    public static void main(String[] args) {
        String cadena = "999999999";
        int nivel = cadena.length() + 1;
        int dimX = 10;
        int dimY = 10;
        arbol ar = new arbol(dimX, dimY);
        System.out.println(ar.procedure(cadena));
    }

    public static class arbol {

        private nodo raiz;
        private boolean flag;
        private String original;
        private int NIVEL_FINAL = 1;
        private final int NIVEL_INICIAL = 1;

        public arbol(int dimX, int dimY) {
            this.raiz = new nodo(dimX, dimY, NIVEL_INICIAL);
        }

        public boolean procedure(String cadena) {
            this.original = cadena;
            this.NIVEL_FINAL = cadena.length() + 1; // Soporta hasta 7
            this.CrearHijos(raiz);
            this.Cadenas( NIVEL_FINAL , new ArrayList<>());
            return flag;
        }

        public void CrearHijos(nodo raiz) {
            int i = 1;
            int dimX = raiz.dimX;
            int dimY = raiz.dimY;
            int nivel = raiz.nivel;
            if(  nivel == NIVEL_FINAL ) return ;
            for (; i <= dimX / 2; i++) {
                nodo hijo1 = new nodo(i, dimY, nivel + 1);
                raiz.anadirHijo(hijo1);
                CrearHijos(hijo1);

                nodo hijo2 = new nodo(dimX - i, dimY, nivel + 1);
                raiz.anadirHijo(hijo2);
                CrearHijos(hijo2);
            }
            if (dimX != dimY) {
                for (i = 1; i <= dimY / 2; i++) {
                    nodo hijo1 = new nodo(dimX, i, nivel + 1);
                    raiz.anadirHijo(hijo1);
                    CrearHijos(hijo1);

                    nodo hijo2 = new nodo(dimX, dimY - i, nivel + 1);
                    raiz.anadirHijo(hijo2);
                    CrearHijos(hijo2);
                }
            }

        }

        public boolean isEqual(String aux, String original) {
            boolean flag;
            for (int i = 0; i < original.length(); i++) {
                char in = original.charAt(i);
                flag = true;
                for (int y = 0; y < aux.length(); y++) {
                    char cpy = aux.charAt(y);
                    if (in == cpy) {
                        aux = aux.replaceFirst(cpy + "", "");
                        flag = false;
                    }
                }
                if (flag) {
                    return false;
                }
            }
            return true;
        }

        public void Cadenas(int nivel, ArrayList<nodo> childs) {
            int hijos = childs.size();
            if (flag) {
                return;
            }
            if (hijos > nivel) {
                return;
            }
            if (hijos == nivel) {
                String posibleCadena = "";
                for (nodo child : childs) {
                    posibleCadena += "" + child.cantidadPiezas;
                }
                flag = isEqual(posibleCadena, original);
            } else if (hijos == 0) {
                hijos = raiz.hijos.size() - 2;
                for (int i = 0; i <= hijos; i = i + 2) {
                    nodo izq = raiz.hijos.get(i);
                    nodo der = raiz.hijos.get(i + 1);
                    ArrayList<nodo> b = new ArrayList();
                    b.add(izq);
                    b.add(der);
                    Cadenas(nivel, b);
                }

            } else {
                for (int i = 0; i < childs.size(); i++) {

                    ArrayList<nodo> hijo = childs.get(i).hijos;
                    for (int y = 0; y <= hijo.size() - 2; y = y + 2) {

                        ArrayList<nodo> nuevo = new ArrayList();
                        for (int z = 0; z < childs.size(); z++) {
                            if (i != z) {
                                nuevo.add(childs.get(z));
                            }
                        }
                        nodo izq = hijo.get(y);
                        nodo der = hijo.get(y + 1);
                        nuevo.add(izq);
                        nuevo.add(der);
                        Cadenas(nivel, nuevo);
                    }
                }

            }

        }
        public class nodo {

            int dimX;
            int dimY;
            int cantidadPiezas;
            int nivel;
            ArrayList<nodo> hijos;

            public nodo(int dimX, int dimY, int nivel) {

                this.dimX = dimX;
                this.dimY = dimY;
                this.nivel = nivel;
                this.cantidadPiezas = dimX * dimY;
                this.hijos = new ArrayList();
            }

            public void anadirHijo(nodo child) {
                child.nivel = nivel + 1;
                hijos.add(child);
            }
        }
    }

}
