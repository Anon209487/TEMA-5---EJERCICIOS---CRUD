package tema5boletin1;

public class Articulo {

	private String nombre;
	private double precio;
	static final double IVA = 0.21;
	private int cuantosQuedan;

	public Articulo(String nombre, double precio, int cuantosQuedan) {
		this.nombre = nombre;
		this.precio = precio;
		this.cuantosQuedan = cuantosQuedan;
	}

	public double getPVP() {
		return this.precio = IVA * this.precio;

	}

	public double getPVPDescuento(double descuento) {

		return this.precio = descuento * this.precio * IVA;

	}

	public int vender(int cantidad) {

		return this.cuantosQuedan = cantidad - this.cuantosQuedan;

	}

	public int almacenar(int cantidad) {

		return this.cuantosQuedan = cantidad + this.cuantosQuedan;

	}

	public String toString() {
		String mostrarDatoS = this.nombre + this.precio + this.cuantosQuedan;
		return mostrarDatoS;
	}
}
