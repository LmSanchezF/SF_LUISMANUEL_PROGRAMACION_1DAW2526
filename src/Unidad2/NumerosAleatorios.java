package Unidad2;

import java.util.Random;

public class NumerosAleatorios {

	public static void main(String[] args) {
		// Genera un numero aleatorio entre 1 y 6 (simlar un dado) con Math.random
int dado= (int)(Math.random()*(6-1+1)+1);
System.out.println("Ha salido: "+dado);
Random r= new Random();
	}

}
