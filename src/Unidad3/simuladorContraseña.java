package Unidad3;
import java.util.Scanner;
public class simuladorContraseña {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		String contraseña = "abracadabra";
		boolean acierto= false;
		int intentos= 0;
		
		while ((!acierto) && (intentos<4)) {
		System.out.println("Introduzca la contraseña");
		String palabra= teclado.nextLine();
		if (palabra.equalsIgnoreCase(contraseña)) {
		acierto=true;
		System.out.println("Has acertado!!!!" );
		break;
	}
			System.out.println("Has fallado! Intentalo otra vez: ");
			intentos++;
	}
System.out.println("F I N. ");
	}
}
