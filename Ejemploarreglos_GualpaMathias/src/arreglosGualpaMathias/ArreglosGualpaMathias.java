package arreglosGualpaMathias;

import java.util.Scanner;

public class ArreglosGualpaMathias {
	
	public static void main(String[] args) {
		
		int[] numeros = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		
		int opc;
		
		do {
			System.out.print("\nMenu");
			System.out.print("\n1 Ingresar y Mostrar arreglo en orden de entrada");
			System.out.print("\n2 Mostrar arreglo a revez");
			System.out.print("\n3 Media de positivo,negativos y total numeros de ceros");
			System.out.print("\n4 Salir");
			System.out.print("\nSeleccione una opcion : ");
			opc=scanner.nextInt();
			switch(opc) {
			case 1:
				ingresonum(numeros , scanner);
				mostrarnum("Numeros ingresado en el orden de entrada :", numeros);
				break;
			case 2:
				mostrarnuminv("Numeros ingresado en el orden de entrada :", numeros);
				break;
			case 3:
				sacarmediaynumceros(numeros);
			   break;
			case 4:
				System.out.print("\nSaliendo del programa ");
				break;
				default:
					System.out.print("\nOpcion incorrecta");
				   break;
			
			}
		}while(opc !=4);
	}
		//Ingresa los numeros y los guarda en un arreglo
		private static void ingresonum(int[] numeros, Scanner scanner) {
			for(int i=0;i<5;i++) {
				System.out.println("Ingrese el numero"+(i+1)+":" );
				numeros[i]=scanner.nextInt();
				}
		}
		//Muestra los numeros del arreglo en el orden que se ingreso
		private static void mostrarnum(String mensaje ,int[] numeros) {
				System.out.print("Numeros ingresados en el siguiente orden:");
				for(int i=0;i<5; i++) {
					System.out.println("\n"+numeros[i] );
				
				}
				System.out.print("---------------------------------------------------");
		}
		//Sirve para mostrar los numeros ingresados inversamente
		private static void mostrarnuminv(String mensaje ,int[] numeros) {
			System.out.print("Numeros ingresados en el siguiente orden:");
			for(int i=numeros.length - 1;i >=0; i--) {
				System.out.println("\n"+numeros[i] );
			}
			System.out.print("---------------------------------------------------");
	}
		private static void sacarmediaynumceros(int[] numeros) {
			//Se realiza unos contadores
			int sumap=0;
			int suman=0;
			int contarc=0;
			int contarp=0;
			int contarn=0;
			//Para sacr los positivos , negativos y ceros
			for(int numero:numeros) {
				if(numero >0) {
					sumap +=numero;
					contarp ++;
				}else if (numero<0) {
					suman +=numero;
					contarn ++;
				}else {
					contarc ++;
				}
			}
			//Se calcula la media de los positivos y la de negativos
			System.out.print("---------------------------------------------------");
			if(contarp >0) {
				double mediap=(double) sumap/contarp;
				System.out.print("\nLa media de los positivos es : "+mediap);
			}
			System.out.print("\n---------------------------------------------------");
			if(contarn >0) {
				double median=(double) suman/contarn;
				System.out.print("\nLa media de los negativos es : "+median);
			}
			System.out.print("\n---------------------------------------------------");
			
			System.out.print("\nLos totales de ceros es : "+contarc);
			
			System.out.print("\n---------------------------------------------------");
	}
		
}	
		
	


