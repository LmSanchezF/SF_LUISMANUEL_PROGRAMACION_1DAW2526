package RepasoBucles;

import java.util.Scanner;

public class numeroDigitos {

	public static void main(String[] args) {
		int numero;
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce un numero");
		numero=teclado.nextInt();
		if(numero<=9) {
		System.out.println("El numero introducido tiene una cifra");
		}else if(numero>=9 && numero<=99) {
		System.out.println("El numero introducido tiene dos cifras");
		}else {
		System.out.println("el numero introducido no es valido");	
		}
		

	}

}
