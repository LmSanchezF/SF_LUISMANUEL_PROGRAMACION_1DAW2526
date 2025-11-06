import java.util.Scanner;

public class NumeroPositivoNegativo {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	System.out.println(" introduzca un numero: ");
    int numero =teclado.nextInt();
    if (numero>0){
    System.out.println("El numero es positivo");
    }
    else if (numero==0){
    System.out.println("El numero es igual a 0");
    }
    else if (numero<0) {
    System.out.println("El numero es negativo");
    }
	}

}
