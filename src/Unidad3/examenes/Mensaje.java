package Unidad3.examenes;

public class Mensaje {

private String autor;
private String contenido;
private int longitud;
private int palabras;

public Mensaje(String autor, String contenido) {
this.autor= autor;
this.contenido=contenido;



//Vamos a calcula la longitud
longitud=0;
palabras=1;
for(int i=0; i<contenido.length();i++) {
if(contenido.charAt(i)!=' ') {}
longitud++;
}

//Vamos a contar las palabras

for(int i=0; i<contenido.length();i++) {
if(contenido.charAt(i)!=' ') {}
palabras++;
		}
	
	
	}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public String getContenido() {
	return contenido;
}

public void setContenido(String contenido) {
	this.contenido = contenido;
}

public int getLongitud() {
	return longitud;
}

public void setLongitud(int longitud) {
	this.longitud = longitud;
}

public int getPalabras() {
	return palabras;
}

public void setPalabras(int palabras) {
	this.palabras = palabras;
}
/**
 * Mostramos todos los atributos de la clase mensaje
 */
public void mostrar() {
System.out.println("Autor:" +autor);
System.out.println("contenido:" +contenido);
System.out.println("Longitud sin espacios:" +longitud);
System.out.println("Numero de palabras:" +palabras);
}
}
