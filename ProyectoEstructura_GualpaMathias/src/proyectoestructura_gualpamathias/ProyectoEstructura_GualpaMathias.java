package proyectoestructura_gualpamathias;

import java.util.Scanner;

public class ProyectoEstructura_GualpaMathias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de cajas en el supermercado: ");
        int numCajas = scanner.nextInt();
        SuperMercado supermercado = new SuperMercado(numCajas);

        int opcion;
        do {
            System.out.println("\n Menú ");
            System.out.println("1. Adicionar nuevo producto al supermercado.");
            System.out.println("2. Visualizar stock de un producto específico o de todos.(Colas)");
            System.out.println("3. Adicionar nuevo cliente a la cola de una caja.");
            System.out.println("4. Atender cliente en una caja.");
            System.out.println("5. Visualizar estado de una cola específica o de todas.");
            System.out.println("6. Mostrar menú nuevamente.");
            System.out.println("7. Salir del sistema.");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el codigo del producto: ");
                    int codigoProducto = scanner.nextInt();
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombreProducto = scanner.next();
                    System.out.print("Ingrese el precio del producto: ");
                    double precioProducto = scanner.nextDouble();
                    Producto nuevoProducto = new Producto(codigoProducto,nombreProducto, precioProducto);
                    supermercado.agregarProducto(nuevoProducto);
                    System.out.println("Producto agregado al stock supermercado");
                    break;
                case 2:
                    System.out.print("Ingrese el codigo del producto para visualizar el stock (o -1 para todos): ");
                    int numProductoVisualizar = scanner.nextInt();
                    supermercado.mostrarStockProducto(numProductoVisualizar);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.next();
                    System.out.print("Ingrese la edad del cliente: ");
                    int edadCliente = scanner.nextInt();
                    Cliente nuevoCliente = new Cliente(nombreCliente, edadCliente);
                    System.out.print("Ingrese el número de la caja: ");
                    int numCajaCliente = scanner.nextInt();
                    supermercado.agregarCliente(numCajaCliente, nuevoCliente);
                    System.out.println("Cliente agregado a la cola en la caja " + numCajaCliente);
                    break;
                case 4:
                    System.out.print("Ingrese el número de la caja para atender al cliente: ");
                    int numCajaAtencion = scanner.nextInt();
                    supermercado.atenderCliente(numCajaAtencion);
                    break;
                case 5:
                    System.out.print("Ingrese el número de la caja para visualizar la cola: ");
                    int numCajaVisualizar = scanner.nextInt();
                    supermercado.mostrarEstadoColas(numCajaVisualizar);

                    break;
                case 6:
                    // No es necesario hacer nada aquí, simplemente se mostrará el menú nuevamente
                    break;
                case 7:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo nuevamente.");
            }
        } while (opcion != 7);
    }
}



   
