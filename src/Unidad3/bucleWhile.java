package Unidad3;

import java.util.Scanner;

public class bucleWhile {


	// TODO Auto-generated method stub
	public static void main(String[] args) {
		
		int suma=0;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dame numeros y calculare la suma total. " + "(para terminar introduce un 0):");
		int numero= teclado.nextInt();
		while (numero!=0) {
		suma= suma+numero;
		numero= teclado.nextInt();
	} 
		System.out.println("La suma de todos los numeros introducidos es: "+suma);
	}
}


