package RepasoBucles;

import java.util.Scanner;

public class numeroParImpar {

	public static void main(String[] args) {
		int numero;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce un numero");
		numero=teclado.nextInt();
		if(numero %2!=1) {
		System.out.println("El numero es par");
		}else {
		System.out.println("El numero es impar");	
		}
	}

}
