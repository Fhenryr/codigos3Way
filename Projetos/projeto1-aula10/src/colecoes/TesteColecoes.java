package colecoes;

import java.util.ArrayList;
import java.util.List;

public class TesteColecoes {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		
		System.out.println(lista + ", size = " + lista.size());
		
		lista.add("Contrato");
		lista.add("Documento");
		lista.add("Nota Fiscal");
		
		System.out.println(lista + ", size = " + lista.size());

		lista.remove("Documento");
		System.out.println(lista + ", size = " + lista.size());
		
		Boolean contem = lista.contains("Nota Fiscal");
		System.out.println("A lista contém Nota Fiscal: " + contem);
		
		contem = lista.contains("Docimento");
		System.out.println("A lista contém Documento: " + contem);

	}
}
