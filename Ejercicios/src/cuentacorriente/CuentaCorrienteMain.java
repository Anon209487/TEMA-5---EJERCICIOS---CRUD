package cuentacorriente;

import java.util.Scanner;

public class CuentaCorrienteMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int seleccion = 0;
		String dni;
		String nombre;
		double saldoInicial;
		double importe;
		while (seleccion != 6) {
			System.out.println("------------------------");
			System.out.println("- 1 Listado            -");
			System.out.println("- 2 Alta               -");
			System.out.println("- 3 Baja               -");
			System.out.println("- 4 sacarDinero        -");
			System.out.println("- 5 ingresarDinero     -");
			System.out.println("- 6 Salir              -");
			System.out.println("- escoja opcion        -");     
			System.out.println("------------------------");
			seleccion = sc.nextInt();
			switch (seleccion) {
			case 1:
				CuentaCorrienteArray.listarEmpleados();
				break;

			case 2:
				System.out.println("escoja dni,nombre,saldoInicial:");
				dni = sc.next();
				nombre = sc.next();
				saldoInicial = sc.nextDouble();
				CuentaCorrienteArray.nuevoCuenta(dni, nombre, saldoInicial);
				break;
			case 3:
				System.out.println("escoja dni:");
				dni = sc.next();
				CuentaCorrienteArray.eliminarCuenta(dni);
				break;
			case 4:
				System.out.println("importe, dni:");
				importe = sc.nextDouble();
				dni = sc.next();
				CuentaCorrienteArray.sacarDinero(importe, dni);
				break;
			case 5:
				System.out.println("importe, dni:");
				importe = sc.nextDouble();
				dni = sc.next();
				CuentaCorrienteArray.ingresarDinero(importe, dni);
				break;
			case 6:
				System.out.println("Ha salido del programa:");
				break;
			}

		}
		sc.close();
	}
}
