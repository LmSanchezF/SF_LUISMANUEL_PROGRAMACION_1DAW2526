package Unidad4;

public class Bicicleta extends Vehiculo {

	@Override
	public void acelerar() {
		System.out.println(" La bicicleta acelera"+ velocidad +"kilometros por hora");
	}

	@Override
	public void frenar() {
		System.out.println(" La bicicleta frena");

}
}
