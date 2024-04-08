/**
 * 
 */
package examenanyoanterior;

import java.util.Scanner;

/**
 * 
 */
public class EmpleadoMain {

	public static void main(String[] args) {
		Scanner scanner = extracted();

		int seleccionMenuy = 0;

		System.out.println("hola: ");

		while (seleccionMenuy != 5) {

			System.out.println("1 Añadir empleado: ");

			System.out.println("2 Listar empleados: ");

			System.out.println("3 Modificar empleado: ");

			System.out.println("4 Eliminar empleado: ");

			System.out.println("5 Salir:  ");

			seleccionMenuy = scanner.nextInt();
			switch (seleccionMenuy) {

			case 1:
				EmpleadoMain.añadirEmpleado();
				break;
			case 2:
				ListadoEmpleados.listarEmpleados();
				break;
			case 3:
				EmpleadoMain.modificarEmpleado();
				break;
			case 4:
				EmpleadoMain.eliminarEmpleado();
				break;

			}
		}
		System.out.print("Ha salido...");
		scanner.close();
	}

	/**
	 * 
	 */
	private static void eliminarEmpleado() {
		String nombre;
		String apellidos;
		System.out.println("nombre: ");
		nombre = extracted().next();
		System.out.println("apellidos: ");
		apellidos = extracted().next();
		ListadoEmpleados.eliminarEmpleado(nombre, apellidos);

	}

	/**
	 * 
	 */
	private static void modificarEmpleado() {
		String nombreNuevo;
		String apellidosNuevo;
		String nombre;
		String apellidos;
		String sexo;
		System.out.println("nombre: ");
		nombre = extracted().next();
		System.out.println("apellidos: ");
		apellidos = extracted().next();
		System.out.println("nombreNuevo: ");
		nombreNuevo = extracted().next();
		System.out.println("apellidosNuevo: ");
		apellidosNuevo = extracted().next();
		System.out.println("sexo: ");
		sexo = extracted().next();
		ListadoEmpleados.modificarEmpleado(nombre, apellidos, nombreNuevo, apellidosNuevo, sexo);

	}

	/**
	 * 
	 */
	private static void añadirEmpleado() {
		// TODO Auto-generated method stub
		String nombre;
		String apellidos;
		String sexo;
		System.out.println("nombre: ");
		nombre = extracted().next();
		System.out.println("apellidos: ");
		apellidos = extracted().next();
		System.out.println("sexo: ");
		sexo = extracted().next();
		ListadoEmpleados.añadirEmpleado(nombre, apellidos, sexo);

	}

	/**
	 * 
	 * @return
	 */
	private static Scanner extracted() {
		return new Scanner(System.in);
	}

}
