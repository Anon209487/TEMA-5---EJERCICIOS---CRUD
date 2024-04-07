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

	/**
	 * 
	 */
	public static void listarEmpleados() {
		int i = 0;
		while (listaEmpleados[i] != null || i > listaEmpleados.length) {
			System.out.println("Lista de empleados: " + "\n" + listaEmpleados[i]);
			i++;
		}

	}

	/**
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param sexo
	 * @return
	 */
	public static boolean añadirEmpleado(String nombre, String apellidos, String sexo) {
		boolean verificacion = false;
		Empleado empleadoHaAnyadir = new Empleado(nombre, apellidos, sexo);
		boolean verificacionEmpleadoAnyadido = verificarEmpleado(empleadoHaAnyadir, nombre, apellidos);
		int i = 0;
		while (listaEmpleados[i] != null || i > listaEmpleados.length) {
			i++;
		}
		if (listaEmpleados[i] == null && verificacionEmpleadoAnyadido == false) {
			verificacion = true;
			listaEmpleados[i] = empleadoHaAnyadir;

		}
		return verificacion;

	}

	/**
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param nombreNuevo
	 * @param apellidoNuevo
	 * @param sexoNuevo
	 */
	public static boolean modificarEmpleado(String nombre, String apellidos, String nombreNuevo, String apellidoNuevo,
			String sexoNuevo) {
		boolean verificacionmodificarEmpleado = false;
		Empleado empleadoHaAnyadir = new Empleado(nombre, apellidos, sexoNuevo);
		for (int j = 0; j < 9; j++) {

			if (listaEmpleados[j] != null && (listaEmpleados[j].equals(empleadoHaAnyadir))) {
				verificacionmodificarEmpleado = true;
				listaEmpleados[j].setNombre(nombreNuevo);
				listaEmpleados[j].setApellidos(apellidoNuevo);
				listaEmpleados[j].setSexo(sexoNuevo);
			}
		}
		return verificacionmodificarEmpleado;
	}

	/**
	 * 
	 * @param nombre
	 * @param apellidos
	 */
	public static boolean eliminarEmpleado(String nombre, String apellidos, String sexo) {
		boolean verificacionmodificarEmpleado = false;
		Empleado empleadoHaAnyadir = new Empleado(nombre, apellidos, sexo);
		for (int j = 0; j < 9; j++) {
			if (listaEmpleados[j] != null && (listaEmpleados[j].equals(empleadoHaAnyadir))) {
				verificacionmodificarEmpleado = true;
				listaEmpleados[j] = null;

			}
		}
		return verificacionmodificarEmpleado;
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
