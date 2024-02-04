package labcorregido_gualpamathias;

public class Arbol {
    // Atributos de la clase Arbol
    private Nodo raiz;  // Nodo raíz del árbol
    private String cad="";  // Cadena para almacenar resultados
    private int cont=0;  // Contador para calcular el peso de un nodo
    
    // Constructor que recibe un dato para inicializar la raíz del árbol
    public Arbol(String dato) {
        raiz = new Nodo(dato);
        raiz.setIzquierda(null);
        raiz.setDerecha(null);
    }

    // Método para insertar un nuevo nodo a la izquierda de un nodo de referencia
    public void insertarIzquierda(String dato, Nodo ref) {
        // Verifica que la referencia no sea nula antes de insertar
        if(ref != null) {
            Nodo nuevo = new Nodo(dato);
            ref.setIzquierda(nuevo);
        }
    }

    // Método para insertar un nuevo nodo a la derecha de un nodo de referencia
    public void insertarDerecha(String dato, Nodo ref) {
        // Verifica que la referencia no sea nula antes de insertar
        if(ref != null) {
            Nodo nuevo = new Nodo(dato);
            ref.setDerecha(nuevo);
        }
    }

    // Método para realizar un recorrido en preorden del árbol
    public String preOrden(Nodo ref) {
        // Verifica que la referencia no sea nula antes de realizar el recorrido
        if(ref != null) {
            // Verifica si es la raíz para inicializar la cadena con '--'
            if(ref == raiz) {
                cad = "--";
            }
            // Agrega el dato al resultado
            cad = cad + "--" + ref.getDato();
            // Recorre el subárbol izquierdo
            preOrden(ref.getIzquierda());
            // Recorre el subárbol derecho
            preOrden(ref.getDerecha());
        }
        return cad;  // Devuelve el resultado
    }

    // Método para realizar un recorrido en inorden del árbol
    public String inOrden(Nodo ref) {
        // Verifica que la referencia no sea nula antes de realizar el recorrido
        if(ref != null) {
            // Verifica si es la raíz para inicializar la cadena con '--'
            if(ref == raiz) {
                cad = "--";
            }
            // Recorre el subárbol izquierdo
            inOrden(ref.getIzquierda());
            // Agrega el dato al resultado
            cad = cad + "--" + ref.getDato();
            // Recorre el subárbol derecho
            inOrden(ref.getDerecha());
        }
        return cad;  // Devuelve el resultado
    }

    // Método para realizar un recorrido en postorden del árbol
    public String posOrden(Nodo ref) {
        // Verifica que la referencia no sea nula antes de realizar el recorrido
        if(ref != null) {
            // Verifica si es la raíz para inicializar la cadena con '--'
            if(ref == raiz) {
                cad = "--";
            }
            // Recorre el subárbol izquierdo
            posOrden(ref.getIzquierda());
            // Recorre el subárbol derecho
            posOrden(ref.getDerecha());
            // Agrega el dato al resultado
            cad = cad + "--" + ref.getDato();
        }
        return cad;  // Devuelve el resultado
    }

    // Método para obtener el grado de un nodo (cantidad de hijos)
    public String grado(Nodo ref) {
        // Verifica que la referencia no sea nula antes de obtener el grado
        if(ref != null) {
            // Verifica si es la raíz para inicializar la cadena
            if(ref == raiz) {
                cad = "";
            }
            int cont = 0;  // Inicializa el contador de grado
            // Verifica si hay un hijo a la derecha
            if(ref.getDerecha() != null) {
                cont++;
            }
            // Verifica si hay un hijo a la izquierda
            if(ref.getIzquierda() != null) {
                cont++;
            }
            // Agrega la información al resultado
            cad = cad + "Nodo: " + ref.getDato() + "\nGrado: " + cont + "\n=====================\n";
            // Recorre el subárbol izquierdo
            grado(ref.getIzquierda());
            // Recorre el subárbol derecho
            grado(ref.getDerecha());
        }
        return cad;  // Devuelve el resultado
    }
    // Método para obtener el peso de un nodo (cantidad de hijos)
    public String peso(Nodo ref) {
        // Verifica que la referencia no sea nula antes de obtener el peso
        if(ref != null) {
            // Verifica si es la raíz para inicializar la cadena
            if(ref == raiz) {
                cad = "";
            }
            // Recorre el subárbol izquierdo
            peso(ref.getIzquierda());
            // Recorre el subárbol derecho
            peso(ref.getDerecha());
            // Calcula el peso del nodo
            cont = pesoAux(ref);
            // Agrega la información al resultado
            cad = cad + "Nodo: " + ref.getDato() + "\nPeso: " + cont + "\n=====================\n";
            cont = 0;  // Reinicia el contador
        }
        return cad;  // Devuelve el resultado
    }
    // Método auxiliar para calcular el peso de un nodo
    public int pesoAux(Nodo ref) {
        // Verifica que la referencia no sea nula antes de calcular el peso
        if(ref != null) {
            // Recorre el subárbol izquierdo
            pesoAux(ref.getIzquierda());
            // Recorre el subárbol derecho
            pesoAux(ref.getDerecha());
            // Verifica si hay un hijo a la derecha
            if(ref.getDerecha() != null) {
                cont++;
            }
            // Verifica si hay un hijo a la izquierda
            if(ref.getIzquierda() != null) {
                cont++;
            }
        }
        return cont;  // Devuelve el resultado
    }

    // Método para obtener la raíz del árbol
    public Nodo getRaiz() {
        return raiz;
    }
}