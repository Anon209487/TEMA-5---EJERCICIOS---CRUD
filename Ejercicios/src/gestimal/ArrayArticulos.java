package gestimal;

import java.util.Arrays;
 
public class ArrayArticulos {

	static Articulos articulos[] = new Articulos[49];

	public static void nuevoPedido(int codigo, double precioVenta, double precioCompra, String descripcion, int stock) {
		int i = 0;

		while (ArrayArticulos.articulos[i] != null && i < 50) {
			i++;

		}
		if (ArrayArticulos.articulos[i] == null) {

			ArrayArticulos.articulos[i] = new Articulos(codigo, precioVenta, precioCompra, descripcion, stock);
		}
	}

	public static void EntradaMercancía(int cantidadEntrada, int posicionArticulo) {

		articulos[posicionArticulo].entradaMercancia(cantidadEntrada);

	}

	public static void salidaMercancia(int cantidadSalida, int posicionArticulo) {

		articulos[posicionArticulo].SalidaMercancía(cantidadSalida);

	}

	public static void Listado() {
		Arrays.toString(articulos);
	}

	public static void baja(int posicionArticulo) {

		articulos[posicionArticulo] = null;
	}

	public static void modificarArticulo(int posicionArticulo, int codigo, double precioVenta, double precioCompra,
			String descripcion, int stock) {
		if (descripcion != null && descripcion != "") {
			articulos[posicionArticulo].setDescripcion(descripcion);
		}
		if (codigo > 0) {
			articulos[posicionArticulo].setCodigo(codigo);
		}
		if (precioVenta > 0) {
			articulos[posicionArticulo].setPrecioVenta(precioVenta);
		}
		if (precioCompra > 0) {
			articulos[posicionArticulo].setPrecioCompra(precioCompra);
		}

		if (stock > 0) {
			articulos[posicionArticulo].setstock(stock);
		}

	}
}