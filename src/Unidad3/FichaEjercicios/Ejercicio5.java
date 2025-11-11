package Unidad3.FichaEjercicios;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
	int a;
	int b;
	Scanner teclado= new Scanner(System.in);
	System.out.println("Introduce el primer numero");
	a= teclado.nextInt();
	System.out.println("Introduce el segundo numero");
	b= teclado.nextInt();
	if(a>b) {
System.out.println(a+" Es mayor que" +b);
System.out.println("Su suma es" +(a+b));
	}

}
