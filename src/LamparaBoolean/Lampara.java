package LamparaBoolean;

public class Lampara {

	//Atributos
	
	String lampara;
	boolean encendida;
	
	public Lampara() {
		encendida=false;
	}
	
	
	
	public Lampara(String lampara, boolean encendida) {
		super();
		this.lampara = lampara;
		this.encendida = encendida;
	}
	public static void main(String[] args) {
	//variables
	
 Lampara clasica= new Lampara();

		clasica.encender();
		clasica.apagar();
		
		}
	//Metodos
			public void encender() {
				encendida = true;
			System.out.println("La lampara esta encendida ");
			
				
				}
			public void apagar() {
				encendida = false;
			System.out.println("La lampara esta apagada " );
			
				
				}
}
