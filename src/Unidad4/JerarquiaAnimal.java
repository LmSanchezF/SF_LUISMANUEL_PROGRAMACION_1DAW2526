package Unidad4;

import Unidad4.JerarquiaAnimal;

public class JerarquiaAnimal {

	public static void main(String[] args) {
		
		Animal a= new Animal();
		Perro p= new Perro();
		Gato g= new Gato();
		Pajaro j= new Pajaro();

		a.sonido();
		p.sonido();
		g.sonido();
		j.sonido();
		a.comer();
		p.dormir();
		g.comer();
		j.dormir();
	}

}
