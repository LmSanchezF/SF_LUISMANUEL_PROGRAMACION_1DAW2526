package Unidad3;
import java.util.Scanner;

public class factorialFor {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce un numero para calcular su factorial");
		int numero= teclado.nextInt();
		int factorial=1;
		
		for (int n = 1; n <= numero; n++) {
		factorial= factorial *n;
		teclado.close();
			} 
		System.out.println(" El factorial de " +numero+ " es igual a: " +factorial);
	}

}
