package Unidad5.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;





public class ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		ArrayList<String>lista= new ArrayList<>();
		System.out.println("Bienvenido al programa Listado de nombres");
		
		
		
		do {
		System.out.println("Introduce un nombre");	
		lista.add(teclado.nextLine());
		
		}while (lista.size()<5);
		System.out.println("registrado");
		System.out.println("Ya tengo 5 nombres");
		System.out.println(lista);
		

		System.out.println("Dame una posicion");
		int posicion=0;
		String nombre="";
		posicion=teclado.nextInt();
		teclado.nextLine();
		System.out.println("Dame un nombre");
		nombre=teclado.nextLine();
		lista.add(posicion, nombre);
		
		System.out.println(lista.toString());
		
		System.out.println("Dame un nuevo nombre");
		lista.addFirst(teclado.nextLine());
		System.out.println(lista.toString());
		
		System.out.println("Elige una posicion para eliminarla");
		posicion=teclado.nextInt();
		lista.remove(posicion);
		System.out.println(lista.toString());
		
		
}
 
	
	
}