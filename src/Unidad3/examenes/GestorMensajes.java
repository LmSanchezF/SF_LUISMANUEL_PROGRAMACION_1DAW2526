package Unidad3.examenes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GestorMensajes {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner (System.in);
		int opcion=0;
		String autor, contenido;
	
	/*Mensaje 1*/
	System.out.println("Mensaje 1");
	do {
	System.out.println("Introduce el autor del mensaje: ");
	autor=teclado.nextLine();
	if (autor.equals("")) {
		System.out.println("El autor no puede estar vacio, introduzca de nuevo el autor");
	}
	}while(autor.equals(""));
	do {
	System.out.println("Introduce el contenido del mensaje");
	contenido=teclado.nextLine();
	}while(contenido.length()<5||contenido.length()>200);{
	System.out.println("El contenido debe tener entre 5 y 200 caracteres, por favor introduzca de nuevo el contenido");	
	}
	Mensaje m1= new Mensaje(autor,contenido);
	System.out.println("Mensaje registrado correctamente");
	System.out.println("Longuitud sin espacios:" +m1.getLongitud());
	System.out.println("Palabras:" +m1.getPalabras());
	
	/*Mensaje 2*/
	System.out.println("Mensaje 2");
	do {
	System.out.println("Introduce el autor del mensaje: ");
	autor=teclado.nextLine();
	if (autor.equals("")) {
		System.out.println("El autor no puede estar vacio, introduzca de nuevo el autor");
	}
	}while(autor.equals(""));
	do {
	System.out.println("Introduce el contenido del mensaje");
	contenido=teclado.nextLine();
	}while(contenido.length()<5||contenido.length()>200);{
	System.out.println("El contenido debe tener entre 5 y 200 caracteres, por favor introduzca de nuevo el contenido");	
	}
	Mensaje m2= new Mensaje(autor,contenido);
	System.out.println("Mensaje registrado correctamente");
	System.out.println("Longuitud sin espacios:" +m2.getLongitud());
	System.out.println("Palabras:" +m2.getPalabras());
	
	/*Mensaje 3*/
	System.out.println("Mensaje 3");
	do {
	System.out.println("Introduce el autor del mensaje: ");
	autor=teclado.nextLine();
	if (autor.equals("")) {
		System.out.println("El autor no puede estar vacio, introduzca de nuevo el autor");
	}
	}while(autor.equals(""));
	do {
	System.out.println("Introduce el contenido del mensaje");
	contenido=teclado.nextLine();
	}while(contenido.length()<5||contenido.length()>200);{
	System.out.println("El contenido debe tener entre 5 y 200 caracteres, por favor introduzca de nuevo el contenido");	
	}
	Mensaje m3= new Mensaje(autor,contenido);
	System.out.println("Mensaje registrado correctamente");
	System.out.println("Longuitud sin espacios:" +m3.getLongitud());
	System.out.println("Palabras:" +m3.getPalabras());
	
	
	/*---Menu de opciones---*/
	System.out.println("Menu de opciones");
	System.out.println("1.Mostrar los mensajes registrados");
	System.out.println("2.Mostrar el mensaje mas largo");
	System.out.println("3.Contar cuantas veces aparece una letra en un mensaje");
	System.out.println("4.Crear una version invertida del contenido");
	System.out.println("5.Convertir un mensjae a \"Formateado titulo\".");
	System.out.println("Salir");
	System.out.println("Elige una opcion");
	try {
		opcion=teclado.nextInt();
	}catch(InputMismatchException e) {
		System.out.println("No ha introducido un vaor valido por favor intentelo de nuevo");
	}
	teclado.nextLine();//Limpieza de buffer//
	
	switch(opcion) {
	
	case 1:
		System.out.println("Mensaje 1");
		m1.mostrar();
		System.out.println("Mensaje 2");
		m2.mostrar();
		System.out.println("Mensaje 3");
		m3.mostrar();
		break;
		
	case 2:
		
		if(m1.getLongitud()>m2.getLongitud()&& m1.getLongitud()> m3.getLongitud());{
		System.out.println("El mensaje mas largo es" +m1.getAutor());
		m1.mostrar();
		
		}if (m2.getLongitud()>m1.getLongitud()&& m2.getLongitud()> m3.getLongitud());{
		System.out.println("El mensaje mas largo es" +m2.getAutor());
		m2.mostrar();
		
		}else{(m3.getLongitud()>m1.getLongitud() && m3.getLongitud()> m2.getLongitud());{
		System.out.println("El mensaje mas largo es" +m3.getAutor());
		m3.mostrar();
	}
	break;
		}
	case 3:
	System.err.println("Introduce el numero del mensaje (1-3):");
	int numero=teclado.nextInt();
	teclado.nextLine();
	String letra=teclado.nextLine();
	char buscarLetra=letra.charAt(0);
	int contador=0;
	switch(numero) {
	case 1:
		for(int i=0; i<m1.getContenido().length();i++){
		if(m1.getContenido().charAt(i)==' ') {
			continue;
		}
		if(buscarLetra==m1.getContenido().charAt(i)) {
			contador++;
		}
		}
		break;
		case 2:
			for(int i=0; i<m2.getContenido().length();i++){
			if(m2.getContenido().charAt(i)==' ') {
				continue;
			}
			if(buscarLetra==m2.getContenido().charAt(i)) {
				contador++;
			}
			}
			break;
			case 3:
				for(int i=0; i<m1.getContenido().length();i++){
				if(m3.getContenido().charAt(i)==' ') {
					continue;
				}
				if(buscarLetra==m3.getContenido().charAt(i)) {
					contador++;
		}
		}
	}
	break;
	
	case 4:
	System.out.println("Elige el mensaje a invertir(1-3)");	
	numero=teclado.nextInt();
	teclado.nextLine();
	String invertida="";
	switch (numero) {
	case 1:
		System.out.println("El contenido original es: "+m1.getContenido());
		for(int i=m1.getContenido().length()-1;i>=0;i--) {
			invertida=invertida+m1.getContenido().charAt(i);
		}
		break;
	case 2:
		System.out.println("El contenido original es: "+m2.getContenido());
		for(int i=m2.getContenido().length()-1;i>=0;i--) {
			invertida=invertida+m2.getContenido().charAt(i);
		}
		break;
	case 3:
		System.out.println("El contenido original es: "+m3.getContenido());
		for(int i=m3.getContenido().length()-1;i>=0;i--) {
			invertida=invertida+m3.getContenido().charAt(i);
		}
		break;
	}
	break;
	case 5:
		System.out.println("Elige el mensaje a (1-3)");	
		numero=teclado.nextInt();
		teclado.nextLine();	
		String titulo="";
		switch(numero) {
		case 1:
		System.out.println("El contenido original es:" +m1.getContenido());
		titulo=titulo+Character.toUpperCase(m1.getContenido().charAt(0));
		for(int i=1; i<m1.getContenido().length();i++) {
		if(m1.getContenido().charAt(i)==' ') {
		Character.toUpperCase(buscarLetra);	
		}
		}
		}
}
	}
}
	
