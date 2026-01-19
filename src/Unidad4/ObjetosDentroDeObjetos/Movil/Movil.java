package Unidad4.ObjetosDentroDeObjetos.Movil;

public class Movil {
String marca="iphone";
int precio;
int velocidad;
String color;
Bateria b;

public Movil(String marca,int precio, int velocidad, String color,int capacidad,int duracion) {
this.marca=marca;
this.precio=precio;
this.velocidad=velocidad;
this.color=color;
this.b=new Bateria(capacidad,duracion);
}
public void mostrarInfo() {
System.out.println("Movil de la marca " +marca+ " tiene un precio de " +precio+" alcanza una velocidad de "+velocidad+" y es de color " +color);	
b.mostarInfo();
}
}