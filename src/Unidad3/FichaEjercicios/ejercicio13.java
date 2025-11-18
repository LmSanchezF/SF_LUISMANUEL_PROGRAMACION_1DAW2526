package Unidad3.FichaEjercicios;
import java.util.Scanner;
public class ejercicio13 {

	public static void main(String[] args) {
Scanner teclado= new Scanner(System.in);
System.out.println("Bienvenido a comprobar fecha");
System.out.println("Introduzca una fecha para saber si es correcta");
System.out.println("introduce el dia");
int dia=teclado.nextInt();
System.out.println("introduce el mes");
int mes=teclado.nextInt();
System.out.println("introduce el año");
int año=teclado.nextInt();

switch(mes) {
case 1,3,5,7,8,10,12:
if(dia<=31) {
System.out.println("La fecha es correcta");
}
else {
System.out.println("La fecha es incorrecta");	
}
break;	

case 4,6,9,11:
if(dia<=30) {
System.out.println("La fecha es correcta");
}
else {
System.out.println("La fecha es incorrecta");	
}
break;

case 2:
if(dia<=28) {
System.out.println("La fecha es correcta");
}
else System.out.println("La fecha es incorrecta");

	}
	}
}


