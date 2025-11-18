package Unidad3.FichaEjercicios;
import java.util.Scanner;
public class ejercicio14 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	System.out.println("Bienvenido a clinica veterinaria");
	System.out.println("Elija un tipo de analisis");
	System.out.println("1.analisis nº1");
	System.out.println("2.analisis nº2");
	System.out.println("3.analisis nº3");
	int analisis=teclado.nextInt();
	double analisis1=25.00;
	double analisis2=36.00;
	double analisis3=50.00;
	
	switch(analisis) {
	case 1:
	System.out.println("Ha elegido analisis basico con un importe de 25,00 euros ");
	System.out.println("¿Esta uster afliado? Escriba true para si o false para no");
	boolean respuesta1=teclado.nextBoolean(); 
	if (respuesta1==true){
	System.out.println("Su precio para el analisis es " +(analisis1-analisis1*8/100)+ " euros ");
	}
	else {
	System.out.println("Su precio para el analisis es " +analisis1 +" euros");	
	}
	break;
	
	case 2:
		System.out.println("Ha elegido analisis avanzado con un importe de 36,00 euros ");
		System.out.println("¿Esta uster afliado? Escriba true para si o false para no ");
		boolean respuesta2=teclado.nextBoolean(); 
		if (respuesta2==true){
		System.out.println("Su precio para el analisis es" +(analisis2-analisis2*8/100)+" euros ");
		}
		else {
		System.out.println("Su precio para el analisis es" +analisis2+ " euros ");	
		}
		break;
	
	case 3:
		System.out.println("Ha elegido analisis basico con un importe de 50,00 euros ");
		System.out.println("¿Esta uster afliado? Escriba true para si o false para no ");
		boolean respuesta3=teclado.nextBoolean(); 
		if (respuesta3==true){
		System.out.println("Su precio para el analisis es " +(analisis3-analisis3*8/100)+ " euros ");
		}
		else {
		System.out.println("Su precio para el analisis es " +analisis3+" euros");	
		}
		break;
		default:
		System.out.println("Introduzca una opcion valida");
	}

}
}
