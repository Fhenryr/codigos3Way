package teste.cpf;

import java.util.HashMap;
import java.util.Scanner;

public class CPFUtil {

	public String retornaNomePorCPF(String cpf) {

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("011.382.851-96", "lololo");
		map.put("302.203.291-34", "tetete");
		map.put("123.123.123-45", "Teste");
		map.put("098.890.987-90", "Teste1");
		map.put("567.765.876-89", "Teste5");

		
	

		if (map.containsKey(cpf)) {
			return "Valor da chave: " + cpf + "    Valor: " + map.get(cpf);
		} else {
			return "Chave <" + cpf + "> nao existe";

		}

	}

}
