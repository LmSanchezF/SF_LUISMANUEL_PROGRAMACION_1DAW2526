package Unidad2;

public class CompararStrings {

	public static void main(String[] args) {
		String a = "hola";
		String b = new String("Hola");
		System.out.println(a == b); // probablemente false
		System.out.println(a.equalsIgnoreCase(b)); // true

		// Ejemplo utilizacion metodo estatico parseInt de la clase Integer
		// que convierte una cadena en numero entero
		int suma = Integer.parseInt("123") + 4;
		System.out.println("La suma es "+ suma);
		
	
	}

}
