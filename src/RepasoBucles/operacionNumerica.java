package RepasoBucles;

import java.util.Scanner;

public class operacionNumerica {

	public static void main(String[] args) {
		int numeroUno;
		int numeroDos; 
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce el primero numero");
		numeroUno=teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		numeroDos=teclado.nextInt();
		if(numeroUno>numeroDos) {
		System.out.println(numeroUno+numeroDos);
		}else if(numeroUno==numeroDos) {
		System.out.println("Los numeros son iguales");	
		}else {
		System.out.println(numeroUno*numeroDos);	
		
		}

	}

}
