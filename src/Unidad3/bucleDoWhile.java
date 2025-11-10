package Unidad3;

import java.util.Scanner;

public class bucleDoWhile {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		int opcion;
		
		do {
		 System.out.print("Introduce n/ 1 para continuar o n/2 para salir") ;
		 opcion= teclado.nextInt();
		 
		} while (opcion!=2);
		System.out.println("Saliendo del menu...adios");

	}

}
