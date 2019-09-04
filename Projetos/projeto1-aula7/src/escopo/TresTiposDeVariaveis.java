package escopo;

public class TresTiposDeVariaveis {
	
	static String staticVariable = "Variável de classe ou estática";
	
	String instanceVariable = "Variável de instancia";

	public static void main(String[] args) {

		String localVariable = "Variável local";
		
		
		TresTiposDeVariaveis tres = new TresTiposDeVariaveis();
		System.out.println("Variável estática: " + staticVariable);
		System.out.println("Variável de instancia: " + tres.instanceVariable);
		System.out.println("Variável local: " + localVariable);
	}

}
