package Unidad5.ArrayList;
import java.util.ArrayList;
public class carritoCompra {

	public static void main(String[] args) {
		ArrayList<Double> compra  = new ArrayList<>();
		compra.add(12.50);
		compra.add(23.55);
		compra.add(9.99);
		compra.add(0, 45.00);
		
		double total=0;
		for (Double precio : compra) {
			total+=precio;		
		}
		System.out.printf("El total de la compra es %2f", total);
	}

}
