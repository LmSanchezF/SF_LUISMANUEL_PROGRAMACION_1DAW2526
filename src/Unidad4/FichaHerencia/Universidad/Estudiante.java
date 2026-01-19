package Unidad4.FichaHerencia.Universidad;

public class Estudiante extends Persona {

protected String campoEstudio;
protected double calificaciones;

public void setcampoEstudio() {
System.out.println("Introduce campo estudio");
this.campoEstudio=teclado.nextLine();
}
public void setcalificaciones() {
System.out.println("Introduce tu calificacion");
this.calificaciones=teclado.nextInt();
}


}
