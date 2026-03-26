package polimorfismo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EcoMovilApp  {
	
	static Scanner teclado= new Scanner(System.in);
	
	static ArrayList<VehiculoElectrico> concesionario= new ArrayList<>();
	
	
	public static void main(String[] args) {
		
	
		
		 int opcion=0;
		 
		Scanner teclado= new Scanner(System.in);
		
		
		do {
			
			
			System.out.println("=== MENÚ ECO-MOVIL ===");
				
			System.out.println("1.Agregar bicicleta electrica");
			
			System.out.println("2.Agregar patinete electrico");
			
			System.out.println("3.Agregar coche electrico");
			
			System.out.println("4.Mostrar todos los vehiculos");
			
			System.out.println("5.Cargar todos los vehiculos");
			
			System.out.println("6.Borrar vehiculo");
			
			System.out.println("7.Salir");

			opcion=teclado.nextInt();
			System.out.println();
			
			switch(opcion) {
			
			case 1:
				
			agregarBicicleta();
			
				break;
			
			
			case 2:
				
			agregarPatinete();	
			
				break;
			
				
			case 3:
				
			agregarCoche();
			
				break;
			
				
			case 4:

			System.out.println("--Vehiculos Registrados--");

			mostrarVehiculos();
			
				break;
			
				
			case 5:
				
				Iterator<VehiculoElectrico> v = concesionario.iterator();
				while(v.hasNext()) {
				    VehiculoElectrico vehiculo = v.next();
				    vehiculo.cargar();
				}
				break;
				
				
			case 6:
				
				
				
				
				break;
				
			case 7:
				
				System.out.println("Ha elegido salir");
				
				System.out.println("Saliendo...");
				
				break;
			
				
			default:
				
				System.out.println("La opcion elegida no es valida, por favor introduzca la opcion nuevamente");
					
				
			}
			
			
			
			
		} while (opcion!=7);

	}
	
	public static void agregarBicicleta() {
		
		
		System.out.println("Introduce la marca ");
		
		String marca=teclado.nextLine();
		
		System.out.println("Introduce el modelo ");
		
		String modelo=teclado.nextLine();
		
		System.out.println("Introduce la autonomia");
		
		int autonomia=teclado.nextInt();
		
		System.out.println("¿Tiene pedales?");
		
		boolean tienePedales= teclado.nextBoolean();
		
		System.out.println("Introduce la id del vehiculo");
		
		int id=teclado.nextInt();
		
		VehiculoElectrico bici= new BicicletaElectrica(marca, modelo, autonomia, id, tienePedales);
		
		concesionario.add(bici);
		
		System.out.println("Bicicleta electrica agregada correctamente");
	}
	
	public static void agregarPatinete() {
		
		System.out.println("Introduce la marca ");
		
		String marca=teclado.nextLine();
		
		System.out.println("Introduce el modelo ");
		
		String modelo=teclado.nextLine();
		
		System.out.println("Introduce la autonomia");
		
		int autonomia=teclado.nextInt();
		
		System.out.println("Introduce la potencia");
		
		int potencia=teclado.nextInt();
		
		System.out.println("Introduce la id del vehiculo");
		
		int id=teclado.nextInt();
		
		VehiculoElectrico patinete= new PatineteElectrico(marca, modelo, autonomia, id, potencia);
		
		concesionario.add(patinete);
		
		System.out.println("Patinete electrico agregado correctamente");
	}

	public static void agregarCoche() {
		
	System.out.println("Introduce la marca ");
		
		String marca=teclado.nextLine();
		
		System.out.println("Introduce el modelo ");
		
		String modelo=teclado.nextLine();
		
		System.out.println("Introduce la autonomia");
		
		int autonomia=teclado.nextInt();
		
		System.out.println("Introduce las plazas de que dispone");
		
		int numeroPlazas=teclado.nextInt();
		
		System.out.println("Introduce la id del vehiculo");
		
		int id=teclado.nextInt();
		
		VehiculoElectrico coche= new cocheElectrico(marca, modelo, autonomia, id, numeroPlazas); 
		
		concesionario.add(coche);
		
		System.out.println("Coche electrico agregado correctamente");
		
	}
	public static void mostrarVehiculos() {
	
		Iterator<VehiculoElectrico> v = concesionario.iterator();
		while(v.hasNext()) {
		    VehiculoElectrico vehiculo = v.next();
		 vehiculo.mostrarInformacion();
		}
		    	
		    }
		
	public static void borrarVehiculo() {
		    
		System.out.println("Introduce la posicion que quieres borrar");
		
		int posicion= teclado.nextInt();
		
		VehiculoElectrico v= concesionario.get(posicion);
		
		if(v instanceof BicicletaElectrica) {
			
			nBicicleta--;
		}else if(v instanceof PatineteElectrico) {
			nPatinete--;
		}else if(v instanceof cocheElectrico) {
			nCoche--;
		}
		
	}
	

	}

