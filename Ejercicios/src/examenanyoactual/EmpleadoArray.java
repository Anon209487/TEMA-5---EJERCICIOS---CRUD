/**
 * 
 */
package examenanyoactual;

/**
 * 
 */
public class EmpleadoArray {
	public static Empleado[] listaEmpleados = new Empleado[10];

	public static int posicionLibre() {
		int contador = 0;
		while (listaEmpleados[contador] != null && contador < listaEmpleados.length) {
			contador++;
		}
		if (contador == listaEmpleados.length) {
			contador = -1;
		}
		return contador;
	}

	public static int buscaEmpleado(Empleado e) {
		int contador = 0;
		int posicionEmpleado = -1;
		while (contador < listaEmpleados.length && posicionEmpleado == -1) {
			if (listaEmpleados[contador] != null && (e.equals(listaEmpleados[contador]))) {
				posicionEmpleado = contador;

			}
			contador++;
		}

		return posicionEmpleado;
	}

	public static void listarEmpleados() {
		for (int i = 0; i < listaEmpleados.length; i++) {
			if (listaEmpleados[i] != null) {
				System.out.println("numero del empleado: " + i + "\n" + listaEmpleados[i]);
			}
		}
	}

	public static boolean anyadirEmpleado(Empleado emp) {
		boolean anyadirEmpleadoVerificacion = false;

		int buscaEmpleadoSiExiste = buscaEmpleado(emp);
		int posicionLibre = posicionLibre();
		if (buscaEmpleadoSiExiste == -1 && posicionLibre != -1) {
			listaEmpleados[posicionLibre] = emp;
			anyadirEmpleadoVerificacion = true;
		}
		return anyadirEmpleadoVerificacion;
	}

	public static boolean modificarHorasExtra(Empleado emp, int horas) {
		boolean modificarHorasExtra;
		int busquedaEnEmpleados = buscaEmpleado(emp);

		if (busquedaEnEmpleados == -1) {
			modificarHorasExtra = false;
		} else {
			listaEmpleados[busquedaEnEmpleados].setHorasExtra(horas);
			modificarHorasExtra = true;
		}
		return modificarHorasExtra;
	}

	public static boolean eliminarEmpleado(Empleado emp) {
		boolean eliminarEmpleado;
		int busquedaEnEmpleados = buscaEmpleado(emp);

		if (busquedaEnEmpleados == -1) {
			eliminarEmpleado = false;
		} else {
			listaEmpleados[busquedaEnEmpleados] = null;
			eliminarEmpleado = true;
		}
		return eliminarEmpleado;
	}
}