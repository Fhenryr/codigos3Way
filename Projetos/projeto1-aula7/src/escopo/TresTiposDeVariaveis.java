package escopo;

public class TresTiposDeVariaveis {
	
	static String staticVariable = "Vari�vel de classe ou est�tica";
	
	String instanceVariable = "Vari�vel de instancia";

	public static void main(String[] args) {

		String localVariable = "Vari�vel local";
		
		
		TresTiposDeVariaveis tres = new TresTiposDeVariaveis();
		System.out.println("Vari�vel est�tica: " + staticVariable);
		System.out.println("Vari�vel de instancia: " + tres.instanceVariable);
		System.out.println("Vari�vel local: " + localVariable);
	}

}
