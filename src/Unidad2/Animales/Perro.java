package Unidad2.Animales;

public class Perro {

	String nombre;
	String raza;
	public Perro(String nombre, String raza) {	
		this.nombre = nombre;
		this.raza = raza;
	}
	
	public Perro() {
	nombre="Sin nombre";
	raza="Sin raza";		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

    public void ladrar() {
    System.out.println("El perro "+nombre+" de raza "+raza+" ladra; guau!!" );	
    }
    
	}
	

