package ejercicioPersona;

public class Persona {

	//Atributos
	String nombre;
	int edad;

	//Constructor
public Persona(String n, int e) {
	nombre = n;
	edad = e;
}

public Persona() {
	nombre = "Desconocido";
	edad = 0;
}




//Metodos
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

public void saludar() {
System.out.println(" Hola "+ nombre + " tienes " + edad + " años ");	
}

}