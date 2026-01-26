package unidad4;

public class Coche extends Vehiculo {
protected int numeroPuertas;
protected boolean automatico;
protected String modo;

public Coche(String marca, int velocidadMaxima, boolean enMarcha, int numeroPuertas,boolean automatico, String modo) {
super(marca, velocidadMaxima, enMarcha);
this.numeroPuertas=numeroPuertas;
this.automatico=true;
this.modo=modo;
	

}

@Override
public void mostrarDatos() {
super.mostrarDatos();
System.out.println("Numero de puertas: " +numeroPuertas);
System.out.println("Es automatico: "+automatico );
}
public void arrancar(String modo) {
if(modo=="llave") {	
System.out.println("Arrancando el coche con llave");
}if(modo=="boton"){
System.out.println("Arrancando el coche con boton");	
}


}
}

