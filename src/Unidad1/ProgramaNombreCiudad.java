package Unidad1;
import java.util.Scanner;

public class ProgramaNombreCiudad {
public static void main(String[] args) {
Scanner sc= new	 Scanner(System.in);

// Ejercicio Nombre Ciudad
	System.out.print("Introduce tu nombre: ");
	String nombre = sc.nextLine();
	System.out.print("¿Cual es tu ciudad?: ");
	String ciudad = sc.nextLine();
	System.out.println("Hola "+nombre+",eres de " +ciudad);

	// Ejercicio Calculo Operaciones
	int x= 5, y= 10; 
	System.out.println("Suma:" +(x + y));
	System.out.println("Resta:"+ (x - y));
	System.out.println("Multiplicacion:" + (x * y));
	System.out.println("Division:" + (x / y));
	
}
}