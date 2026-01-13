package Unidad4.herenciaConstructores;


public class Persona {
protected String nombre;
protected int edad;

public Persona(String n,int e) {
this.nombre=n;
this.edad=e;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}


public void presentar() {
System.out.println("Hola mi nombre es" +nombre+ "y tengo" +edad+ "años");	
}
	
}
