package taller2;

import java.util.*;

public class ElMain {
    public static void main(String[]args){

            Random r;
            int d;
            int k;
            Lista lista;
            r = new Random(1);
            lista = new Lista();
            k = 29;
            for (; k > 0; k--) {
                d = r.nextInt(1000);
                lista.insentarOrdenado(d);
            }

            System.out.println("Elementos de la lista generados aleatoriamente");
            lista.visualizar();

            int eli = 99;

            System.out.println();
            lista.eliminar(eli);
            lista.visualizar();
            System.out.println("\nEl número eliminado fue: " + eli);
    }
}