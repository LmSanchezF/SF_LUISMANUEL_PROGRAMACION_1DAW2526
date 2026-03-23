package Unidad5.ArrayList;
import java.util.ArrayList;
public class playlist_spotify {

	public static void main(String[] args) {
		
		ArrayList<String> playlist  = new ArrayList<>();
		playlist.add("Paquito el chocolatero");
		playlist.add("Ecuador");
		playlist.add("Stay");
		playlist.add("Save your tears");
		playlist.add("Hay un gallego en la luna");
		System.out.println(playlist);
		playlist.set(2, "Despacito");
		playlist.remove(1);
		System.out.println("Actualmente hay "+playlist.size()+" canciones en la lista");
	}

}
