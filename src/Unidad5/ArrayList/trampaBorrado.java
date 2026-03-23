package Unidad5.ArrayList;
import java.util.ArrayList;
public class trampaBorrado {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros  = new ArrayList<>();
			numeros.add(10);
			numeros.add(20);
			numeros.add(15);
			numeros.add(30);
			numeros.add(45);
			numeros.add(12);
			
			/*numeros.removeIf(numeros->numeros);*/
			
			for (int i = 0; i < args.length; i++) {
				if (numeros.get(i)<=20) {
					numeros.remove(i);
					
				}
				
				
			}
			
			for (Integer resultado : numeros) {
				System.out.println(resultado);
			}
			
			
			
			
		

	}

}
