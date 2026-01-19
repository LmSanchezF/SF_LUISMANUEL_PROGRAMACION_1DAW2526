package Unidad4.FichaHerencia.VelasGata;

public class Vela {

protected String color;
protected double altura;
protected double precio;

public String getColor() {
	return color;
}
public double getAltura() {
	return altura;
}
public double getPrecio() {
	return precio;
}
public void setColor(String color) {
	this.color = color;
}
public void setAltura(double altura) {
	this.altura = altura;
	this.precio= (altura*100)*2; //Multiplicamos por 100 para pasar la altura a cm
	//Ej: 1.22 --1.22*100=122cm
}
	
	
}
