package polimorfismo;

public class BicicletaElectrica extends  VehiculoElectrico {
	
	protected boolean tienePedales;

	
	public BicicletaElectrica(String marca, String modelo, int autonomia, boolean tienePedales) {
		super(marca, modelo, autonomia);
		
	}


	@Override
	public void mostrarInformacion() {
		
		super.mostrarInformacion();
		
		System.out.println("Tiene pedales"+tienePedales);
	}


	public boolean isTienePedales() {
		return tienePedales;
	}


	public void setTienePedales(boolean tienePedales) {
		this.tienePedales = tienePedales;
	}


	@Override
	public void cargar() {
	
		
		
		System.out.println("Cargando bicicleta electrica");
	}

	
	
	
	}
	
	


