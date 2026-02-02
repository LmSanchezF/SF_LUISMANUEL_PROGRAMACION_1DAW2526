package Unidad5;

public class contadorPares {

	public static void main(String[] args) {
		int numeros[]= new int [20];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]= (int)(Math.random()*100)+1;
			System.out.println("Numeros["+i+"]"+numeros[i]);
		}
		int pares=0;
		int impares=0;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]%2==0) {
				pares++;
			}else impares++;
			}
		System.out.printf("Hay %d pares %d impares.",pares,impares);
		}

	}


