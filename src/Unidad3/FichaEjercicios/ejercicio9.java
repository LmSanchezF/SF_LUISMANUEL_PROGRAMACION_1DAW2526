package Unidad3.FichaEjercicios;
import java.util.Scanner;
public class ejercicio9 {

	public static void main(String[] args) {
	int nota1;
	int nota2;
	int nota3;
	Scanner teclado= new Scanner (System.in);
	
	System.out.println("Introduce la primera nota");
	nota1= teclado.nextInt();
	System.out.println("Introduce la segunda nota");
	nota2= teclado.nextInt();
	System.out.println("Introduce la tercera nota");
	nota3= teclado.nextInt();
	if(nota1+nota2+nota3%3>=7) {
	System.out.println("Promociona");	
	}else if(nota1+nota2+nota3%3<7) {
	System.out.println("No promociona");	
	}
	}

}
