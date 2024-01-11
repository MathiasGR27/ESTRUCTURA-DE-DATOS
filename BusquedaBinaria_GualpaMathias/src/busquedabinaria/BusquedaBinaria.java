package busquedabinaria;

import javax.swing.JOptionPane;

public class BusquedaBinaria {

    public static void main(String[] args) {
        // Pedir el tamaño del arreglo
        int tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));

        // Declarar el arreglo con el tamaño ingresado
        int arreglo[] = new int[tamano];
        int arregloOrdenado[] = new int[tamano]; // Nuevo arreglo para almacenar la versión ordenada del arreglo original

        // Pedir los valores del arreglo
        for (int i = 0; i < tamano; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para la posición " + i));
        }

        // Copiar el arreglo original al arregloOrdenado
        System.arraycopy(arreglo, 0, arregloOrdenado, 0, tamano);

        // Ordenar el arregloOrdenado utilizando el algoritmo de burbuja
        for (int i = 0; i < tamano - 1; i++) {
            for (int j = 0; j < tamano - i - 1; j++) {
                if (arregloOrdenado[j] > arregloOrdenado[j + 1]) {
                    // intercambiar arregloOrdenado[j] y arregloOrdenado[j + 1]
                    int temp = arregloOrdenado[j];
                    arregloOrdenado[j] = arregloOrdenado[j + 1];
                    arregloOrdenado[j + 1] = temp;
                }
            }
        }

        // Mostrar el arreglo original
        System.out.println("Arreglo original:");
        for (int i = 0; i < tamano; i++) {
            System.out.print(arreglo[i] + " ");
        }

        // Mostrar el arregloOrdenado
        System.out.println("\nArreglo ordenado:");
        for (int i = 0; i < tamano; i++) {
            System.out.print(arregloOrdenado[i] + " ");
        }

        // Pedir el número a buscar
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a buscar"));

        // Código de búsqueda binaria en el arregloOrdenado
        int infe = 0;
        int sup = tamano;
        int mitad;
        boolean bandera = false;

        while (infe < sup) {
            mitad = (infe + sup) / 2;

            if (arregloOrdenado[mitad] == dato) {
                bandera = true;
                break;
            } else if (arregloOrdenado[mitad] > dato) {
                sup = mitad;
            } else {
                infe = mitad + 1;
            }
        }

        if (bandera) {
            JOptionPane.showMessageDialog(null, "El numero " + dato + " del arreglo ordenado se encuentra en la posición " + infe);
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + dato + " no se encuentra en el arreglo ordenado");
        }
    }
}