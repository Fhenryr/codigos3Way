package interfaces;

import java.util.Arrays;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		System.out.println("Imprime todos os elementos da lista1");

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		for (Integer n : list) {
			System.out.println(n);
		}

		System.out.println("Imprime todos os elementos da lista");
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
		lista.forEach(n -> System.out.println(n));

	}

}
