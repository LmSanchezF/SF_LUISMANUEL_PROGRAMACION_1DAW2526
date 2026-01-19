package Unidad4.FichaHerencia.CamisetasAugusta;

public class Camiseta {
int numPedido;
String tamaño;
String color;
double precio;


public int getNumPedido() {
	return numPedido;
}
public void setNumPedido(int numPedido) {
	this.numPedido = numPedido;
}
public String getTamaño() {
	return tamaño;
}
public void setTamaño(String tamaño) {
	this.tamaño = tamaño;
	if (tamaño=="XXL"||tamaño=="XXXL") {
	this.precio=22.99;
	}else {
	this.precio=9.99;	
	}
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getPrecio() {
	return precio;
	
}


}
