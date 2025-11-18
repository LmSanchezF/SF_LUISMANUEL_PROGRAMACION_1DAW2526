package Unidad3.FichaEjercicios;
import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[] args) {
	int n;
	Scanner teclado= new Scanner(System.in);
	System.out.println("Introduce un numero");
	n= teclado.nextInt();
	if(n<0) {
System.out.println("El numero introducido es negativo");	
	}else if (n>=99) {
System.out.println("El numero introducido tiene dos cifras");
	}else if (n<=9) {
System.out.println("El numero introducido es tiene una cifra");		
}
}
}