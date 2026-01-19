package Unidad4.FichaHerencia.Universidad;

import java.util.Scanner;

public class ListaUniversitaria {

	public static void main(String[] args) {
	
	empleadoUniversitario e1, e2, e3, e4;
	int contarEmpleados=0;
	Facultad d1, d2, d3;
	int contarFacultad=0;
	Estudiante a1, a2, a3, a4, a5, a6, a7;
	int contarEstudiante=0;
	Scanner teclado= new Scanner(System.in);
	do {
	System.out.println("¿Que quieres dar de alta?: Empleado(1), Docente(2),Estudiante(3) o salir(4)");
	int opcion=teclado.nextInt();
	switch(opcion) {
	case 1:
		if(contarEmpleados>4) {
			System.out.println("Error, no se pueden crear mas de 4 empleados");
		}else {
			switch(contarEmpleados) {
			case 0:
				e1.setNombre();
				e1.setApellidos();
				e1.setCodigoPostal();
				e1.setDepartamento();
				e1.setDireccion();
				e1.setsalarioAnual();
			}
		}
	}
	}while
	}

}
