/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labcorregido_gualpamathias;

public class Nodo {
    private String dato;        // Dato almacenado en el nodo
    private Nodo izquierda;    // Referencia al hijo izquierdo
    private Nodo derecha;       // Referencia al hijo derecho
    
    // Constructor que recibe un dato para inicializar el nodo
    public Nodo(String dato) {
        this.dato = dato;       // Inicializa el dato
        this.izquierda = null;  // Inicializa la referencia al hijo izquierdo como nula
        this.derecha = null;     // Inicializa la referencia al hijo derecho como nula
    }

    // Método para obtener el dato almacenado en el nodo
    public String getDato() {
        return dato;
    }

    // Método para establecer el dato almacenado en el nodo
    public void setDato(String dato) {
        this.dato = dato;
    }

    // Método para obtener la referencia al hijo izquierdo
    public Nodo getIzquierda() {
        return izquierda;
    }

    // Método para establecer la referencia al hijo izquierdo
    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    // Método para obtener la referencia al hijo derecho
    public Nodo getDerecha() {
        return derecha;
    }

    // Método para establecer la referencia al hijo derecho
    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
}