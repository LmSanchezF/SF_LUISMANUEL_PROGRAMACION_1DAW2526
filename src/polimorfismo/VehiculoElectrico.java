package polimorfismo;

public class VehiculoElectrico {
	
protected String marca;

protected String modelo;
	
protected int autonomia;


public VehiculoElectrico(String marca, String modelo, int autonomia) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.autonomia = autonomia;
}

public void mostrarInformacion() {
	
	System.out.println("El vehiculo es de la marca: "+marca);
	
	System.out.println("El modelo es : "+modelo);
	
	System.out.println("La autonomia del vehiculo es de : "+autonomia);
		
}

public void cargar() {
	
	System.out.println("Cargando vehiculo electrico...");
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public int getAutonomia() {
	return autonomia;
}

public void setAutonomia(int autonomia) {
	this.autonomia = autonomia;
}

}
