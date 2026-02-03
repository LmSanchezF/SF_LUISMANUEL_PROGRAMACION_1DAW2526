package Unidad5;

import java.util.Iterator;

public class desfragmentacion {

	static double numeros[]= {5.0, -1.0, 8.5, -1.0, 9.0, -1.0, 4.0};
	
	public static void main(String[] args) {
	mostrarArray();
	compactarArray();
	System.out.println();
	mostrarArray();
	}
	
	
	public static void compactarArray() {
		int destino=0;
		for (int i = 0; i < numeros.length;i++) {
			if(numeros[i]!=-1) {
				numeros[destino]=numeros[i];
				destino++;
		
				
			}
		
	}
		for(int j=destino; j< numeros.length;j++) {
			numeros[j]=-1;
			
		}
	}	
	public static void mostrarArray() {
		for (int i=0; i< numeros.length; i++) {
			System.out.print(numeros[i]+",");
				if(i!=numeros.length-1) {
				
				
			}
		}
	}

}
