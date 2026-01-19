package Unidad4.FichaHerencia.VelasGata;

public class ProgramaVelas {

	public static void main(String[] args) {
	Vela velaNormal= new Vela();
	velaNormal.setAltura(0.15);
	velaNormal.setColor("Blanco");
	
	VelaPerfumada velaFrutas= new VelaPerfumada();
	velaFrutas.setAltura(0.18);
	velaFrutas.setColor("Rojo");
	velaFrutas.setAroma("Cereza");

System.out.println("VELA NORMAL");
System.out.println("Vela de color"+velaNormal.getColor());
System.out.println("Altura: " +velaNormal.getAltura());
System.out.println("Precio: "+velaNormal.getPrecio()+"euros");

System.out.println("VELA PERFUMADA");
System.out.println("Vela de color"+velaFrutas.getColor());
System.out.println("Altura: " +velaFrutas.getAltura());
System.out.println("Precio: "+velaFrutas.getPrecio()+"euros");
System.out.println("Esta vela huele a"+velaFrutas.getAroma());
	}

}
