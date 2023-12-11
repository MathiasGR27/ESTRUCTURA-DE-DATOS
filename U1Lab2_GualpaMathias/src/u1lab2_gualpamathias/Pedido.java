package u1lab2_gualpamathias;

import java.util.LinkedList;
import java.util.Queue;

public class Pedido {  
    int numPedido;
    String nomCliente;
    Queue<Producto> productos = new LinkedList<>();

    public Pedido(int numPedido, String nomCliente) {
      //  this.numPedido = numPedido;
        this.nomCliente = nomCliente;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
}