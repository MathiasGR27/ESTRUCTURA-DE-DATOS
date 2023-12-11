package u1lab2_gualpamathias;

import java.util.Scanner;

public class U1Lab2_GualpaMathias {

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();//Instanciamos la clase Restaurante
        Scanner scanner = new Scanner(System.in);	
	int opc;
	//Generamos un menu
	do {
		System.out.print("\nMenu");
		System.out.print("\n1 Agregar un nuevo pedido");
                System.out.print("\n2 Preparar el pedido actual ");
                System.out.print("\n3 Entregar el pedido preparado actual al cliente ");
		System.out.print("\n4 Salir");
		System.out.print("\nSeleccione una opcion : ");
		opc=scanner.nextInt();
		switch(opc) {
		 case 1:
                     // Agregar un nuevo pedido
                    System.out.print("Ingrese el número de pedidos: ");
                    int numeroPedido = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner

                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();

                    System.out.print("Ingrese la cantidad de productos: ");
                    int cantidadProductos = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner

                    Pedido nuevoPedido = new Pedido(numeroPedido, nombreCliente);
                    agregarProductos(nuevoPedido, scanner, cantidadProductos);

                    restaurante.agregarPedido(nuevoPedido);
                    
                    break;

                case 2:
                    // Preparar el pedido actual
                    restaurante.prepararPedido();
                    break;

                case 3:
                    // Entregar el pedido preparado
                    restaurante.entregarPedido();
                    break;

                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (opc != 4);
    }

     private static void agregarProductos(Pedido pedido, Scanner scanner, int cantidadProductos) {
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Ingrese el nombre del producto: ");
            String nombreProducto = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precioProducto = scanner.nextDouble();

            System.out.print("Ingrese la cantidad del producto: ");
            int cantidadProducto = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            Producto nuevoProducto = new Producto(nombreProducto, precioProducto, cantidadProducto);
            pedido.agregarProducto(nuevoProducto);
        }
    }
}

