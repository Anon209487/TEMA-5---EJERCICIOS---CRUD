/**
 * 
 */
package cuentacorriente;

/**
 * 
 */

public class CuentaCorriente {
	private String dni;
	private String nombre;
	private double saldoInicial;

	public CuentaCorriente() {
	}

	public CuentaCorriente(String dni, double saldoInicial) {
		this.dni = dni;
		this.saldoInicial = saldoInicial;

	}

	public CuentaCorriente(String dni, String nombre, double saldoInicial) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldoInicial = saldoInicial;

	}

	public double sacarDinero(double cantidadAsacar) {
		this.saldoInicial = this.saldoInicial - cantidadAsacar;
		double sacarDinero = this.saldoInicial - cantidadAsacar;

		return sacarDinero;
	}

	public double Ingresardinero(double cantidadAingresar) {
		this.saldoInicial = cantidadAingresar + this.saldoInicial;
		double sacarDinero = cantidadAingresar + this.saldoInicial;

		return sacarDinero;
	}

	public String toString() {
		String mostrarDatoS = " dni: " + this.dni + " nombre: " + this.nombre + " saldoInicial: " + this.saldoInicial;
		return mostrarDatoS;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

}