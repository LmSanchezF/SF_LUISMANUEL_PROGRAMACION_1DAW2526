package Unidad3.FichaEjercicios;
import java.util.Scanner;
public class ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
System.out.println("Introduzca la medida del tornillo en cm para saber el tamaño");
double medida=teclado.nextDouble();
if(medida<=2.9) {
System.out.println("El tornillo introducido es pequeño");	
}else if(medida<=4.9){
System.out.println("El tornillo introducido es mediano");		
}else if(medida<=6.4){
	System.out.println("El tornillo introducido es grande");
}else if(medida<=8.4){
	System.out.println("El tornillo introducido es muy grande");

}
	}
}

