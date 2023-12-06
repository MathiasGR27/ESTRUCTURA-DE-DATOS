/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6_gualpamathias;

import java.io.*;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;
/**
 *
 * @author ESPE
 */
public class IngresoLibro {
         private List<Libros> pilaLibros = new ArrayList<>();
         private List<Libros> libregalados = new ArrayList<>();
         
         private List<Libros> lib = new ArrayList<>();

         public void agregarLibro(Libros libro) {
             pilaLibros.add(libro);
         }
         
        public void mostrarlibros(){
        if (pilaLibros.isEmpty()) {//Si no hay libros arroga un mensaje
            System.out.println("No hay libros en el escritorio esta vacio ");//Este mensaje
            return;
        }
        System.out.println("Todos los Libros en el escritorio son :");
        for ( Libros libro : pilaLibros){ //Muestra todos los libros con todos sus datos
        System.out.println("------------------------------------" );
        System.out.println("Titulo : " +libro.Titulo );
        System.out.println("Autor : " +libro.Autor);
        System.out.println("Año de Edicion : " +libro.anioEdicion);  
        }    
    }

         public void regalarLibrosAnterioresA2020() {
             pilaLibros.removeIf(libro -> libro.getAnioEdicion() < 2020);
             System.out.println("Libros regalado a un estudiante");
             libregalados.addAll(pilaLibros);
             pilaLibros.clear();
         }

         public void guardarLibros() {
             // Filtrar y guardar libros mayores de 2000 en la biblioteca
           List<Libros> librosMayoresDe2000 = pilaLibros.stream()
                   .filter(libro -> libro.getAnioEdicion() > 2000)
                   .collect(Collectors.toList());

           lib.addAll(librosMayoresDe2000);
           pilaLibros.removeAll(librosMayoresDe2000);
       }

       public void mostrarLibrosOrdenados() {
           // Mostrar libros en la biblioteca ordenados alfabéticamente
           Collections.sort(lib, Comparator.comparing(Libros::getTitulo));

           System.out.println("Libros en la biblioteca ordenados alfabéticamente:");
           lib.forEach(libro -> {
               System.out.println("------------------------------------");
               System.out.println("Titulo: " + libro.getTitulo());
               System.out.println("Autor: " + libro.getAutor());
               System.out.println("Año de Edicion: " + libro.getAnioEdicion());
           });
       }

       public void mostrarLibrosRegalados() {
           // Mostrar libros regalados
           System.out.println("Libros regalados:");
           libregalados.forEach(libro -> {
               System.out.println("------------------------------------");
               System.out.println("Titulo: " + libro.getTitulo());
               System.out.println("Autor: " + libro.getAutor());
               System.out.println("Año de Edicion: " + libro.getAnioEdicion());
           });
       }


       public int contarLibrosRegalados() {
           // Contar libros regalados
           int cantidadLibrosRegalados = libregalados.size();
           System.out.println("Cantidad total de libros regalados: " + cantidadLibrosRegalados);
           return cantidadLibrosRegalados;
       }

       public void modificarInformacionLibro(String titulo) {
 
    }

    public void guardarEnArchivoTXT(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Libros libro : lib) {
                writer.write(libro.getTitulo() + ";" + libro.getAutor() + ";" + libro.getAnioEdicion() + "\n");
            }
            System.out.println("Información guardada en formato TXT correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar la información en formato TXT.");
            e.printStackTrace();
        }
    }

    public void buscarLibrosPorRangoAnios(int anioInicio, int anioFin) {
        System.out.println("Libros en el rango de años " + anioInicio + " a " + anioFin + ":");
        lib.stream()
                .filter(libro -> libro.getAnioEdicion() >= anioInicio && libro.getAnioEdicion() <= anioFin)
                .forEach(libro -> {
                    System.out.println("------------------------------------");
                    System.out.println("Titulo: " + libro.getTitulo());
                    System.out.println("Autor: " + libro.getAutor());
                    System.out.println("Año de Edicion: " + libro.getAnioEdicion());
           }
        );
    }
}

   

   



