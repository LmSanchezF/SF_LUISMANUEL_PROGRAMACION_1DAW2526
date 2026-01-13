package Unidad4.ObjetosDentroDeObjetos.Ordenador;

public class Ordenador {
Procesador proc;
double memoria;
double discoDuro;
String grafica;

public Ordenador(double memoria, double discoDuro, String grafica,double velocidad,int nucleos) {
this.memoria=memoria;
this.discoDuro=discoDuro;
this.grafica=grafica;
this.proc= new Procesador(velocidad,nucleos);
}
public Ordenador(double memoria, double discoDuro, String grafica,Procesador p) {
this.memoria=memoria;
this.discoDuro=discoDuro;
this.grafica=grafica;
this.proc= p;
}
}

