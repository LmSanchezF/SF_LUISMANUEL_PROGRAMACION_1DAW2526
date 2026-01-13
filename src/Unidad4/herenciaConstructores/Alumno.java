package Unidad4.herenciaConstructores;

public class Alumno extends Persona {
protected String curso;

public Alumno(String n, int e, String curso) {
	super("n", e);
	this.curso = "Primero DAW";
}
@Override
public void presentar() {
super.presentar();
System.out.println("Estoy en" +curso);
}

}
