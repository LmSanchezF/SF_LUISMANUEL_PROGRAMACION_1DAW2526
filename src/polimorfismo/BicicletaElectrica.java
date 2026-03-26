package polimorfismo;

public class BicicletaElectrica extends  VehiculoElectrico {
	
	protected boolean tienePedales;

	
	public BicicletaElectrica(String marca, String modelo, int autonomia, int id, boolean tienePedales) {
		super(marca, modelo, autonomia, id);
		this.tienePedales=tienePedales;
		
	}


	@Override
	public void mostrarInformacion() {
		
		System.out.println("[Bicicleta Electrica]");
		super.mostrarInformacion();
		
		System.out.print(" - "+"Tiene pedales: "+tienePedales);
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
	
	


