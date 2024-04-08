package cuentacorriente;

import java.util.Scanner;

public class CuentaCorrienteMain {
	public static void main(String[] args) {
		Scanner sc = extracted();
		int seleccion = 0;
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
				CuentaCorrienteMain.nuevoCuenta();
				break;
			case 3:
				CuentaCorrienteMain.eliminarCuenta();
				break;
			case 4:
				CuentaCorrienteMain.sacarDinero();
				break;
			case 5:
				CuentaCorrienteMain.ingresarDinero();
				break;
			case 6:
				System.out.println("Ha salido del programa:");
				break;
			}

		}
		sc.close();
	}

	private static void nuevoCuenta() {
		// TODO Auto-generated method stub
		double saldoInicial;
		String dni;
		String nombre;
		System.out.println("escoja dni,nombre,saldoInicial:");
		dni = extracted().next();
		nombre = extracted().next();
		saldoInicial = extracted().nextDouble();
		CuentaCorrienteArray.nuevoCuenta(dni, nombre, saldoInicial);
	}

	private static void ingresarDinero() {
		// TODO Auto-generated method stub
		double importe;
		String dni;
		System.out.println("importe, dni:");
		importe = extracted().nextDouble();
		dni = extracted().next();
		CuentaCorrienteArray.ingresarDinero(importe, dni);
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

	private static void sacarDinero() {
		// TODO Auto-generated method stub
		double importe;
		String dni;
		System.out.println("importe, dni:");
		importe = extracted().nextDouble();
		dni = extracted().next();
		CuentaCorrienteArray.sacarDinero(importe, dni);
	}

	private static void eliminarCuenta() {
		// TODO Auto-generated method stub
		System.out.println("escoja dni:");
		String dni;
		dni = extracted().next();
		CuentaCorrienteArray.eliminarCuenta(dni);

	}
}
