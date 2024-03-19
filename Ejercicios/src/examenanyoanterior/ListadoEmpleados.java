/**
 * 
 */
package examenanyoanterior;

/**
 * 
 */
public class ListadoEmpleados {
	public static Empleado[] listaEmpleados = new Empleado[9];
	public static int posicionLibre;

	public static void listarEmpleados() {
		int i = 0;
		while (listaEmpleados[i] != null || i > listaEmpleados.length) {
			System.out.println(
					"Nombre: " + listaEmpleados[i].getNombre() + ", apellidos: " + listaEmpleados[i].getApellidos());
			i++;
		}

	}

	public static boolean añadirEmpleado(String nombre, String apellidos, String sexo) {
		boolean verificacionEmpleadoAnyadido = false;
		int i = 0;
		while (listaEmpleados[i] != null || i > listaEmpleados.length) {
			i++;
		}
		if (listaEmpleados[i] == null) {
			listaEmpleados[i] = new Empleado(nombre, apellidos, sexo);
			verificacionEmpleadoAnyadido = true;

		}
		return verificacionEmpleadoAnyadido;
	}

	public static void modificarEmpleado(String nombre, String apellidos, String nombreNuevo, String apellidoNuevo,
			String sexoNuevo) {
		for (int j = 0; j < 9; j++) {
			if (listaEmpleados[j] != null && listaEmpleados[j].getNombre().equals(nombre)
					&& listaEmpleados[j].getApellidos().equals(apellidos)) {
				listaEmpleados[j].setNombre(nombreNuevo);
				listaEmpleados[j].setApellidos(apellidoNuevo);
				listaEmpleados[j].setSexo(sexoNuevo);
			}
		}
	}

	public static void eliminarEmpleado(String nombre, String apellidos) {

		for (int j = 0; j < listaEmpleados.length;) {
			if (listaEmpleados[j] != null && listaEmpleados[j].getNombre().equals(nombre)
					&& listaEmpleados[j].getApellidos().equals(apellidos)) {
				listaEmpleados[j] = null;
			}
		}
	}
}
