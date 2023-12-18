package proyectoestructura_gualpamathias;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class SuperMercado {
    Caja[] cajas; // Array dinámico de cajas
    LinkedList<Producto> listaProductos; // Lista de productos en el supermercado
    Stack<Producto> pedidosPend; // Pila de producto pendientes
    Queue<Producto> pedidosPrep; // Cola de producto en preparación
    int numProductos,numeroPedido,cantidadProducto;
    double precioProducto;
    Scanner scanner = new Scanner(System.in);
    
    
    SuperMercado(int numCajas) {
        cajas = new Caja[numCajas];
        for (int i = 1; i < numCajas; i++) {
            cajas[i] = new Caja();
        }
        listaProductos = new LinkedList<>();
    }

    public SuperMercado(Caja[] cajas, LinkedList<Producto> listaProductos) {
        this.cajas = cajas;
        this.listaProductos = listaProductos;
    }
    private static boolean esSoloLetras(String nombreCliente) {
        return nombreCliente.matches("[a-zA-Z]+");}
    private static boolean esSoloLetra(String nombreProducto) { //metodo para validar el ingreso de solo letras
        return nombreProducto.matches("[a-zA-Z]+");
    }
    
   
    
   // Métodos para operaciones en cajas
   void agregarCliente(int numCaja, Cliente cliente) {
    if (numCaja >= 1 && numCaja < cajas.length) {
        cajas[numCaja].colaClientes.add(cliente);
        System.out.println("Cliente agregado a la cola en la caja " + numCaja);
    } else {
        System.out.println("Número de caja inválido. Inténtelo nuevamente.");
    }
}

    void atenderCliente(int numCaja) {
        if (!cajas[numCaja].colaClientes.isEmpty()) {
            Cliente clienteAtendido = cajas[numCaja].colaClientes.poll();
            // Realizar acciones con el cliente atendido
        } else {
            System.out.println("La cola en la caja " + numCaja + " está vacía.");
        }
    }

    void mostrarEstadoColas(int numCaja) {
        // Mostrar el estado de la cola en la caja específica
        System.out.println("Estado de la cola en la caja " + numCaja + ": " + cajas[numCaja].colaClientes);
    }

    void mostrarEstadoTodasColas() {
        // Mostrar el estado de todas las colas en el supermercado
        for (int i = 1; i < cajas.length; i++) {
            mostrarEstadoColas(i);
        }
    }

    // Métodos para operaciones de productos
    void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    void mostrarStockProducto(int numProducto) {
    // Verificar si el índice es válido
    if (numProducto >= 0 && numProducto < listaProductos.size()) {
        // Obtener el producto de la lista en la posición numProducto
        Producto producto = listaProductos.get(numProducto);

        // Mostrar el stock del producto específico
        System.out.println("Stock del producto " + producto.getNombre() );
    } else {
        System.out.println("Índice de producto no válido.");
    }
    }
}
    
 

