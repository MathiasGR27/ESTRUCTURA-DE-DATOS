package listaenlazadasimple_gualpamathias;
//Clase Nodo
public class Nodo {
     //Variable de instancias
     public Object dato; //referencia campo dato
     public Nodo siguiente;//referencia siguiente nodo en la lista enlazada
     
     //Generamos el constructor
     public Nodo(Object d){
         dato = d; //guarda dato de nodo
         siguiente = null; //siguiente apunta al null 
     } 
     
     public void mostrarNodo(){
         System.out.println("(" + dato + ")");
     }
}
