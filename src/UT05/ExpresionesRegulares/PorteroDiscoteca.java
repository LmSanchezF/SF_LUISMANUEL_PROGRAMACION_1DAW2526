package UT05.ExpresionesRegulares;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PorteroDiscoteca {
	Scanner teclado= new Scanner(System.in);

	public static boolean esNumeroBinario(String numero) {
		
	return (numero.matches("^\\d[0-1].$"));
	}

	public static void main(String[] args) {
		
		String regex="^\\d[0-1]+$";
		
		Pattern pattern = Pattern.compile(regex);
       
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce un numero binario");
		String numero=teclado.nextLine();
		
		Matcher matcher = pattern.matcher(numero);
		if(esNumeroBinario(numero)) {
			System.out.println("El numero es binario");
			
		}else {
			System.out.println("El numero no es binario");
		}
	}

}
