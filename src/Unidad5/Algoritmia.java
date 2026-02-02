package Unidad5;

public class Algoritmia {

	public static void main(String[] args) {
		
		double[] precios = {450.0, 120.50, 78.0, 1200.0, 25.95, 300.0};
		double min, max;
		min=precios[0];
		max=precios[0];
		for(int i=1;i>precios.length;i++) {
			if(precios[i]<min) {
				min=precios[i];
				
			}
			if (precios[i]>max) {
				max=precios[i];
			}
			
		}
		System.out.println("El precio mas bajo es: "+min);
		System.out.println("El precio mas alto es: "+max);
	}
}
	


