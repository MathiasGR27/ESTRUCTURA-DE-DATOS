package u1lab2_gualpamathias;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Restaurante {
    Stack<Pedido> pedidosPend = new Stack<>();
    Queue<Pedido> pedidosPre = new LinkedList<>();

    public void agregarPedido(Pedido pedido) {
        pedidosPend.push(pedido);
        System.out.println("Pedido agregado correctamente.");
        
         mostrarPedidosPendientes();
    }

    public void prepararPedido() {
        if (!pedidosPend.isEmpty()) {
            Pedido pedidoActual = pedidosPend.pop();
            pedidosPre.add(pedidoActual);
            System.out.println("Pedido preparado ");
        } else {
            System.out.println("No hay pedidos pendientes para preparar.");
        }
    }

    public void entregarPedido() {
        if (!pedidosPre.isEmpty()) {
            Pedido pedidoentre = pedidosPre.poll();
            System.out.println("Pedido entregado al cliente: " + pedidoentre.nomCliente);
        } else {
            System.out.println("No hay pedidos preparados para entregar.");
        }
    }
    
    public void mostrarPedidosPendientes() {
        System.out.println("Pedidos Pendientes ");
        for (Pedido pedido : pedidosPend) {
            System.out.println(" Cliente: " + pedido.nomCliente);
            
            System.out.println("Productos:");

            for (Producto producto : pedido.productos) {
                System.out.println("  - Nombre: " + producto.nombre );
                System.out.println("  - Cantidad: " + producto.cantidad );
                System.out.println("  - Precio: " + producto.precio);
            }
            System.out.println("------------------------------");
        }
    }
 
}


    



