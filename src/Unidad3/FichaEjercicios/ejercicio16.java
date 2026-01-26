package Unidad3.FichaEjercicios;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		int edadjubilacion = 67;
		int ahorrototal = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos años tienes");
		int edad = teclado.nextInt();
		int jubilacion = (edadjubilacion - edad);

		System.out.println(" Te quedan " + jubilacion + " años para jubilarte ");
		int ahorro = 0;
		do {
			System.out.println("Introduzca cuantos euros ahorra al año");
			ahorro = teclado.nextInt();
		} while (ahorro <= 0);
		for (edad = 0; edad < jubilacion; jubilacion--) {
			ahorrototal += ahorro;
			System.out.println("El ahorro actual es de" + ahorrototal);
		}

	}
}
