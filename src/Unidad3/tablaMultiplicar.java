package Unidad3;
import java.util.Scanner;
public class tablaMultiplicar {

	public static void main(String[] args) {
int numero;	
Scanner teclado= new Scanner(System.in);
System.out.println("Introduce un numero para mostrar su tabla de multiplicar");
numero=teclado.nextInt();
for(int i=1; i<=10; i++) {
System.out.println(" La tabla de multiplicar del" +numero+ "es la siguiente: ");
System.out.println(numero+" x " +i+ " es igual " +numero*i);

}



	}

}
