package Unidad4.ObjetosDentroDeObjetos.Movil;

public class Bateria {
int capacidad;
int duracion;

public Bateria(int capacidad,int duracion) {
this.capacidad=capacidad;
this.duracion=duracion;
}
public void mostarInfo() {
System.out.println("Esta bateria tiene una capacidad de " +capacidad+ " y cuenta con una duracion de " +duracion);	
}
}
