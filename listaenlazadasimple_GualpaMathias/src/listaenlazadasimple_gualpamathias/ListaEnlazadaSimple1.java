package listaenlazadasimple_gualpamathias;
//Clase ListaEnlazadaSimple1
public class ListaEnlazadaSimple1 {
   //Variable de instancia
    private Nodo primero; //Referencia al primero nodo de la fila enlazda
    
    //Constructor
    public ListaEnlazadaSimple1(){
        primero=null;     //Creamos lista enlazada vacia
    }
    //Verifica si la lista enlazada esta vacia
    public boolean vacia(){
        return (primero == null);
    }
    
    public void insertarCabezaLista(Object d){
        Nodo nuevoNodo = new Nodo(d); //creamos un nuevo nodo
        nuevoNodo.siguiente= primero; //enlazamos el nuevo nodo con el nodo en la cabeza
        
        primero = nuevoNodo;          //El nuevo nodo se la nueva cabeza de la lista enlazada
    }
    //Elimina el nodo de la cabeza de la lista enlazada simple      
    public Nodo eliminarCabezaLista(){
        Nodo temp = primero; //Guarda referencia al primer nodo en la variable temp 
        primero = primero.siguiente; //Cambiamos referencia de la variable primero para 
                                     //que apunte al segundo nodo
        
       return temp;                  //retorna nodo eliminado
    }
    
    public void mostrarLista(){
        System.out.println("Lista (Primero -> ultimo) : "); //Recorremos lista enlazada desde el primer hasta el ultimo
        Nodo nodoActual = primero;                          //Comenzamos en el primer nodo de la lista enlazda simple
        
        while (nodoActual!=null){                           //mientras no se llegue al final de la lista enlazada simple 
            nodoActual.mostrarNodo();                       //Imprimimos el valor del campo del nodo actual
            nodoActual = nodoActual.siguiente;              // nos movemos al siguiente nodo de la lista enlazada simple
        }
        System.out.println("");                             //Se deja una linea en blanco
    }
    //busca nodo con el dato del parametro pasado al metodo
    public Nodo buscarLista(Object dato){
        Nodo nodoActual = primero;//iniciamos busqueda en el primer nodo de la lista enlaxada simple    
        
        while(!nodoActual.dato.equals(dato)){//Mientras no s eencuentre nodo con el dato buscado
            if(nodoActual.siguiente==null){//si llegamos al final de la lista enlazada simple
                return null;//no se encontro dato buscado
            }else{//no es el final de la lista enlazada si,ple
                nodoActual = nodoActual.siguiente; //nos movemos al siguiente nodo
            }
        }
        return nodoActual;//retornamos nodo con dato buscado
    }
    
     public Nodo eliminar(Object dato){
        Nodo nodoActual = primero;//iniciamos busqueda en el primer nodo de la lista enlaxada simple    
        Nodo nodoAnterior = primero;//iniciamos busqueda en el anterior nodo de la lista enlaxada simple    
        
        while(!nodoActual.dato.equals(dato)){//Mientras no s eencuentre nodo con el dato buscado
            if(nodoActual.siguiente==null){//si llegamos al final de la lista enlazada simple
                return null;//no se encontro dato buscado
            }else{//no es el final de la lista enlazada si,ple
                nodoAnterior = nodoActual;          //Desplazamos la variable nodoAnterior al siguiente nodo
                nodoActual = nodoActual.siguiente;  //Desplazamos la variable nodoActual al siguiente nodo
            }
        }
        
        //se encontro el nodo a borrar
        if(nodoActual == primero){//si nodo que se borra es el primero 
            primero = primero.siguiente;//se elimina el primero
        }else{//si no si nodo a borrar no es el primero
            nodoAnterior.siguiente = nodoActual.siguiente;//Se borra el nodo referenciado por la variable nodo Actual
        }
        return nodoActual; //se retorna el nodo eliminado
     }
     
     public Nodo insertar(Object valorExistente, Object valorNuevo){
         Nodo nuevoNodo = new Nodo(valorNuevo);//creamos nodo con valor nuevo   
         Nodo nodoActual = primero;//inicamos busqueda del nodo con un valorexistente
         
         while(!nodoActual.dato.equals(valorExistente)){//bucle que intera hasta encontrar el nodo 
             if(nodoActual.siguiente==null){//si llegamos al final 
                 return null;//Retorna null
             }else{
                 nodoActual = nodoActual.siguiente;//se sigue buscando nodo y se mueve al siguiente nodo
             }
         }
         nuevoNodo.siguiente=nodoActual.siguiente;//enlaxamos el nuevo con el siguiente nodo
         nodoActual.siguiente=nuevoNodo;//enlazamos el nodo encontrado con el nuevo nodo creado
         
         return nuevoNodo;//Retorna nuevo nodo
     }
}
