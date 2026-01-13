package Unidad4.arbolGenealogico;

public class Persona {
private String nombre;
private int edad;

public Persona(String nombre,int edad) {
this.nombre=nombre;
this.edad=edad;
}

public void presentar() {
System.out.println("Hola me llamo" +nombre+ "y tengo" +edad+ "años" );	
}

}
