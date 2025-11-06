package Unidad2;
import java.util.Scanner;
public class EjerciciosString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba una frase");
		String frase = sc.nextLine(); 
		System.out.println("Mayusculas "+ frase.toUpperCase());
		System.out.println("La longuitud de la frase es: " + frase.length()); 
		System.out.println("La primera letra es: "+frase.charAt(0));
		
		sc.close();
		
		 }
		

	}


