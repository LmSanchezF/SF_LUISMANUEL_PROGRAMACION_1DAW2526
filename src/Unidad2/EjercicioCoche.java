package Unidad2;



public class EjercicioCoche {
	public static void main(String[] args) {
	/* 1. Crea una clase Coche con atributos marca y año. Define:
	 * 		o un constructor por defecto que asigne "Sin marca" y 2000.
	 * 		o un constructor con parámetros que inicialice ambos atributos.
	 * Escribe un programa que cree dos coches, uno con cada constructor, y muestre
	 * sus datos.
	 */
	
		Coche miPrimerCoche = new Coche();
		Coche miSegundoCoche = new Coche("Ferrari", 2025);
		Coche miTercerCoche= new Coche ("Suzuki");
		
		miPrimerCoche.mostrarCoche();
		
		miPrimerCoche.setAño(1665);
		miPrimerCoche.getAño();
		miSegundoCoche.mostrarCoche();
		miTercerCoche.mostrarCoche();	
		System.out.println(miPrimerCoche.getAño());
		
	}

}

