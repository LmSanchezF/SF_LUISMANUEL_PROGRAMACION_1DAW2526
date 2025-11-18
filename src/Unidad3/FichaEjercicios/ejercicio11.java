package Unidad3.FichaEjercicios;
import java.util.Scanner;
public class ejercicio11 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce los kilos de ropa que desea lavar");
		int kilos=teclado.nextInt();
		if(kilos>=30) {
		System.out.println("Demasiado peso, la lavadora no funcionara");
		}else if(kilos>=22){
		System.out.println("Nivel maximo,no funcionara si introduce mas cantidad");	
		}else if(kilos>=15) {
		System.out.println("Nivel alto, puede introducir mas cantidad");	
		}else if(kilos>=8) {
		System.out.println("Nivel medio, puede introducir mas cantidad");	
		}else if(kilos>=0) {
		System.out.println("Nivel minimo, puede introducir mas cantidad");
		teclado.close();
		}
		
		
		
	}

}
