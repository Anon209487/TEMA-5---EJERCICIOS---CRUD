package gestimal;

public class ArrayArticulos {

	static Articulos articulos[] = new Articulos[49];

	public static void nuevoPedido(int codigo, double precioVenta, double precioCompra, String descripcion, int stock) {
		int i = 0;

		while (ArrayArticulos.articulos[i] != null && i < articulos.length) {
			i++;

		}
		if (ArrayArticulos.articulos[i] == null) {

			ArrayArticulos.articulos[i] = new Articulos(codigo, precioVenta, precioCompra, descripcion, stock);
		}
	}

	public static void EntradaMercancía(int cantidadEntrada, int codigo) {

		articulos[codigo].entradaMercancia(cantidadEntrada);

	}

	public static void salidaMercancia(int cantidadSalida, int codigo) {

		articulos[codigo].SalidaMercancía(cantidadSalida);

	}

	public static void Listado() {
		for (int i = 0; i < articulos.length; i++) {
			if (articulos[i] != null) {
				System.out.println(articulos[i]);
			}

		}

	}

	public static void baja(int posicionArticulo) {

		articulos[posicionArticulo] = null;
	}

	public static void modificarArticulo(int posicionArticulo, int codigo, double precioVenta, double precioCompra,
			String descripcion, int stock) {

		articulos[posicionArticulo].setDescripcion(descripcion);

		articulos[posicionArticulo].setPrecioVenta(precioVenta);

		articulos[posicionArticulo].setPrecioCompra(precioCompra);

		articulos[posicionArticulo].setstock(stock);

	}
}