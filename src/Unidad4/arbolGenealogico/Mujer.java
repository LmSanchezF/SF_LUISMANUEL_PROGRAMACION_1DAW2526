package Unidad4.arbolGenealogico;

import Unidad4.herenciaConstructores.Persona;

public class Mujer extends Persona {
String colorPelo="azul";

	public Mujer(String nombre, int edad) {
		super(nombre, edad);
		
	}

	@Override
	public void presentar() {
		super.presentar();
	System.out.println("Soy mujer y tengo el pelo" +colorPelo);	
	}

}
