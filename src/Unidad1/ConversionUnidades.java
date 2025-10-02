package Unidad1;
import java.util.Scanner;
public class ConversionUnidades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner teclado = new Scanner(System.in);

	System.out.println("Introduce la temperatura en Celsius:");
	double celsius = teclado.nextDouble();
	
	double farenheit = (celsius*9/5)+32;
	System.out.printf("Equivalen a %.2f grados Farenheit.",farenheit);
	
	System.out.println();
	
	teclado.close();
	}
	

}
