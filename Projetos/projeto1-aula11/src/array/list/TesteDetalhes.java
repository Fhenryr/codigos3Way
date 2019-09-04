package array.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TesteDetalhes {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Stack");
		lista.add("Overflow");
		lista.add("Marcelo");
		lista.add("teste");
		lista.add("jdjskbskd");
		lista.add("lololololololololo");

		String strl = lista.get(1);
		System.out.printf("%s\n\n", strl);

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Stack");
		map.put(5, "Overflow");
		map.put(6, "Marcelo");
		map.put(9, "Teste");

		String mapStrl = map.get(1);
		System.out.printf("%s\n\n", mapStrl);

		Map<String, String> exemplo = new HashMap<String, String>();

		exemplo.put("K1", "V1");
		exemplo.put("K2", "V2");
		exemplo.put("K3", "V3");
		exemplo.put("K4", "V4");
		exemplo.put("K5", "V5");
		exemplo.put("K5", "Vasdfghjkl");

		String exemploStrl = exemplo.get("K5");
		System.out.printf("%s\n\n", exemploStrl);

		String chave = "K5";

		if (exemplo.containsKey(chave)) {
			System.out.println("Valor da chave: " + chave + "    Valor: " + exemplo.get(chave));
			System.out.println();
		} else {
			System.out.println("Chave <" + chave + "> nao existe");
			System.out.println();
		}

		for (String key : exemplo.keySet()) {
			String valor = exemplo.get(key);
			System.out.println("Valor da chave: " + key + "    Valor: " + valor);
			System.out.println();
		}

		for (String str : lista) {
			System.out.println(str);
		}

	}

}
