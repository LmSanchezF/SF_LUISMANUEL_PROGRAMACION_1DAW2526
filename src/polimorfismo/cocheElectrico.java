package polimorfismo;

public class cocheElectrico extends VehiculoElectrico {
	
	protected int numeroPlazas;

	public cocheElectrico(String marca, String modelo, int autonomia, int numeroPlazas) {
		super(marca, modelo, autonomia);
		
	}

	@Override
	public void mostrarInformacion() {
		
		super.mostrarInformacion();
		System.out.println("El coche dispone de " + numeroPlazas + "plazas");
	}

	@Override
	public void cargar() {
		
		System.out.println("Cargando coche electrico...");
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}

	
	
}

