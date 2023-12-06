/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6_gualpamathias;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ESPE
 */
public class MenuLibros {
    String Titulo,Autor;
    int añoEdicion;
    int opc,num;
    Scanner scanner = new Scanner(System.in);
    IngresoLibro lib = new IngresoLibro();//Instanciamos 
    public void menu(){
        do{
            
            System.out.println("==MENU==");
            System.out.println("1. Registrar Libros ");
            System.out.println("2. Mosrar Libros en el ecritorio si hay o no hay libros");
            System.out.println("3. Regalar libros de pila ");
            System.out.println("4. Guardar libro en biblioteca en orden alfabetico");
            System.out.println("5. Modificar libro");
            System.out.println("6. Guardar libros en ficheros");
            System.out.println("7. Buscar libros por rango de fecha y mostrar");
            System.out.println("8. Salir");
            opc=scanner.nextInt();
            scanner.nextLine();
            switch(opc){
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el año de edición del libro: ");
                    int anoEdicion = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    lib.agregarLibro(new Libros(titulo, autor, anoEdicion));
                    break;
                case 2:
                    lib.mostrarlibros();
                    break;
                case 3:
                    lib.regalarLibrosAnterioresA2020();
                    lib.mostrarLibrosRegalados();
                    break;
                case 4:
                    lib.guardarLibros();
                    lib.mostrarLibrosOrdenados();
                    break;
                case 5:
                      System.out.print("Ingrese el título del libro a modificar: ");
                      String tituloModificar = scanner.nextLine();
                      lib.modificarInformacionLibro(tituloModificar);
               break;
                case 6:
                
                System.out.print("Ingrese el nombre del archivo para guardar en formato TXT: ");
                String nombreArchivoTXT = scanner.nextLine();lib.guardarEnArchivoTXT(nombreArchivoTXT);
                break;
                case 7:
                    System.out.print("Ingrese el año de inicio del rango: ");
                    int anioInicio = scanner.nextInt();
                    System.out.print("Ingrese el año de fin del rango: ");
                    int anioFin = scanner.nextInt();
                    lib.buscarLibrosPorRangoAnios(anioInicio, anioFin);
                    break;
                    
                case 8:
                   // lib.buscarLibrosPorRangoAnios(anioInicio, anioFin);
                   
                    break;
                case 9:
                    //Opcion de salir
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }while(opc!=8);
    }
}

