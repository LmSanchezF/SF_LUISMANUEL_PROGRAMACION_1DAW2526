package Unidad4.FichaHerencia.Universidad;

public class empleadoUniversitario extends Persona {
protected int numSegSocial;
protected int salarioAnual;
protected String departamento;

public void setnumSegSocial() {
System.out.println("Introduce tu numero de la seguridad social");
this.numSegSocial=teclado.nextInt();
}

public void setNumSegSocial() {
System.out.println("Introduce tu salario");
this.salarioAnual=teclado.nextInt();
}
public void setDepartamento() {
System.out.println("Introduce tu departamento");
this.departamento=teclado.nextLine();
}
@Override
public String toString() {
	return "empleadoUniversitario [numSegSocial=" + numSegSocial + ", salarioAnual=" + salarioAnual + ", departamento="
			+ departamento + ", nombre=" + nombre + ", Apellidos=" + Apellidos + ", direccion=" + direccion
			+ ", codigoPostal=" + codigoPostal + ", telefono=" + telefono + ", teclado=" + teclado + "]";
}



}
