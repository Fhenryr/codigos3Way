package array.list;

import java.util.ArrayList;
import java.util.Collections;

public class TesteOrdenação {
	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();

		lista.add("Marcelo");
		lista.add("Bruno");
		lista.add("Vera");
		lista.add("Mauro");
		lista.add("Vanessa");

		System.out.println("Antes de ordenar:");
		for (String str : lista) {
			System.out.printf("%s\n", str);

		}
		
		Collections.sort(lista, Collections.reverseOrder());
		System.out.println();
		System.out.println("Ordenado: Decrescente");
		for (String str1 : lista) {
				System.out.printf("%s\n", str1);

		}
		Collections.sort(lista);
		System.out.println();
		System.out.println("Ordenado: Crescente");
		for (String str2 : lista) {
				System.out.printf("%s\n", str2);

		}

		
	}

}
