package polimorfismo;

public class VehiculoElectrico {
	
protected String marca;

protected String modelo;
	
protected int autonomia;

protected int id;


public VehiculoElectrico(String marca, String modelo, int autonomia, int id) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.autonomia = autonomia;
	this.id=id;
}

public void mostrarInformacion() {
	System.out.println();
	
	System.out.print("El vehiculo es de la marca: "+marca+ " - ");
	
	System.out.print(" - "+"El modelo es : "+modelo);
	
	System.out.print(" - "+"La autonomia del vehiculo es de : "+autonomia);
		
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
