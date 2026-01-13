package Unidad4.herenciaConstructores;

public class Profesor extends Persona{
protected String especialidad;


public Profesor(String n, int e, String especialidad) {
	super("n",e);
	this.especialidad = "especialidad";
}
}
