package UT05.ExpresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionDni {
	
	
	
	public boolean esDniValido(String dni) {
	    // ^ y $ aseguran que no haya nada más antes ni después
	    return dni.matches("^\\d{8}[A-Za-z]$"); 
	}
	
public static void main (String[]args) {
	
	System.out.println("Introduce tu dni");
	Scanner teclado= new Scanner(System.in);
	String dni= teclado.nextLine();
	
	
	
	
	if(esDniValido(dni)) {
		System.out.println("El dni tiene el formato correcto");
		
	}else {
		System.out.println("Error, el formato del dni no es valido");
	}
	
	
}
}
