package HolaMundoPersonalizado;

import java.util.Scanner;

public class SaludoPersonalizado {
	
	

	public static void main(String[] args) {
		
		String nombre = "";
		
		Scanner teclado= new Scanner(System.in);
	
		System.out.println("Introduce tu nombre: " +nombre);
	    nombre = teclado.nextLine();
	    System.out.println("Hola " +nombre);
	}

}
