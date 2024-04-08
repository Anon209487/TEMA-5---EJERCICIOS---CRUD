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
		setDescripcion(descripcion);

		setCodigo(codigo);

		setPrecioVenta(precioVenta);

		setPrecioCompra(precioCompra);

		setstock(stock);

	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		if (precioCompra > 0) {
			this.precioCompra = precioCompra;
		}
	}

	public int getCodigo() {
		return codigo;
	}

	private void setCodigo(int codigo) {

		if (codigo > 0) {
			this.codigo = codigo;
		}
	}

	public double getPrecioVenta() {
		return precioVenta;

	}

	public void setPrecioVenta(double precioVenta) {
		if (precioVenta > 0) {
			this.precioVenta = precioVenta;
		}

	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		if (!"".equals(descripcion) && descripcion != null) {
			this.descripcion = descripcion;
		}

	}

	public void setstock(int Stock) {
		if (stock > 0) {
			this.stock = Stock;
		}
	}

	public int getstock() {
		return stock;
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

	public String toString() {
		return (this.codigo + " " + this.precioVenta + " " + this.precioCompra + " " + this.descripcion + " "
				+ this.stock);

	}

	public boolean equals(Object obj) {
		Articulos ArticulosComparacion = (Articulos) obj;
		return this.codigo == ArticulosComparacion.getCodigo();

	}
}
