

![Banner](https://dummyimage.com/1200x250/111827/ffffff&text=CALCULADORA+POSTFIX+SPRING+BOOT)

## Descripción:

Proyecto en Java con Spring Boot que convierte expresiones matemáticas en notación infija a postfix y luego las evalúa para obtener el resultado.

---

## ¿Qué hace?

- Convierte expresiones infijas a postfix
- Evalúa expresiones matemáticas
- Usa una pila implementada con nodos
- Expone una API REST

---

## Funcionamiento:

1. Se recibe una expresión matemática
2. Se convierte a postfix
3. Se evalúa usando una pila
4. Se devuelve el resultado

---

## Endpoint:

POST `/expresion`

Ejemplo:

Entrada:
3+4*2

Salida:

---
## Estructura del proyecto:

- src/main/java
    - com/wintux/computadorita/controllers
        - CalculadoraController.java
    - tools
        - Calculadora.java
        - Nodo.java
        - Pila.java  

---

## Clases:

Calculadora → convierte y resuelve expresiones  
Pila → estructura de datos  
Nodo → elemento de la pila  
Controller → expone el endpoint

---

## Tecnologías:

Java  
Spring Boot  
POO  
Estructuras de datos  
API REST

---

## DE:

Boris Cristian Cuaquira Vargas

---

## Nota:

Proyecto educativo para practicar pilas, postfix y APIs REST.
