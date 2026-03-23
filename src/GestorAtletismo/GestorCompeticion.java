package GestorAtletismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class GestorCompeticion {
	static Scanner teclado= new Scanner(System.in);
	static List<Atleta> participantes= new ArrayList<>();
	
	
	public static void inscribirAtleta() {
		System.out.println("introduce el nombre del atleta");
		String nom= teclado.nextLine();
		System.out.println("introduce el pais del atleta");
		String pais= teclado.nextLine();
		double marcaPersonal=0;
		while(true) {
		System.out.println("introduce la marca personal del atleta");
		marcaPersonal= teclado.nextDouble();
		Atleta atleta= new Atleta (nom,pais,marcaPersonal);
		participantes.add(atleta);
		if(marcaPersonal<0) {
			
			continue;
		}else break;
		}
		}
		
	
	public static void retirarAtleta() {
		System.out.println("introduce el nombre del atleta");
		String nom= teclado.nextLine();
		boolean existe=false;
		for (int i = 0; i < participantes.size(); i++) {
			participantes.get(i).getNombre().equalsIgnoreCase(nom);
			existe=true;
			participantes.remove(i);
		}
	}
	
	public static void BuscarAtletaPorPais() {
		
		System.out.println("Introduce las tres primeras letras del pais");
		String letras= teclado.nextLine();
		for(Atleta a : participantes) {
		a.getPais().substring(0, 3).equalsIgnoreCase(letras);
		System.out.println(a.toString());
		}
		
	}
	public static void CambiarOrdenSalto () {
		System.out.println("Vas a cambiar dos atletas de orden ");
		System.out.println("Introduce la posicion del primer atleta ");
		int origen=teclado.nextInt();
		System.out.println("Introduce la posicion del segundo atleta");
		int destino=teclado.nextInt();
		Atleta aux;
		
		try {
		aux=participantes.get(destino);
		participantes.set(destino, participantes.get(origen));
		participantes.set(origen, aux);
		
		}catch(IndexOutOfBoundsException e) {
			
		}
		
	}
	public static void CalculoRendimiento () {
		double maximo=participantes.get(0).getMarcaPersonal();
		for(int i=1; i>participantes.size();i++) {
			maximo=Math.max(maximo, participantes.get(i).getMarcaPersonal());
		}
		System.out.println("La marca ganadora es: "+ maximo + "metros");
		double indice= Math.round(Math.sqrt(maximo)*10);
		
		for(Atleta a: participantes) {
			if(maximo==a.getMarcaPersonal()) {
				System.out.println("El atleta ganador es : ");
				System.out.println(a.getNombre());
			}
		}
		
		
	}
	public static void ListarParticipantes () {
		
			
		}
	

	public static void main(String[] args) {
		
		System.out.println("Bienvenido al programa gestor competicion");
		System.out.println("Elija una opcion");
		int opcion=0;
		
		do {
			System.out.println("1.Inscribir atleta");
			System.out.println("2.Retirar atleta");
			System.out.println("3.Buscar atleta por pais");
			System.out.println("4.Intercambiar orden de salto");
			System.out.println("5.Calculo de rendimiento");
			System.out.println("6.Listar participantes");
			System.out.println("7.Salir");
			opcion= teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {
			
			
			case 1:
				inscribirAtleta();
				
		
				break;
				
			case 2:
				retirarAtleta();
				
				
				break;
				
			case 3:
				BuscarAtletaPorPais();
				
				break;
				
			case 4:
				CambiarOrdenSalto ();
				
				break;
				
			case 5:
				
				CalculoRendimiento ();
				break;
				
			case 6:
				
				
				ListarParticipantes ();
				break;
				
			case 7:
				System.out.println("Ha elegido salir, hasta la proxima");
				break;
			}


			
			
			
		} while (opcion!=7);

	}

}
