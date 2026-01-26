package RepasoBucles;

import java.util.Scanner;

public class numeroMayor {

	public static void main(String[] args) {
		int numeroUno;
		int numeroDos;
		Scanner teclado=new Scanner(System.in);
			System.out.println("Introduzca el primer numero");
			numeroUno=teclado.nextInt();
			System.out.println("Introduzca el segundo numero");
			numeroDos=teclado.nextInt();
			if(numeroUno>numeroDos) {
			System.out.println(" El numero mayor es: " +numeroUno);
			}else if(numeroUno==numeroDos) {
			System.out.println("Los numeros son iguales");
			}else {
			System.out.println(" El numero mayor es: " +numeroDos);	
		}	
	

	}

}
