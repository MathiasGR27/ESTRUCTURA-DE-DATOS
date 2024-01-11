package BusquedaSecuencial;

import javax.swing.JOptionPane;


public class BusquedaSecuencial {
    
        public static void main(String[] args) {
        int dato;
        int arr;
        boolean bandera = false; // Se inicializa en false porque aún no se encuentra el número
        arr = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del arreglo: "));

        int arreglo[] = new int[arr]; // Crear arreglo con longitud ingresada por el usuario

        // Pedir al usuario que ingrese los elementos del arreglo
        for (int i = 0; i < arr; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1) + " del arreglo: "));
        }
        
        // Mostrar el arreglo original
        System.out.println("Arreglo original:");
        for (int i = 0; i < arr; i++) {
            System.out.print(arreglo[i] + " ");
        }

        // Ordenar el arreglo utilizando el algoritmo de burbuja
        for (int i = 0; i < arr - 1; i++) {
            for (int j = 0; j < arr - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
            // intercambiar arreglo[j] y arreglo[j + 1]
            int temp = arreglo[j];
            arreglo[j] = arreglo[j + 1];
            arreglo[j + 1] = temp;
                }
            }
        } 
        // Mostrar el arreglo ordenado
        System.out.println("\n Arreglo ordenado:");
        for (int i = 0; i < arr; i++) {
            System.out.print(arreglo[i] + " ");
        }
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a buscar "));
        
        // Código de búsqueda secuencial en el arreglo ordenado
        int i = 0;
        while (i < arr && !bandera) {
            if (arreglo[i] == dato) {
        bandera = true;
            }
            i++;
        }
        
        if (!bandera) {
        // Mensaje si no se encuentra
        JOptionPane.showMessageDialog(null, "El número no se encontró en el arreglo ");
        } else {
            JOptionPane.showMessageDialog(null, "El número se encontró en el arreglo en la posición: " + (i - 1));
        }
    }
}
