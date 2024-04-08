/**
 * 
 */
package examenanyoanterior;

/**
 * 
 */
public class ListadoEmpleados {
	public static Empleado[] listaEmpleados = new Empleado[10];
	public static int posicionLibre;

	/**
	 * 
	 */
	public static void listarEmpleados() {

		for (int j = 0; j < listaEmpleados.length; j++) {
			if (listaEmpleados[j] != null) {
				System.out.println("Lista de empleados: " + "\n" + listaEmpleados[j]);
			}
		}

	}

	/**
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param sexo
	 * @return
	 */
	public static void añadirEmpleado(String nombre, String apellidos, String sexo) {

		Empleado empleadoHaAnyadir = new Empleado(nombre, apellidos);
		boolean verificacionEmpleadoAnyadido = verificarEmpleado(empleadoHaAnyadir, nombre, apellidos);
		int i = 0;
		while (listaEmpleados[i] != null || i < listaEmpleados.length) {
			i++;
		}
		if (listaEmpleados[i] == null && verificacionEmpleadoAnyadido == false) {
			listaEmpleados[i] = empleadoHaAnyadir;

		}

	}

	/**
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param nombreNuevo
	 * @param apellidoNuevo
	 * @param sexoNuevo
	 */
	public static void modificarEmpleado(String nombre, String apellidos, String nombreNuevo, String apellidoNuevo,
			String sexoNuevo) {

		Empleado empleadoHaAnyadir = new Empleado(nombre, apellidos, sexoNuevo);

		for (int j = 0; j < 9; j++) {

			if (listaEmpleados[j] != null && (listaEmpleados[j].equals(empleadoHaAnyadir))) {
				listaEmpleados[j].setNombre(nombreNuevo);
				listaEmpleados[j].setApellidos(apellidoNuevo);
				listaEmpleados[j].setSexo(sexoNuevo);
			}
		}

	}

	/**
	 * 
	 * @param nombre
	 * @param apellidos
	 */
	public static void eliminarEmpleado(String nombre, String apellidos) {
		Empleado empleadoHaAnyadir = new Empleado(nombre, apellidos);
		for (int j = 0; j < 9; j++) {
			if (listaEmpleados[j] != null && (listaEmpleados[j].equals(empleadoHaAnyadir))) {
				listaEmpleados[j] = null;

			}
		}

	}

	public static boolean verificarEmpleado(Empleado empleadoHaAnyadir, String nombre, String apellidos) {
		boolean verificacionEmpleadoAnyadido = false;
		for (int i = 0; i < listaEmpleados.length; i++) {
			if (listaEmpleados[i] != null && listaEmpleados[i].equals(empleadoHaAnyadir))
				verificacionEmpleadoAnyadido = true;
		}

		return verificacionEmpleadoAnyadido;

	}
}
