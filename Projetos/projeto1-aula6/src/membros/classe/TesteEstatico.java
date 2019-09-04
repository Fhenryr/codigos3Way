package membros.classe;

public class TesteEstatico {
	public static void main(String[] args) {
		Carro fusca = new Carro("Fusca");
		Carro ferrari = new Carro("Ferrari");
		Carro jipe = new Carro("Jipe");
		
		System.out.println(Carro.getContador());
		
		
	}

}
