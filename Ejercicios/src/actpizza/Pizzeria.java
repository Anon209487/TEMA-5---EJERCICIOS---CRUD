package actpizza;

import java.util.Arrays;
import java.util.Scanner;

public class Pizzeria {

	public static void main(String[] args) {
		int seleccion = 0;
		while (seleccion != 4) {
			System.out.println(" 1 Listado de pizzas:");
			System.out.println(" 2 pedidio Pizza:");
			System.out.println(" 3 Pizza servida: ");
			System.out.println("4 Salir: ");
			seleccion = extracted().nextInt();

			switch (seleccion) {
			case 1:
				ArrayPizzas.imprimirPizzas();
				break;
			case 2:

				Pizzeria.nuevoPedido();

				break;
			case 3:
				ArrayPizzas.pedidoservido();
				break;

			}
		}

	}

	private static void nuevoPedido() {

		int tamayoNumero;
		int tipoNumero;
		String codigo;
		String[] tamayo = { "Margarita", "CuatroQuesos", "Funghi" };
		String[] tipo = { "Mediana ", "Familiar" };
		System.out.println("TAMAÑOS Y TIPOS DISPONIBLES ");
		System.out.println(Arrays.toString(tamayo));
		System.out.println(Arrays.toString(tipo));
		System.out.println("INTRODUZCA UN CODIGO ");
		codigo = extracted().nextLine();
		System.out.println(Arrays.toString(tamayo) + "SELECIONE TAMAÑO");
		tamayoNumero = extracted().nextInt();
		System.out.println(Arrays.toString(tamayo) + "SELECIONE TYPO");
		tipoNumero = extracted().nextInt();
		ArrayPizzas.nuevoPedido(codigo, tipo[tipoNumero], tamayo[tamayoNumero]);

	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

}
