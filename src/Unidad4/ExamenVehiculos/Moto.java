package unidad4;

public class Moto extends Vehiculo {
protected int cilindrada;
protected String tipo;

public Moto(String marca, int velocidadMaxima, int cilindrada, String tipo) {
super(marca, velocidadMaxima);
this.cilindrada=cilindrada;
this.tipo=tipo;
}

@Override
public void mostrarDatos() {
super.mostrarDatos();
System.out.println("La cilindrada de la moto es de " +cilindrada);
System.out.println("la moto es del tipo "+tipo);
}
public void arrancar(Boolean caballete) {
if(caballete==true) {
System.out.println("No se puede arrancar la moto con el caballete puesto");	
}if(caballete!=true) {
System.out.println("La moto ha arrancado correctamente");	
}
}


	
	
	
}
