package UT05.ExpresionesRegulares;

import com.google.gson.Gson;

public class PerfilUsuario {

	public static void main(String[] args) {
		
		String informacion= "{\"nombre\":\"Luisa\",\"edad\":30,\"email\":\"luisa@mail.com\"}";
		
		Gson deserializador= new Gson();
		
		Usuario miUsuario= deserializador.fromJson(informacion, Usuario.class);
		
		System.out.println("El email es: "+miUsuario.getEmail());

	}

}
