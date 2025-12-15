package Unidad3.examenes;

/**
 * @author Luis M. Sanchez
 */

public class tarea {
	
private String nombre;
private int prioridad;
private String categoria;
private double duracionHoras;

/**
 * 
 * @param nombre Nombre de la categoria
 * @param categoria Categoria de la tarea
 */
	
public tarea (String nombre, String categoria) {
this.nombre=nombre;
this.categoria=categoria;
duracionHoras=0;
prioridad= (int)(Math.random()*11)+10;

}

/**
 * 
 * @return Devolvemos la duración
 */

public double getDuracionHoras() {
	return duracionHoras;
}


public void setDuracionHoras(double duracionHoras) {
	this.duracionHoras = duracionHoras;
}


public String getNombre() {
	return nombre;
}


public int getPrioridad() {
	return prioridad;
}


public String getCategoria() {
	return categoria;
}

/**
 * Metodo mostrar Mostrara los datos de las tareas
 */

public void mostrar() {
System.out.println(" Nombre: " +nombre);	
System.out.println(" Categoria: " +categoria);	
System.out.println(" Duracion: " +duracionHoras);	
System.out.println(" Prioridad: " +prioridad);	


	

	

}
	
}
