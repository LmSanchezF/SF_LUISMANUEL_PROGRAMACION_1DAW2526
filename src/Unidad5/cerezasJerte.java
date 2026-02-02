package Unidad5;

public class cerezasJerte {

	public static void main(String[] args) {
		int[] kilosRecogidos = {50, 35, 60, 40, 55, 30, 65, 20, 50, 45};
		int sumaKilos=0;
		int promedio=0;
		kilosRecogidos[7]+=10;
		
		//Calculo del total y del promedio
		
		for (int i=0; i<kilosRecogidos.length; i++) {	
			if(kilosRecogidos[i]>0) {
				sumaKilos+=kilosRecogidos[i];
		}
		System.out.println("Suma de kilos recogidos:"+sumaKilos);
		System.out.println("La media por trabajador es:" +(sumaKilos/kilosRecogidos.length));
			
		
		for (int j= 0; j < kilosRecogidos.length; j++) {
		if(kilosRecogidos[i]>55) {
			System.out.println("Trabajador nº:"+(i+1));
		}
		}
		}
	}
	
	

}
