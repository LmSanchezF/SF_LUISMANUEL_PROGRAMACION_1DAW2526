package polimorfismo;

public class PatineteElectrico extends VehiculoElectrico {
	
	protected int potenciaMotor;
	
	

	public PatineteElectrico(String marca, String modelo, int autonomia,int id, int potenciaMotor) {
		super(marca, modelo, autonomia, id);
		this.potenciaMotor = potenciaMotor;
	}

	@Override
	public void mostrarInformacion() {
		System.out.println("[Patinete Electrico]");
		super.mostrarInformacion();
		System.out.print(" - "+"La potencia del motor del patinete es de: " +potenciaMotor);
		System.out.println();

	}

	@Override
	public void cargar() {
		
		
		System.out.println("Cargando patinete electrico...");
	}

	public int getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(int potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	
	
	

}
