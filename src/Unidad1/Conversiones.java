package Unidad1;

import java.util.Scanner;

public class Conversiones {
public static void main(String[] args) {
	 
		 // Conversión implícita
		 	int x = 7;
		 	double y = x; // int → double
		 System.out.println("Implícita: " + y);
		 // Conversión explícita
		 	double a = 7.85;
		 	int b = (int) a; // double → int
		 System.out.println("Explícita: " + b);
		 // char ↔ int
		 	char letra = 'C';
		 	int codigo = letra;
		 	System.out.println("Código de 'C': " + codigo);
		 	int num = 68;
		 	char letra2 = (char) num;
		 System.out.println("Letra del 68: " + letra2);
		 // Pérdida de datos
		 	int grande = 300;
		 	byte pequeño = (byte) grande;
		 	System.out.println("Conversión con pérdida: " + pequeño);
		 // Ejercicio 1
		 	int variable = 25;
		 	double variable2 = variable;
			System.out.println("Implícita: " + variable2);
		// Ejercicio 2
			double variable3= 19.99;
			int variable4 = (int) variable3;
			System.out.println("Explícita: " + variable3);
		// Ejercicio 3 (Pedir Letra al usuario)
			Scanner teclado = new Scanner (System.in);
			System.out.println("Introduce una letra ");
			letra = teclado.nextLine().charAt(0);
			codigo = letra;
			System.out.println("El codigo de la letra introducida es: " + codigo);
		// Ejercicio 4
			int variable5 = 1000;
			byte variable6 = (byte) variable5;
			System.out.println("Conversion: " + variable6);
		// Ejercicio 5
			int d = 3;
			float t = 2.5f;
			float c = d * t;
			System.out.println(c);
		
}			
}