package alumnos;

import java.util.Arrays;

public class alumnosArray {

	static public Alumno Alumnos[] = new Alumno[29];

	public static void nuevoAlumno(String nombre, double notaMedia) {
		int i = 0;

		while (alumnosArray.Alumnos[i] != null && i < 50) {
			i++;

		}
		if (alumnosArray.Alumnos[i] == null) {

			alumnosArray.Alumnos[i] = new Alumno(nombre, notaMedia);
		}
	}

	public static void Listado() {
		for (int i = 0; i < Alumnos.length; i++) {
			
		System.out.println(alumnosArray.Alumnos[i] );

			
		}
	}

	public static void eliminarAlumno(int posicionAlumno) {
		alumnosArray.Alumnos[posicionAlumno] = null;

	}
}
