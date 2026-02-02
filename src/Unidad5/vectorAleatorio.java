package Unidad5;

public class vectorAleatorio {

	public static void main(String[] args) {
		int numeros[]= new int[10];
		// int ale= (int)(Math.random() * (max-min+1))+min;
		
		
		for(int i=0; i<numeros.length;i++) {
			numeros[i]=(int)(Math.random()*100+1);
		
		}
		// recorremos el array para imprimir su contenido con guiones
		for(int i=0; i<numeros.length;i++) {
			System.out.println(numeros[i]);
			if(i!=numeros.length-1) {
				System.out.println("-");
			}
		}
	}

}
