package listaenlazadasimple_gualpamathias;
//Main principal

import java.util.Scanner;

public class ListaEnlazadaSimpleApp {

    public static void main(String[] args) {
     /*  //Instanciamos
       ListaEnlazadaSimple1 lista = new ListaEnlazadaSimple1();
       
       //Insertamos 5 elemnos del tipo double 
       lista.insertarCabezaLista(2.98);
       lista.insertarCabezaLista(3.11);
       lista.insertarCabezaLista(1.2);
       lista.insertarCabezaLista(12.212);
       lista.insertarCabezaLista(8.732);
       //Mostamos los nodos
       lista.mostrarLista(); 
       //Insertamos nuevo nodo
       Nodo nodo = lista.insertar(1.2, 45);
       if(nodo == null){
           System.out.println("No se pudo inserar nuevos nodos");
       } else {
           System.out.println("Nodo se inserto correctamente");
       }
       //se vuelve a mostar nodo
       lista.mostrarLista();
       
       //busamos nodo
       nodo = lista.buscarLista(3.11);
       if(nodo != null){
           System.out.println("Se encontro nodo con dato buscado");
       } else {
           System.out.println("No se encontro nodo con dato buscado");
       }
       
       //Borramos nodos
       while(!lista.vacia()){
           nodo = lista.eliminarCabezaLista();
            System.out.println("Nodo Eliminado");
            nodo.mostrarNodo();
             System.out.println("");
       }
       
       //Comprobamos la lista
        System.out.println("Lista enlazada simple esta vacia? " + lista.vacia());
        lista.mostrarLista();
        
        //Insertamos nuevos nodos
       lista.insertarCabezaLista("Perro");
       lista.insertarCabezaLista("Gato");
       lista.insertarCabezaLista("Caballo");
       lista.insertarCabezaLista("Conejo");
    
       //Mostramos nodos
       lista.mostrarLista();
       
       //Eliminamos un nodo
       lista.eliminar("Gato");
       
       //Mostramos nodos
       lista.mostrarLista();*/
     ListaEnlazadaSimple1 lista = new ListaEnlazadaSimple1();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Insertar nuevo nodo");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Buscar nodo");
            System.out.println("4. Eliminar nodo");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un nodo ");
                    Object valor = scanner.next();
                    lista.insertarCabezaLista(valor);
                    System.out.println("Nodo insertado correctamente.");
                    break;
                case 2:
                    lista.mostrarLista();
                    break;
                case 3:
                    System.out.print("Ingrese el nodo a buscar: ");
                    Object valorBuscado = scanner.next();
                    Nodo nodoBuscado = lista.buscarLista(valorBuscado);
                    if (nodoBuscado != null) {
                        System.out.println("Nodo encontrado correctamente");
                    } else {
                        System.out.println("No se encontro el Nodo");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el nodo a eliminar: ");
                    Object valorEliminar = scanner.next();
                    Nodo nodoEliminado = lista.eliminar(valorEliminar);
                    if (nodoEliminado != null) {
                        System.out.println("Nodo eliminado correctamente");
                    } else {
                        System.out.println("No se encontro nodo a eliminar");
                    }
                    break;
                case 5:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 5);
        
        scanner.close();
    }
}
    
     


