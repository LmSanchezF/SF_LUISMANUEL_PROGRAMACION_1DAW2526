package Unidad3.FichaEjercicios;

public class ejercicio15 {

	public static void main(String[] args) {
	//Aplicacion que muestra el crecimiento de una clase y el decrecimiento de otra hasta que coincidan
		
		
		
		int bovino=354000;
		int ovino=410000;
		int año=1;
		int comaños;
		System.out.println("Bienvenido al programa de conteo de ganado");
		do{
		System.out.println(" El crecimiento bovino es "+bovino);
		System.out.println(" El decrecimiento ovino es "+ovino);	
		bovino= (int)(bovino+bovino*0.01);
		ovino=(int)(ovino-ovino*0.015);
		comaños=año++;
		}while (bovino<=ovino);
		System.out.println(" Se tardan en equiparar las poblaciones " +comaños+" años ");
		}
		
	}




	
