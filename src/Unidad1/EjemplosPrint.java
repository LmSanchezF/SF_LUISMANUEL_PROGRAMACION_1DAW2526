package Unidad1;

public class EjemplosPrint {
public static void main(String[] args) {
		 
	// Ejemplo Printf con numeros enteros y salto de linea.
		System.out.print("Hola ");
		System.out.println("mundo");
		System.out.printf("La mitad de %d es %d y suman %d : \n",42,21,63);
		System.out.print("\nFIN");
		
	// Ejemplo de Printf con numeros double	
		Double precio = 5.75;
		System.out.printf("%-7s %-5.2f","\nel precio es:",precio);
		System.out.printf("\nel precio es: %f",precio);
		System.out.printf("\nel precio es: %f",precio);
	
}
}