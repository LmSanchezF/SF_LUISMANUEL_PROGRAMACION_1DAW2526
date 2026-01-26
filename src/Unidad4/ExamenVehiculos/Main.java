package unidad4;

public class Main {

	public static void main(String[] args) {
	Vehiculo v1= new Vehiculo("Opel Astra",180,true);
	Vehiculo v2= new Vehiculo("BMW Serie 1");
	Coche miCoche= new Coche("Seat ibiza",170, false,5,false,"llave");
	Moto miMoto= new Moto ("Kawasaki ninja",300,1000,"Deportiva");
	v1.setEnMarcha(false);
	v2.setMarca("Audi A3");
	miCoche.setVelocidadMaxima(190);
	miMoto.setMarca("Honda CBR");
	v1.mostrarDatos();
	v2.mostrarDatos();
	miCoche.mostrarDatos();
	miMoto.mostrarDatos();
	v1.arrancar();
	miMoto.arrancar(true);
	miMoto.arrancar(false);
	
	
	//v1.vehiculoMasRapido(v1,miMoto);
	
	Vehiculo rapido = Vehiculo.vehiculoMasRapido(v1, miMoto);
	System.out.println("El más rapido es: ");
	rapido.mostrarDatos();
	}

}
