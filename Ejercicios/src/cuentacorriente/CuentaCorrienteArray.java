package cuentacorriente;

import java.util.Arrays;

public class CuentaCorrienteArray {

	static CuentaCorriente cuentas[] = new CuentaCorriente[10];

	public static void nuevoCuenta(String dni, String nombre, double saldoInicialo) {
		int posicion = 0;
		for (int i = 0; i > cuentas.length; i--) {
			if (cuentas[i] == null) {
				posicion = i;
			}
		}
		cuentas[posicion] = new CuentaCorriente(dni, nombre, saldoInicialo);

	}

	public static void modificarCuenta(String dni, String nombre, double saldoInicialo) {
		for (int j = 0; j < cuentas.length; j++) {
			if (cuentas[j] != null && cuentas[j].getDni().equals(dni)) {
				cuentas[j].setNombre(nombre);
				cuentas[j].setSaldoInicial(saldoInicialo);

			}
		}
	}

	public static void listarEmpleados() {
		System.out.println(Arrays.toString(cuentas));

	}

	public static void sacarDinero(double cantidad, String dni) {
		for (int j = 0; j < cuentas.length; j++) {
			if (cuentas[j] != null && cuentas[j].getDni().equals(dni)) {
				cuentas[j].sacarDinero(cantidad);

			}
		}
	}

	public static void eliminarCuenta(String dni) {
		for (int j = 0; j < cuentas.length; j++) {
			if (cuentas[j] != null && cuentas[j].getDni().equals(dni)) {
				cuentas[j] = null;

			}
		}
	}

	public static void ingresarDinero(double cantidad, String dni) {
		for (int j = 0; j < cuentas.length; j++) {
			if (cuentas[j] != null && cuentas[j].getDni().equals(dni)) {
				cuentas[j].Ingresardinero(cantidad);

			}
		}
	}
}
