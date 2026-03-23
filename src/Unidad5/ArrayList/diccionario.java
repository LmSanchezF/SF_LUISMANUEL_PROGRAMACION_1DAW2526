package Unidad5.ArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class diccionario {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		Map<String, String> diccionario= new HashMap<>();

		diccionario.put("Perro", "Dog");
		diccionario.put("Gato", "Cat");
		diccionario.put("Caballo", "Horse");
		diccionario.put("Cerdo", "Pig");
		diccionario.put("Pollo", "Chicken");
		
		System.out.println("Bienvenido al diccionario traductor");
		System.out.println("Preguntame que palabra quieres saber: ");
		System.out.println("Fin para terminar");
		String palabra="";
		String traduccion="";
		do {
			System.out.println("Palabra en español");
			palabra= teclado.nextLine();
			if(diccionario.containsKey(palabra)) {
				System.out.println("!diccionario.get(palabra)");
				System.out.println("En ingles se dice: " +diccionario.get(palabra));
		}else {
			System.out.println("No se traducir esa palabra dimelo tu");
			traduccion=teclado.nextLine();
			diccionario.put(palabra, traduccion);
			System.out.println("Gracias por enseñarme");
			
		}
		
	}while(!palabra.equalsIgnoreCase("fin"));
		
	}
		
	}


