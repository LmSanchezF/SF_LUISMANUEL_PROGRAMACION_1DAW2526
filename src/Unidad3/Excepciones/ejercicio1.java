package Unidad3.Excepciones;
import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
Scanner teclado= new Scanner(System.in);
System.out.println("Introduce un numero");
int numero1=teclado.nextInt();
System.out.println("Introduce un segundo numuero");
int numero2=teclado.nextInt();

try {
 int resultado = (numero1/numero2);
 System.out.println("Resultado: " + resultado);
} catch (ArithmeticException e) {
 System.out.println("Division no valida");
}finally {
System.out.println("Ejecución finalizada (liberando recursos)");
teclado.close();
}

	}
}
