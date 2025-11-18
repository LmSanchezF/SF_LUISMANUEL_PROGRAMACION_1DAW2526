package Unidad3;

public class errorLogico {

	public static void main(String[] args) {
		 int[] numeros = {2, 4, 6, 8};
		 int suma = 0;
		 for (int i = 0; i <= numeros.length-1; i++) { // Error aquí
		 suma += numeros[i];
		 }
		 System.out.println("Suma: " + suma);
		 }
		} 
