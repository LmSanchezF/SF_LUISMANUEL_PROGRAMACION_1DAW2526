package Unidad4.FichaHerencia.Universidad;

import java.util.Scanner;

public class Persona {
protected String nombre;
protected String Apellidos;
protected String direccion;
protected int codigoPostal;
protected int telefono;
Scanner teclado= new Scanner(System.in);

public void setNombre() {
	
	System.out.println("Introduzca un nombre");
	this.nombre = teclado.nextLine();
}
public void setApellidos() {
	System.out.println("Introduzca apellidos");
	Apellidos = teclado.nextLine();
}
public void setDireccion() {
System.out.println("Introduce tu direccion");
	this.direccion = teclado.nextLine();
}
public void setCodigoPostal() {
	System.out.println("Introduce codigo postal");
	this.codigoPostal = teclado.nextInt();
}
public void setTelefono() {
	System.out.println("Introduce telefono");
	this.telefono = teclado.nextInt();
}
@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", Apellidos=" + Apellidos + ", direccion=" + direccion + ", codigoPostal="
			+ codigoPostal + ", telefono=" + telefono + ", teclado=" + teclado + "]";
}



}
