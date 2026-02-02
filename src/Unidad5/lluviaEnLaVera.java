package Unidad5;

public class lluviaEnLaVera {

	public static void main(String[] args) {
		
		//Declaracion de un array en una linea con valores
		double cantidadLluvia[] = {12.5, 0.0, 3.2, 8.9, 5.0, 6.6, 8.4};
		
		
		System.out.println("El miercoles llovio " +cantidadLluvia[2] +"litros");
		
		//Modificamos el array el valor de la posicion 4 (viernes)
		cantidadLluvia[4]=45.0;
		
		System.out.println("El viernes llovio " +cantidadLluvia[4] +"litros");
			
		}

	}


