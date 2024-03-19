 
package gestimal;

import java.util.Scanner;

/**
 * MAIN
 * 
 * @author fiero
 */
public class GESTIMAL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int seleccion = 0;
		int codigo = 0;
		double precioCompra = 0.1;
		double precioVenta = 0.1;
		String descripcion = "PACO";
		int posicionArticulo = 1;
		int stock = 40;
		while (seleccion != 7) {
			System.out.println(" 1 Listado");
			System.out.println(" 2 Alta");
			System.out.println(" 3 Baja");
			System.out.println(" 4 Modificación");
			System.out.println(" 5 Entrada de mercancía");
			System.out.println(" 6 Salida de mercancía");
			System.out.println(" 7 Salir");
			System.out.println(" escoja opcion");
			seleccion = sc.nextInt();
			if (seleccion == 1) {
				ArrayArticulos.Listado();
			}
			if (seleccion == 2) {
				ArrayArticulos.nuevoPedido(codigo, precioCompra, precioVenta, descripcion, stock);
			}
			if (seleccion == 3) {
				ArrayArticulos.baja(posicionArticulo);
			}
			if (seleccion == 4) {
				ArrayArticulos.modificarArticulo(posicionArticulo, codigo, precioVenta, precioCompra, descripcion,
						stock);
			}
			if (seleccion == 5) {
				ArrayArticulos.nuevoPedido(codigo, precioVenta, precioCompra, descripcion, stock);
			}
			if (seleccion == 6) {
				ArrayArticulos.salidaMercancia(stock, posicionArticulo);
			}

			sc.close();
		}
	}
}