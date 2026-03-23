package Unidad5.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class listaCompra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> productos= new ArrayList<>(); 
		String producto="";
		int opcion=0;
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Bienvenido al programa lista de la compra");
		do {
			System.out.println("Elija una opcion");
			System.out.println("1.Añadir producto");
			System.out.println("2.Imprimir lista de la compra");
			
			opcion=teclado.nextInt();
			if (opcion==1) {
				System.out.println("Introduzca el articulo");
			producto=teclado.next();	
			}else {
				System.out.println(productos);
	} 
			
		
			
		}while (!producto.equalsIgnoreCase("fin"));
		
		System.out.println("Saliendo de la aplicacion");
		
		

		

}
	
}
