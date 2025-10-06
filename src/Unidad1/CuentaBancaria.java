package Unidad1;

import java.util.Scanner;

public class CuentaBancaria {
	//Atributos
	String Titular;
	double Saldo = 0;
	//Constructor
	public void CuentaBancaria() {
		Titular="";
		Saldo = 0;
	}
	//Metodos
	//Sumamos dinero al saldo
	public void ingresar(double dinero) {
	Saldo= Saldo + dinero;
	//Saldo +=dinero
	}
	//Restamos dinero al saldo
	public void retirar (double dinero) {
	Saldo = Saldo - dinero;
	//Saldo +=dinero
	}
	public void mostrarSaldo() {
		System.out.println("El actual saldo es:" +Saldo);
	}
	
	
	public static void main(String[] args) {
		//Declaro un objeto clase CuentaBancaria
		//Declaro el objeto "cuentaDeLuisma" de la clase CuentaBancaria
		//El new llama al contructor
		CuentaBancaria cuentaDeLuisma = new CuentaBancaria(); 
		 
	
		Scanner teclado = new Scanner(System.in);
		//Pedir al ususario ingresar dinero y mostrar
		System.out.println("Introduce la cantidad de dinero a ingresar");
		double dinero = teclado.nextDouble();
		cuentaDeLuisma.ingresar(dinero);
		cuentaDeLuisma.mostrarSaldo();
		
		//Pedir al usuario retirar dinero y mostrar
		System.out.println("Intruduce la cantidad de dinero a retirar");
		double retirar = teclado.nextDouble();
		cuentaDeLuisma.retirar(dinero);
		cuentaDeLuisma.mostrarSaldo();
		
	}

}
