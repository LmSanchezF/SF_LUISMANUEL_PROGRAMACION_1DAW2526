package Unidad3.FichaEjercicios;
import java.util.Scanner;
public class ejercicio18 {

	public static void main(String[] args) {
	 
	
	Scanner teclado= new Scanner(System.in);
	char opcion=teclado.nextLine().charAt(0);
	System.out.println("Introduzca el primer numero");
	int numero1=teclado.nextInt();
	System.out.println("Introduzca el segundo numero");
	int numero2=teclado.nextInt();
	System.out.println(" Numero 1: " +numero1);
	System.out.println(" Numero 2: " +numero2);
	do {
	System.out.println("------MENU------");
	System.out.println(" S = suma ");
	System.out.println(" R = resta ");
	System.out.println(" M = multiplicacion ");
	System.out.println(" D = division " );
	System.out.println(" F = finalizar");
	
	
	if (opcion=='S') {	
	 System.out.println("El resultado de la suma es: " +(numero1+numero2));
	 break;
	 }else if (opcion=='R') {
		 System.out.println("El resultado de la resta es: " +(numero1+numero2));
		 break;
	 }else if (opcion=='M') {
		 System.out.println("El resultado de la multiplicacion es: " +(numero1*numero2));
		 break;
	 }else if (opcion=='D') {
		 System.out.println("El resultado de la division es: " +(numero1/numero2));
		 break;
	 }else if (opcion=='F') {
		 System.out.println("Finalizando....Hasta pronto!!! ");
		 break;
		
	}
	
	}while(opcion!=S) {
		
	}
	}

	 
		
	
	
	
	
	
	
	
	
		
	
	
	}



