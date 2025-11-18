package Unidad3.FichaEjercicios;
import java.util.Scanner;
public class ejercicio10 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	System.out.println("Introduce una nota del 1 al 10");
	int nota=teclado.nextInt();
	if(nota<=4) {
	System.out.println("Insuficiente");
	}else if(nota==5) {
		System.out.println("Suficiente");
	}else if(nota==6) {
		System.out.println("Bien");
	}else if(nota<=7 || nota<9) {
		System.out.println("Notable");
	}else if(nota==9 || nota==10) {
		System.out.println("Sobresaliente");

}
	}
}
