package Unidad1;

import java.util.Scanner;

public class ErrorSaltoLinea {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);

	System.out.print("Introduce tu edad: ");
	int edad = sc.nextInt();
	// Es necesario leer el salto de linea con otro nextline();
	// ya que el nextInt() solo lee el numero y no el salto de linea (\n)
	sc.nextLine();
	System.out.print("Introduce tu nombre: ");
	String nombre = sc.nextLine(); // <-- Error: se lee una línea vacía
	
	
}
}