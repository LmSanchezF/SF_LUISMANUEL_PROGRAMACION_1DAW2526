package Unidad1;

public class ConstantesLiterales {
	public static void main(String[] args) {
		 // Constantes
		 final double IVA = 0.21;
		 final int DIAS_SEMANA = 7;
		 final double SALARIO_MINIMO= 1080.0;
		 // Uso de literales
		 int numero = 100; // literal entero
		 double precio = 19.99; // literal decimal
		 char inicial = 'J'; // literal carácter
		 String mensaje = "Java"; // literal String
		 boolean activo = true; // literal booleano
		 // Ejemplo de uso de una constante
		 double precioConIVA = precio + (precio * IVA);
		 System.out.println("Número: " + numero);
		 System.out.println("Precio con IVA: " + precioConIVA);
		 System.out.println("Días de la semana: " + DIAS_SEMANA);
		 System.out.println("Inicial: " + inicial);
		 System.out.println("Mensaje: " + mensaje);
		 System.out.println("Activo: " + activo);
		 System.out.println("Salario minimo: "+SALARIO_MINIMO);
		 }
}
