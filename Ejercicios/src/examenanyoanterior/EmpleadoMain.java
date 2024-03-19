/**
 * 
 */
package examenanyoanterior;

import java.util.Scanner;

/**
 * 
 */
public class EmpleadoMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// RELLERNAR CONSTRUCTOR WMPLEADO
		String nombre;
		String apellidos;
		String nombreNuevo;
		String apellidosNuevo;
		String sexo;
		int seleccionMenuy = 0;
	
		
		System.out.println("hola: ");
		// TODO Auto-generated method stub
		while (seleccionMenuy != 5) {
		

			System.out.println("1 Añadir empleado: ");

			System.out.println("2 Listar empleados: ");

			System.out.println("3 Modificar empleado: ");

			System.out.println("4 Eliminar empleado: ");

			System.out.println("5 Salir:  ");
			seleccionMenuy = scanner.nextInt();
			switch (seleccionMenuy) {

			case 1:
				System.out.println("nombre: ");
				nombre = scanner.next();
				System.out.println("apellidos: ");
				apellidos = scanner.next();
				System.out.println("sexo: ");
				sexo = scanner.next();
				ListadoEmpleados.añadirEmpleado(nombre, apellidos, sexo);

				break;
			case 2:
				System.out.println("Lista de empleados: ");
				ListadoEmpleados.listarEmpleados();
				break;
			case 3:
				System.out.println("nombre: ");
				nombre = scanner.next();
				System.out.println("apellidos: ");
				apellidos = scanner.next();
				System.out.println("nombreNuevo: ");
				nombreNuevo = scanner.next();
				System.out.println("apellidosNuevo: ");
				apellidosNuevo = scanner.next();
				System.out.println("sexo: ");
				sexo = scanner.next();
				ListadoEmpleados.modificarEmpleado(nombre, apellidos, nombreNuevo, apellidosNuevo, sexo);
				break;
			case 4:
				System.out.println("nombre: ");
				nombre = scanner.next();
				System.out.println("apellidos: ");
				apellidos = scanner.next();
				ListadoEmpleados.eliminarEmpleado(nombre, apellidos);
				break;
			case 5:
			
			
				break;
			
		}
		}
		System.out.print("Ha salido ");
		scanner.close();
	}

}
