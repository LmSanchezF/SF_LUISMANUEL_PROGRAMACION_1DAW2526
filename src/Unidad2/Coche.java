package Unidad2;

public class Coche {

	//Atributos
	String marca;
	int año;
	
	public Coche() {
		marca="Sin marca";
		año=2000;
	}
	
	public Coche(String m, int a) {
		marca = m;
		año = a;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public Coche(String m) {
		marca = m;
		año = 2000;
	}
	
	public void mostrarCoche() {
		System.out.println("La marca de este coche es: "+marca+", matriculado en el año "+año);
	}
	
	
	
}	



	


