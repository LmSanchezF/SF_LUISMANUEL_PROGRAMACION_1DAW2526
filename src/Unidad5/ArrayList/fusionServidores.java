package Unidad5.ArrayList;

import java.util.ArrayList;

public class fusionServidores {

	public static void main(String[] args) {
		
		
		ArrayList<String> servidorA  = new ArrayList<>();
		
			servidorA.add("Juan");
			servidorA.add("Ana");
			servidorA.add("Pedro");
			servidorA.add("Luis");
		
		
		
		
		ArrayList<String> servidorB = new ArrayList<>();
			
			servidorB.add("Ana");
			servidorB.add("Maria");
			servidorB.add("Luis");
			servidorB.add("Sofia");
			
			
		ArrayList<String> servidorTotal  = new ArrayList<>();
		
			servidorTotal.addAll(servidorA);
			servidorTotal.addAll(servidorB);
			for (String elemento : servidorTotal) {
				System.out.println("Nombre "+elemento );
			}
			
			ArrayList<String> servidorAuxiliar  = new ArrayList<>();
			
			for (String elemento : servidorTotal) {
				if(!servidorAuxiliar.contains(elemento)) {
				servidorAuxiliar.add(elemento);
				
			}
				
				}
			System.out.println("Como quedaria la lista al final");
			servidorAuxiliar=servidorTotal;
			for (String nombre : servidorAuxiliar) {
				System.out.println("Nombre: "+nombre);
			
			
			
		

	}


	}
}
