package Unidad4;

public class MovimientoVehiculo {

	public static void main(String[] args) {
	
		Coche c= new Coche();
		Bicicleta b= new Bicicleta();
		
		c.acelerar();
		c.frenar();
		b.acelerar();
		b.frenar();
		c.abrirPuertas();
		c.cerrarPuertas();
		
	}

}
