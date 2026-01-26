//@author Luis Manuel Sanchez Fernandez
package unidad4;

public class Vehiculo {
protected String marca;
protected int velocidadMaxima;
protected boolean enMarcha;


public Vehiculo(String marca, int velocidadMaxima) {
	this.marca = marca;
	this.velocidadMaxima = velocidadMaxima;
	this.enMarcha = true;
}
public Vehiculo(String marca, int velocidadMaxima) {
	
}
public Vehiculo(String marca) {
this.marca=marca;
this.velocidadMaxima=120;
enMarcha=false;	
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public int getVelocidadMaxima() {
	return velocidadMaxima;
}
public void setVelocidadMaxima(int velocidadMaxima) {
	this.velocidadMaxima = velocidadMaxima;
}
public boolean isEnMarcha() {
	return enMarcha;
}
public void setEnMarcha(boolean enMarcha) {
	this.enMarcha = enMarcha;
}
public void arrancar() {
this.enMarcha=true;	
System.out.println("El vehiculo ha arrancado " +enMarcha);	
}
public void detener() {
	
System.out.println("El vehiculo se ha detenido " +enMarcha);	
}
public void mostrarDatos() {
System.out.println("La marca es: " +marca);
System.out.println("La velocidad maxima es: " +velocidadMaxima);
System.out.println("El vehiculo se encuentra arrancado " + enMarcha);
}
public static Vehiculo vehiculoMasRapido(Vehiculo v1,Vehiculo miMoto) {
if(v1.getVelocidadMaxima()>miMoto.getVelocidadMaxima()){
	//System.out.println("El vehiculo " +v1+ "es mas rapido que el " +miMoto);
	return v1;
}else {
	return v2; //System.out.println("El vehiculo " +miMoto+ "es mas rapido que el " +v1);

	
}


}


}
