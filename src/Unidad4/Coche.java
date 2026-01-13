package Unidad4;

public class Coche extends Vehiculo {

	@Override
	public void acelerar() {
	System.out.println(" El coche acelera"+velocidadMas);
	}

	@Override
	public void frenar() {
	System.out.println(" El coche frena");
	}
	public void abrirPuertas() {
	System.out.println(" El coche abre sus puertas");	
	}
	public void cerrarPuertas() {
	System.out.println(" El coche cierra sus puertas");	
	}


}
