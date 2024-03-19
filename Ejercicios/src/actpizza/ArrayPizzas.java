package actpizza;

import java.util.Arrays;

/**
 * 
 */
public class ArrayPizzas {
	static public Pizza pizzas[] = new Pizza[50];
	public static void nuevoPedido(int código, String tamayo, String tipo) {
		int posicion = 0;
		for (int i = 0; i > pizzas.length; i--) {
			if (ArrayPizzas.pizzas[i] == null) {
				posicion = i;
			}
		}
		ArrayPizzas.pizzas[posicion] = new Pizza(código, tamayo, tipo);
	}
	public static void imprimirPizzas() {
		 System.out.println(Arrays.toString(pizzas));
		
	}
}