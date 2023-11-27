package Practica5_gualpamathias;

import java.util.Scanner;//Importamos la librerias
import java.util.ArrayList;//Importamos la libreria

public class Practica5_GualpaMathias {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);	
        Competencia comp= new Competencia();//Instanciamos la clase Competencia 
	int opc;
        //Geneamos un menu de opciones  
	do {
            System.out.println("------------------------------------" );
            System.out.print("\nMenu");
            System.out.print("\n1 Registrar Atleta");
            System.out.print("\n2 Datos del campeón");
            System.out.print("\n3 Atletas por país");
            System.out.print("\n4 Tiempo promedio de todos los atletas");
            System.out.print("\n5 EliminarAtleta");
            System.out.print("\n6 MostrarTodoslosAtletas");
            System.out.print("\n7 Salir");
            System.out.print("\nSeleccione una opcion --> ");
            opc=scanner.nextInt();
            switch (opc) {
                case 1:
                    //Ingresamos los datos del atleta que se va a registrar 
                    System.out.print("Ingrese el nombre del atleta --> ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese la nacionalidad del atleta --> ");
                    String nacionalidad = scanner.next();
                    System.out.print("Ingrese el tiempo del atleta (En segundos) --> ");
                    double tiempo = scanner.nextDouble();
                    comp.registro(nombre, nacionalidad, tiempo);//Se lo guarda en un array Atleta 
                    break;
                case 2:
                    //Mostramos los datos del ganador
                    comp.mostrardatosganador();
                    break;
                case 3:
                    //Ingresamos el pais y mediante eso va ah buscar en el array los atletlas
                    //Que se registraron de ese pais 
                    System.out.print("Ingrese el nombre del país --> ");
                    String pais = scanner.next();
                    comp.mostraratletasPorPais(pais);//Muestra los atletas de ese pais
                    break;
                case 4:
                    //Calcula el promedio del tiempo de todos los atletas que se registraron
                    comp.promtiempo();
                    break;
                case 5:
                    //Ingresamos un nombre de un atleta para eliminarlo
                    //Puede ser el del princio del medio o del final
                    System.out.print("Ingrese el nombre del atleta a eliminar --> ");
                    String nombreEliminar = scanner.next();
                    comp.eliminarAtleta(nombreEliminar);//Busca en el array y lo elimina
                    break;
                case 6:
                    //Mostramos a todos los atletas
                    comp.mostrardatosatletas();
                    break;
                case 7:
                    //Opcion de salir
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opc != 7);
    }
}
           

