package Unidad5.ArrayList;

import java.util.HashSet;
import java.util.Set;

public class bomboLoteria {

	public static void main(String[] args) {
		

		Set<Integer> bomboLoteria= new HashSet<>();
		int ale=0;
		
		while(bomboLoteria.size()<6) {
			ale=(int)(Math.random()*(49))+1;
			bomboLoteria.add(ale);
		}
		System.out.println("La combinacion ganadora de la loteria");
		System.out.println(bomboLoteria);
		
		
	}

}
