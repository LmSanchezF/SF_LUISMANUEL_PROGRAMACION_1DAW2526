package Unidad1;

public class Conversiones {
	 static void main(String[] args) {
		 // Conversión implícita
		 int x = 7;
		 double y = x; // int → double
		 System.out.println("Implícita: " + y);
		 // Conversión explícita
		 double a = 7.85;
		 int b = (int) a; // double → int
		 System.out.println("Explícita: " + b);
		 // char ↔ int
		 char letra = 'C';
		 int codigo = letra;
		 System.out.println("Código de 'C': " + codigo);
		 int num = 68;
		 char letra2 = (char) num;
		 System.out.println("Letra del 68: " + letra2);
		 // Pérdida de datos
		 int grande = 300;
		 byte pequeño = (byte) grande;
		 System.out.println("Conversión con pérdida: " + pequeño);
}
}