package polimorfismo;

public class PatineteElectrico extends VehiculoElectrico {
	
	protected int potenciaMotor;
	
	

	public PatineteElectrico(String marca, String modelo, int autonomia, int potenciaMotor) {
		super(marca, modelo, autonomia);
		this.potenciaMotor = potenciaMotor;
	}

	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		super.mostrarInformacion();
		System.out.println("La potencia del motor del patinete es de: " +potenciaMotor);

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
