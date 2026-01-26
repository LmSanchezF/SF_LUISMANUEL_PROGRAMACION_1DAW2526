package RepasoBucles;

import java.util.Scanner;

public class contarCifras {

	public static void main(String[] args) {
		int numero;
		int cifras=0;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce un numero");
		numero=teclado.nextInt();
		while(numero>=10) {
			numero=numero/10;
			cifras++;	
		}
		cifras++;
		System.out.println("El numero tiene: "+cifras+" cifras");
	}

}
