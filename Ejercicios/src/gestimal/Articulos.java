package gestimal;

/**
 * FUNCION OBJETO
 */

public class Articulos {
	private int codigo;
	private double precioCompra;
	private double precioVenta;
	private String descripcion;
	int stock;

	public Articulos() {

	}

	public Articulos(int codigo, double precioVenta, double precioCompra, String descripcion, int stock) {
		if (!"".equals(descripcion) && descripcion != null) {
			this.descripcion = descripcion;
		}
		if (codigo > 0) {
			this.codigo = codigo;
		}
		if (precioVenta > 0) {
			this.precioVenta = precioVenta;
		}
		if (precioCompra > 0) {
			this.precioCompra = precioCompra;
		}

		if (stock > 0) {
			this.stock = stock;
		}

	}

	public String toString() {
		return (this.codigo + " " + this.precioVenta + " " + this.precioCompra + " " + this.descripcion + " "
				+ this.stock);

	}

	public int entradaMercancia(int cantidadEntrada) {
		int nuevoStock;
		this.stock = this.stock + cantidadEntrada;
		nuevoStock = this.stock;
		return nuevoStock;

	}

	public int SalidaMercancía(int cantidadSalida) {
		int nuevoStock;
		if (cantidadSalida < this.stock) {
			this.stock = this.stock - cantidadSalida;
		}
		nuevoStock = this.stock;
		return nuevoStock;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setstock(int Stock) {
		this.stock = Stock;
	}

	public int getstock() {
		return stock;
	}
}
