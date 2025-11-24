package Unidad3.Excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio2 {

	public static void leerEntero() {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce un numero");
		try {
			int numero=teclado.nextInt();
			int resultado = (numero);
			System.out.println("El numero elegido es: " + resultado);
			} catch (InputMismatchException e) {
			System.out.println("No ha introducido un numero");
			}finally {
			System.out.println("Ejecución finalizada (liberando recursos)");
			teclado.close();
			}	
		}
	
	public static void main(String[] args) {
	leerEntero();

	


	}
}
