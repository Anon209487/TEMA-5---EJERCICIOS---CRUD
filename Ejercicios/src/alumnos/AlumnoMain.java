package alumnos;

import java.util.Scanner;


/**
 * boletin 2 act 1
 */
public class AlumnoMain {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String nombre;
		int seleccion;
		int posicionAlumno;
		double notaMedia;
		boolean salida = false;

		while (salida == false) {
			System.out.print("1. Listado.\r\n" + "2. Nuevo Alumno.\r\n"  + "3. Borrar.\r\n"
					+ "4. Salir.\r\n" + "");
			seleccion = myObj.nextInt();

			switch (seleccion) {
			case 1:
				alumnosArray.Listado();
				break;
			case 2:
				System.out.println("introduzca nombre y nota media");
				nombre = myObj.next();
				notaMedia = myObj.nextDouble();
				alumnosArray.nuevoAlumno(nombre, notaMedia);

				break;
			case 3:
				System.out.println("introduzca la posicion del alumno en lista");
				posicionAlumno = (int) myObj.nextDouble();
				alumnosArray.eliminarAlumno(posicionAlumno);
				break;
			case 4:
				salida = true;
				break;
			}
		}
		myObj.close();
	}
}