package Tema5;

public class escanerPrecios {

	public static void main(String[] args) {
		double [] productos= new double[4];
		productos[0]=10;
		productos[1]=20;
		productos[2]=30;
		productos[3]=40;
		double precioTotal=0;
		double precioPromedio;
		
			for (int i = 0;  i < productos.length; i++) {
			precioTotal=precioTotal+productos[i];	 
	       }
				System.out.println("La suma total de los precios es: "+precioTotal);
				precioPromedio=precioTotal/4;
				System.out.println("La suma total de los precios es: "+precioPromedio);

	}


	}

