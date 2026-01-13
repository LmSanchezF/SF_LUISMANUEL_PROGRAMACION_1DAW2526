package Unidad4.arbolGenealogico;

public class Hombre extends Persona {
String bigote="verde";

public Hombre(String nombre, int edad, String bigote) {
	super(nombre, edad);
	this.bigote = bigote;
}

@Override
public void presentar() {
	super.presentar();
	System.out.println("Hombre tener bigote");
}


	





}


