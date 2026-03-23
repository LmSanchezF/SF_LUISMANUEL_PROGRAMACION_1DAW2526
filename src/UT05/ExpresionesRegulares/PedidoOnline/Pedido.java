package UT05.ExpresionesRegulares.PedidoOnline;

import java.util.ArrayList;

import com.google.gson.Gson;

import UT05.ExpresionesRegulares.Usuario;

public class Pedido {

	int id=0;

	ArrayList<Producto> articulo= new ArrayList<>();	
	
	
	
public Pedido(int id) {
		super();
		this.id = id;
		
	}



public static void main(String[] args) {


Producto productoUno= new Producto("Teclado", 19.99);

Producto productoDos= new Producto("Raton", 9.99);

Producto productoTres= new Producto("Monitor", 109.99);

Pedido pedidoUno= new Pedido(1);

pedidoUno.articulo.add(productoUno);
pedidoUno.articulo.add(productoDos);
pedidoUno.articulo.add(productoTres);

Gson serializador = new Gson();

String json = serializador.toJson(pedidoUno);

System.out.println(json);






}
	
	
}
