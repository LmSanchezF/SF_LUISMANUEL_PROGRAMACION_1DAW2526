package Unidad5;

public class inversorNombres {

	public static void main(String[] args) {
		int orden;
		int inverso;
		String[] nombres= new String [5];
		nombres[0]="Miguel";
		nombres[1]="Jose";
		nombres[2]="David";
		nombres[3]="Andres";
		nombres[4]="Nacho";
		
		for(int i=0; i < nombres.length; i++  ) {
		System.out.println("La posicion es " +i+ " y el nombre es "+nombres[i]);	
		}
		System.out.println("Segundo bucle");
		
		for(int i=nombres.length-1; i>=0; i--  ) {
		System.out.println("La posicion es " +i+ " y el nombre es "+nombres[i]);	
		}





		

	}

}
