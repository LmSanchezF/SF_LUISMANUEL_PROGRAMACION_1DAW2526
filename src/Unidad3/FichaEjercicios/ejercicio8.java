package Unidad3.FichaEjercicios;
import java.util.Scanner;
public class ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println(" Introduce un numero ");
		int numero= teclado.nextInt();
		int original= numero;
		int cifras=1;
		int inverso=0;
	
		
		while(numero>10) {
			inverso=(inverso*10)+numero%10;
			numero=numero/10;
			cifras++;
}
if(inverso == original) {
System.out.println("El numero es capicua.");
} else {
	System.out.println("El numero al reves es %d y por lo tanto es capicua");
}
	}
}




