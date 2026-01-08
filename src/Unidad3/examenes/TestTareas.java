package Unidad3.examenes;
import java.util.Scanner;
public class TestTareas {
	

	
/*Programa principal Main************/
	public static void main(String[] args) {

	Scanner teclado= new Scanner(System.in);
	System.out.println("Registro de las tres tareas");
	/*----Pedimos datos tarea 1-----*/
	System.out.println("Tarea 1");
	System.out.println("Introduce el nombre de la tarea 1");
	String nombre = teclado.nextLine();
	System.out.println("Introduce la categoria de la tarea 1");
	String categoria= teclado.nextLine();
	double duracion=0;
	try {
		do {
		System.out.println("Introduce la duracion en horas");
		duracion= teclado.nextDouble();
		teclado.nextLine();//Limpiamos el buffer para recoger el salto de linea.
		if (duracion <0.5||duracion>12) {
		System.out.println("Duracion fuera de rango (0.5-12)");	
		}
		}while(duracion<0.5||duracion>12);
	}catch(NumberFormatException e) {
		System.out.println("ERROR: Debe introducir un numero valido");
		
	}
	/*-----Tarea 2----*/
	System.out.println("Tarea 2");
	System.out.println("Introduce el nombre de la tarea 2");
	String nombre2 = teclado.nextLine();
	System.out.println("Introduce la categoria de la tarea 2");
	String categoria2= teclado.nextLine();
	
	try {
		do {
		System.out.println("Introduce la duracion en horas");
		duracion= teclado.nextDouble();
		teclado.nextLine();//Limpiamos el buffer para recoger el salto de linea.
		if (duracion <0.5||duracion>12) {
		System.out.println("Duracion fuera de rango (0.5-12)");	
		}
		}while(duracion<0.5||duracion>12);
	}catch(NumberFormatException e) {
		System.out.println("ERROR: Debe introducir un numero valido");
		
	}
	/*-----Tarea 3-----*/
	System.out.println("Tarea 3");
	System.out.println("Introduce el nombre de la tarea 3");
	String nombre3 = teclado.nextLine();
	System.out.println("Introduce la categoria de la tarea 1");
	String categoria3= teclado.nextLine();
	
	try {
		do {
		System.out.println("Introduce la duracion en horas");
		duracion= teclado.nextDouble();
		teclado.nextLine();//Limpiamos el buffer para recoger el salto de linea.
		if (duracion <0.5||duracion>12) {
		System.out.println("Duracion fuera de rango (0.5-12)");	
		}
		}while(duracion<0.5||duracion>12);
	}catch(NumberFormatException e) {
		System.out.println("ERROR: Debe introducir un numero valido");
		
	}
	
	
	tarea miTarea1= new tarea(nombre, categoria);
	miTarea1.setDuracionHoras(duracion);
	System.out.println("La prioridad generada automaticamente es: " +miTarea1.getPrioridad());
	
	tarea miTarea2= new tarea(nombre, categoria);
	miTarea2.setDuracionHoras(duracion);
	System.out.println("La prioridad generada automaticamente es: " +miTarea2.getPrioridad());
	
	tarea miTarea3= new tarea(nombre, categoria);
	miTarea3.setDuracionHoras(duracion);
	System.out.println("La prioridad generada automaticamente es: " +miTarea3.getPrioridad());
	
	
	/*---Menu principal---*/
	int opcion;
	do {
		System.out.println("Menu de opciones");
		System.out.println("1. Mostar todas las tareas");
		System.out.println("2. Mostar todas tarea con mayor prioridad");
		System.out.println("3. Buscar tarea por nombre");
		System.out.println("4. Pormedio redondeado de duracion");
		System.out.println("5. Filtrar tareas por prioridad minima");
		System.out.println("6. Salir");
		System.out.println("Elige una opcion");
		opcion=teclado.nextInt();
		teclado.nextLine();

		switch(opcion) {
		
		
			case 1:
				System.out.println("Tareas Registradas");
				System.out.println("Tarea 1");
			miTarea1.mostrar();
				System.out.println("Tarea 2");
			miTarea2.mostrar();
				System.out.println("Tarea 3");
			miTarea3.mostrar();
			break;
			case 2:/*Intentar hacer metodo*/
			System.out.println("La tarea con mayor prioridad es :");
			if(miTarea1.getPrioridad()>miTarea2.getPrioridad()&&miTarea1.getPrioridad()>miTarea3.getPrioridad()) {
				System.out.println(miTarea1.getNombre()+ "Prioridad: "+miTarea1.getPrioridad());
			}else if (miTarea2.getPrioridad()>miTarea1.getPrioridad()&& miTarea2.getPrioridad()>miTarea3.getPrioridad()){
				System.out.println(miTarea2.getNombre()+ "Prioridad: "+miTarea2.getPrioridad());
			}else {
				System.out.println(miTarea3.getNombre()+ "Prioridad: "+miTarea3.getPrioridad());

			}
		
				System.out.println(miTarea3.getNombre()+ "Prioridad: "+miTarea3.getPrioridad());
			break;
			case 3:
			System.out.println("Introduce la tarea a buscar");
			String tareaBuscada=teclado.nextLine();
			if (tareaBuscada.equalsIgnoreCase(miTarea1.getNombre())) {	
				
			}else if(tareaBuscada.equalsIgnoreCase(miTarea2.getNombre())) {
				
			}else if (tareaBuscada.equalsIgnoreCase(miTarea3.getNombre())) {
				
			}else
			break;
			
			case 4:
			int promedio=0;	
			for(int i=0; i<3; i++) {
			if(i==1) {
			promedio=promedio+miTarea1.getPrioridad();
			}else if (i==2) {
			promedio=promedio+miTarea2.getPrioridad();
			}else if (i==3){
			promedio=promedio+miTarea3.getPrioridad();
			}
			}
			System.out.println("Duraciones totales calculadad mediante bucle:" +promedio);
			System.out.println("Promedio exacto"+promedio/3);
			System.out.println("Promedio redondeado"+promedio);
			break;
			case 5:
			double prioridadMinima=0;
			boolean correcto=true;
				try {
			System.out.println(" Introduce la prioridad minima: ");
			prioridadMinima=teclado.nextInt();
			correcto=true;
				}catch(NumberFormatException e) {
				correcto=false;
				System.out.println("ERROR: Debe introducir un numero entero valido");
				}
			System.out.println("Tareas con prioridad mayor o igual a" +prioridadMinima+":");
			for(int i=1; i<=3; i++) {
			if(i==1) {
			if (miTarea1.getPrioridad()>=prioridadMinima) {
			miTarea1.mostrar();	
			}else continue;
			}else if (i==2) {
				if (miTarea2.getPrioridad()>=prioridadMinima) {
					miTarea2.mostrar();		
			} else continue;
			}else if (i==3) {
				if (miTarea3.getPrioridad()>=prioridadMinima) {
					miTarea3.mostrar();	
			}else continue;
			}
			}
			break;
			case 6:
			System.out.println("Ha elegido salir, hasta pronto");
			break;
			default:
			System.out.println("Opcion incorrecta");

		
		}
	}while(opcion!=6);
		
		
		
	

	
	
}/*Fin del MAIN*******/
	
}

