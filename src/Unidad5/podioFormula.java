package Unidad5;

public class podioFormula {

	public static void main(String[] args) {
	String[] pilotos= new String [3];
	pilotos[0]= "Schumacher";
	pilotos[1]= "Alonso";
	pilotos[2]= "Vettel";

	System.out.println("El ganador es " +pilotos[0]);
	System.out.println("El tercero es " +pilotos[2]);
	
	try {
		System.out.println(pilotos[3]);
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Ha intentado acceder a una posicion que no existe");
	}
	}

}
