package RepasoBucles;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {
		int numero;
		int cifras=0;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce un numero y te dire si es capicua");
		numero=teclado.nextInt();
		while(numero>=10) {
			numero=numero/10;
			cifras++;	
		}
		cifras++;
		System.out.println("El numero tiene: "+cifras+" cifras");
	}

	}


