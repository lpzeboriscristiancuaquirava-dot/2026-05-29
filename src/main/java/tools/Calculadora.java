package tools;

import java.util.Stack;

public class Calculadora {

    public static String convertirApostfix(String infix) {

        Pila pila = new Pila();

        String postfix = "";

        for (int i = 0; i < infix.length(); i++) {

            char c = infix.charAt(i);

            if (Character.isDigit(c)) {
                postfix += c;
            }

            else if (c == '(') {
                pila.push(c);
            }

            else if (c == ')') {

                while (!pila.estaVacia() && pila.peek() != '(') {
                    postfix += pila.pop();
                }

                pila.pop();
            }

            else {

                while (!pila.estaVacia()
                        && prioridad(pila.peek()) >= prioridad(c)) {

                    postfix += pila.pop();
                }

                pila.push(c);
            }
        }

        while (!pila.estaVacia()) {
            postfix += pila.pop();
        }

        return postfix;
    }

    public static String resolverExpresionPostfix(String postfix) {

        Stack<Integer> pila = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {

            char c = postfix.charAt(i);

            if (Character.isDigit(c)) {

                pila.push(c - '0');
            }

            else {

                int b = pila.pop();
                int a = pila.pop();

                switch (c) {

                    case '+':
                        pila.push(a + b);
                        break;

                    case '-':
                        pila.push(a - b);
                        break;

                    case '*':
                        pila.push(a * b);
                        break;

                    case '/':
                        pila.push(a / b);
                        break;
                }
            }
        }

        return String.valueOf(pila.pop());
    }

    public static int prioridad(char operador) {

        switch (operador) {

            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;
        }

        return 0;
    }
}
