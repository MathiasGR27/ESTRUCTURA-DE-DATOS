package practica5_gualpamathias;

public class Pila {
    int tamaño;
    Nodo tope;

    public Pila() {
        this.tamaño = 0;//Tamaño de pila
        this.tope = null;//Nodo en la cima de la pila
    }
    //Constructor
    public void push(int valor){
        Nodo nodo = new Nodo(valor);
        nodo.siguiente=tope;
        tope = nodo;
        tamaño++;
    }
    
    public int pop(){
        if(tamaño >0){
            int returnValue = tope.valor;
            tope=tope.siguiente;
            tamaño--;
            return returnValue;
        }else{
            return -1;
        }
    }
    public void mostrar(){
        if(isEmpty()){
            System.out.println("La pila esta vacia");
        }else{
            System.out.println("Elementos de la pila :");
            Nodo actual=tope ;
            while(actual!=null){
              System.out.println(actual.valor );
              actual=actual.siguiente;
            }
        
        }
    }
     public int verTope() {
        if (isEmpty()) {
            System.out.println("La pila está vacía. No hay elementos en la cima.");
            return -1; // Otra opción es lanzar una excepción en lugar de devolver -1
        } else {
            return tope.valor;
        }
    }
    public boolean isEmpty(){
        return tamaño== 0;
    }
}
