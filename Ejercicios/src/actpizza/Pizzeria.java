package actpizza;

import java.util.Arrays;
import java.util.Scanner;

public class Pizzeria {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int tamayoNumero;
		int tipoNumero;
		int codigo;
		String[] tamayo = { "Margarita", "CuatroQuesos", "Funghi" };
		String[] tipo = { "Mediana ", "Familiar" };
		int seleccion;
		boolean salida = false;
		System.out.print( " 1 Listado de pizzas \n 2 Pizza  \n 3 Pizza servida \n 4 Salir");

		seleccion = myObj.nextInt();
		while (salida == false) {
			System.out.print( " 1 Listado de pizzas \n 2 Pizza  \n 3 Pizza servida \n 4 Salir");
			seleccion = myObj.nextInt();
			
			switch (seleccion) {
			case 1:
				ArrayPizzas.imprimirPizzas();
				break;
			case 2:
				System.out.println("TAMAÑOS Y TIPOS DISPONIBLES ");
				System.out.println(Arrays.toString(tamayo));
				System.out.println(Arrays.toString(tipo));
				System.out.println("INTRODUZCA UN CODIGO ");
				codigo = myObj.nextInt();
				System.out.println(Arrays.toString(tamayo) + "SELECIONE TAMAÑO");
				tamayoNumero = myObj.nextInt();
				System.out.print(Arrays.toString(tipo) + "SELECIONE TYPO");
				tipoNumero = myObj.nextInt();
				ArrayPizzas.nuevoPedido(codigo, tamayo[tamayoNumero], tipo[tipoNumero]);
				break;
			case 3:
		
				break;
			case 4:
				salida = true;
				break;
			}
		}
		myObj.close();
	}

}
