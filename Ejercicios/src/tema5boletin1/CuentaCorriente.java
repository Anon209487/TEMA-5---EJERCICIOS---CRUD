package tema5boletin1;

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
		this.saldoInicial = cantidadAsacar - this.saldoInicial;
		double sacarDinero = cantidadAsacar - this.saldoInicial;

		return sacarDinero;
	}

	public double Ingresardinero(double cantidadAingresar) {
		this.saldoInicial = cantidadAingresar + this.saldoInicial;
		double sacarDinero = cantidadAingresar + this.saldoInicial;

		return sacarDinero;
	}

	public String toString() {
		String mostrarDatoS = this.dni + this.nombre + this.saldoInicial;
		return mostrarDatoS;
	}
}