package Unidad3.FichaEjercicios;
import java.util.Scanner;
public class programaNumeros {

	public static void main(String[] args) {
	int numero;
	Scanner teclado= new Scanner(System.in);
	System.out.println("Introduce un numero para determinar si es par o impar");
	numero=teclado.nextInt();
	if (numero %2!=0) {
	System.out.println("El numero introduido es impar");
	} else  {
		System.out.println("El numero introduido es par");

	}

	}
}