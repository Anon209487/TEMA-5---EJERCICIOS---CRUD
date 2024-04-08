package alumnos;

import java.util.Scanner;

/**
 * boletin 2 act 1
 */
public class AlumnoMain {

	public static void main(String[] args) {

		int seleccion = 0;

		while (seleccion != 4) {
			System.out.print("1. Listado.");
			System.out.print("2. Nuevo Alumno");
			System.out.print("3. Borrar.");
			System.out.print("4. Salir");

			seleccion = extracted().nextInt();

			switch (seleccion) {
			case 1:
				alumnosArray.Listado();
				break;
			case 2:
				AlumnoMain.nuevoAlumno();
				break;
			case 3:
				AlumnoMain.eliminarAlumno();
				break;

			}
		}

	}

	private static void eliminarAlumno() {
		// TODO Auto-generated method stub

		int posicionAlumno;
		System.out.println("introduzca la posicion del alumno en lista");
		posicionAlumno = extracted().nextInt();
		alumnosArray.eliminarAlumno(posicionAlumno);
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

	private static void nuevoAlumno() {
		// TODO Auto-generated method stub
		Scanner myObj = extracted();
		double notaMedia;
		String nombre;
		System.out.println("introduzca nombre y nota media");
		nombre = myObj.next();
		notaMedia = myObj.nextDouble();
		alumnosArray.nuevoAlumno(nombre, notaMedia);
	}
}