package Unidad3.FichaEjercicios;
import java.util.Scanner;
public class pideNumeros {

	public static void main(String[] args) {
	int a;
	int b;
	Scanner teclado= new Scanner(System.in);
	
	System.out.println("introduce el primer numero");
	a= teclado.nextInt();
	System.out.println("introduce el segundo numero");
	b= teclado.nextInt();
	
 if(a>b) {
System.out.println(a+" Es mayor que " +b);
 }else if (a<b) {
System.out.println(a+ " Es menor que " +b);	
 }else if (a==b) {
System.out.println(a+" Es igual a " +b);
}
	}
}