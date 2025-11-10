package Unidad3;
import java.util.Scanner;
public class contadorLetras {

	public static void main(String[] args) {
	
	Scanner teclado= new Scanner(System.in);
	int contador=0;
	System.out.println("Introduce una palabra");
	String palabra=teclado.nextLine();
	for (int i=0; i<palabra.length(); i++) {
	 if(palabra.charAt(i)=='a' || palabra.charAt(i)=='A'){
		 contador++;
	}

}
	System.out.println(" La letra 'a' se repite " +contador+ " veces.");
	}
}
