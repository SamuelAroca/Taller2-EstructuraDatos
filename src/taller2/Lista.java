package taller2;

public class Lista {
    private Nodo primero;

    public Lista() {
        primero = new Nodo(0);
    }

    public void insentarOrdenado(int entrada) {
        Nodo nuevo = new Nodo(entrada);
        if (entrada < primero.dato) {
            nuevo.enlace = primero;
            primero = nuevo;
        } else {
            Nodo anterior, a;
            a = primero;
            anterior = a;

            while (a.enlace != null && entrada > a.dato) {
                anterior = a;
                a = a.enlace;
            }
            if (entrada > a.dato)
                anterior = a;
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
    }

    public void visualizar() {
        Nodo n;
        int k = 0;
        n = primero;
        while (n != null) {
            System.out.print(n.dato + " ");
            n = n.enlace;
            k++;
            System.out.print((k % 15 != 0 ? " " : "\n"));
        }
    }

    public void eliminar(int entrada) {
        Nodo actual, anterior;
        boolean encontrado;
        actual = primero;
        anterior = null;
        encontrado = false;
        while ((actual != null) && (!encontrado)) {
            encontrado = (actual.dato == entrada);
            if (!encontrado) {
                anterior = actual;
                actual = actual.enlace;
            }
        }
        if (actual != null) {

            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
        }
    }
}