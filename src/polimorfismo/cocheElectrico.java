package polimorfismo;

public class cocheElectrico extends VehiculoElectrico {
	
	protected int numeroPlazas;

	public cocheElectrico(String marca, String modelo, int autonomia,int id, int numeroPlazas) {
		super(marca, modelo, autonomia, id);
		this.numeroPlazas= numeroPlazas;
	}

	@Override
	public void mostrarInformacion() {
		System.out.println("[Coche Electrico]");
		super.mostrarInformacion();
		System.out.print(" - " +"El coche dispone de " +numeroPlazas+" plazas");
		System.out.println();
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

