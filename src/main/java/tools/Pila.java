package tools;

public class Pila {

    Nodo cima;

    public Pila() {
        cima = null;
    }

    public void push(char dato) {

        Nodo nuevo = new Nodo(dato);

        nuevo.siguiente = cima;

        cima = nuevo;
    }

    public char pop() {

        if (estaVacia()) {
            return '\0';
        }

        char dato = cima.dato;

        cima = cima.siguiente;

        return dato;
    }

    public char peek() {

        if (estaVacia()) {
            return '\0';
        }

        return cima.dato;
    }

    public boolean estaVacia() {
        return cima == null;
    }
}