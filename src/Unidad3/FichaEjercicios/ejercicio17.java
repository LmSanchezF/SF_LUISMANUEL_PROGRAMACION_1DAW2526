package Unidad3.FichaEjercicios;
import java.util.Scanner;
public class ejercicio17 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	int kilos=0;
	double precio1=0.30;
	double precio2=0.20;
	double precio3=0.15;
	System.out.println("Bienvenido a la aplicacion de venta de pienso");
	System.out.println("Elija un tipo de pienso");
	System.out.println(" 1.Pienso nº1 (Calidad premium)");
	System.out.println(" 2.Pienso nº2 (Calidad superior) ");
	System.out.println(" 3.Pienso nº3 ");
	int seleccion=teclado.nextInt();
	System.out.println("Introduce cuantos kilos desea");
	kilos=teclado.nextInt();
	
	
	switch(seleccion) {
	case 1:
	System.out.println(" El precio de su seleccion es "+(precio1*kilos)+"euros");
	if(kilos<=0);
	
	case 2:
	System.out.println(" El precio de su seleccion es "+(precio2*kilos)+"euros");
	if(kilos<=0);
	
	case 3:
	System.out.println(" El precio de su seleccion es "+(precio3*kilos)+"euros");
	if(kilos<=0);
	
	}
	
	
	
	}

}
