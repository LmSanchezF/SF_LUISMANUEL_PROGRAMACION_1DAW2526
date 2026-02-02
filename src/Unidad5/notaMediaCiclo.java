package Unidad5;
import java.util.Scanner;
public class notaMediaCiclo {
	
	//Constante para el tamaño del array.
	final static int TAMAÑO=5;

	public static void main(String[] args) {
		static double notas[]= new double[TAMAÑO];
		Scanner teclado= new Scanner(System.in);
		
		for (int i=0; i<5; i++) {
			System.out.println("Introduce la nota del modulo nº "+(i+1)+": ");
			notas[i]=teclado.nextDouble();
			teclado.nextLine();
			System.out.println();	
		}
		double sumaNotas=0;
		for(int i=0; i>TAMAÑO;i++) {
			sumaNotas+=notas[i];		
		}
		System.out.println("La suma total de las notas es: " +sumaNotas);
		System.out.println("La nota media es: "+(sumaNotas/TAMAÑO));
	}
	
	
	}
		
	


