
package gestimal;

import java.util.Scanner;

/**
 * MAIN
 * 
 * @author fiero
 */
public class GESTIMAL {
	public static void main(String[] args) {
		Scanner sc = extracted();
		int seleccion = 0;
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
				GESTIMAL.nuevoPedido();
			}
			if (seleccion == 3) {
				GESTIMAL.baja();
			}
			if (seleccion == 4) {
				GESTIMAL.modificarArticulo();
			}
			if (seleccion == 5) {
				GESTIMAL.nuevoPedido();
			}
			if (seleccion == 6) {
				GESTIMAL.salidaMercancia();
			}

			sc.close();
		}
	}

	private static void salidaMercancia() {
		// TODO Auto-generated method stub
		int codigo = 1;
		int stock = 40;
		stock = extracted().nextInt();
		codigo = extracted().nextInt();
		ArrayArticulos.salidaMercancia(stock, codigo);

	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

	private static void baja() {
		Scanner sc = extracted();
		// TODO Auto-generated method stub
		int codigo = 1;
		codigo = sc.nextInt();
		ArrayArticulos.baja(codigo);
	}

	private static void modificarArticulo() {
		// TODO Auto-generated method stub
		Scanner sc = extracted();
		int codigo = 0;
		double precioCompra = 0;
		double precioVenta = 0;
		String descripcion = "";
		int posicionArticulo = 1;
		int stock = 0;
		codigo = sc.nextInt();
		precioCompra = sc.nextDouble();
		precioVenta = sc.nextDouble();
		descripcion = sc.nextLine();
		stock = sc.nextInt();
		ArrayArticulos.modificarArticulo(posicionArticulo, codigo, precioVenta, precioCompra, descripcion, stock);
	}

	private static void nuevoPedido() {
		// TODO Auto-generated method stub
		Scanner sc = extracted();
		int codigo = 0;
		double precioCompra = 0.1;
		double precioVenta = 0.1;
		String descripcion = "PACO";
		int stock = 40;
		codigo = sc.nextInt();
		precioCompra = sc.nextDouble();
		precioVenta = sc.nextDouble();
		descripcion = sc.nextLine();
		stock = sc.nextInt();
		ArrayArticulos.nuevoPedido(codigo, precioCompra, precioVenta, descripcion, stock);
	}
}