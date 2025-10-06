package Unidad1;

public class Perro {
// Atributos
	String nombre;
	String raza;
	//Metodos
	public void ladrar() {
		System.out.println("Guau Guau");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro a1 = new Perro();
		a1.nombre = "Tao";
		a1.raza = "Boxer";
		Perro a2 = new Perro();
		a2.nombre = "Lua";
		a1.raza = "Collie";
		
		a1.ladrar();
		a2.ladrar();
	}

}
