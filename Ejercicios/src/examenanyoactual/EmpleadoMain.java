/**
 * 
 */
package examenanyoactual;

import java.util.Scanner;

/**
 * 
 */
public class EmpleadoMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bienvenido:");

		int key = 1;
		while (key != 0) {
			EmpleadoMain.menu();
			key = extracted().nextInt();
			switch (key) {
			case 1:
				EmpleadoMain.anyadirEmpleado();
				break;
			case 2:
				EmpleadoArray.listarEmpleados();
				break;
			case 3:
				EmpleadoMain.modificarHorasExtra();
				break;
			case 4:
				EmpleadoMain.setHorasExtra();
				break;
			case 5:
				EmpleadoMain.eliminarEmpleado();
				break;
			case 0:
				System.out.println("Ha salido");
				break;
			default:
				break;
			}

		}
		System.out.println("Adios");
	}

	public static void menu() {
		System.out.println("----------------------------------------");
		System.out.println("1:Añadir empleado.");
		System.out.println("2:Listar empleados.");
		System.out.println("3:Modificar horas extra.");
		System.out.println("4:Modificar importe horas extra.");
		System.out.println("5:Eliminar empleado.");
		System.out.println("0:salir");
		System.out.println("----------------------------------------");
	}

	public static void eliminarEmpleado() {

		String dni = "";
		System.out.println("Intoduza el DNI:");
		dni = extracted().nextLine();
		Empleado emp = new Empleado(dni);
		System.out.println("se ha eliminado el empleado?: " + EmpleadoArray.eliminarEmpleado(emp));

	}

	public static void anyadirEmpleado() {

		Scanner sc = extracted();
		String dni;
		String nombre;
		double sueldoBase;
		int horasExtra;
		System.out.println("Intoduza el dni:");
		dni = sc.nextLine();
		System.out.println("Intoduza el nombre:");
		nombre = sc.nextLine();
		System.out.println("Intoduza el sueldoBase:");
		sueldoBase = sc.nextDouble();
		System.out.println("Intoduza las horas extra:");
		horasExtra = sc.nextInt();
		Empleado emp = new Empleado(dni, nombre, sueldoBase, horasExtra);
		System.out.println("se ha anyadidio el empleado?: " + EmpleadoArray.anyadirEmpleado(emp));

	}

	public static void modificarHorasExtra() {

		Scanner sc = extracted();
		String dni = "";
		int horas = 0;
		System.out.println("Intoduza el DNI:");
		dni = sc.nextLine();
		System.out.println("Intoduza el numero de horas extra:");
		horas = sc.nextInt();
		Empleado emp = new Empleado(dni);
		System.out.println("se ha modificado las horas extras?: " + EmpleadoArray.modificarHorasExtra(emp, horas));

	}

	public static void setHorasExtra() {

		Scanner sc = extracted();
		double importeHorasExtra = 0;
		System.out.println("Intoduza el importe de horas extra:");
		importeHorasExtra = sc.nextDouble();
		Empleado.setImporteHoraExtra(importeHorasExtra);
		System.out.println("El nuevo importe es horas extra:" + Empleado.getImporteHoraExtra());

	}

	public static Scanner extracted() {
		return new Scanner(System.in);
	}
}
