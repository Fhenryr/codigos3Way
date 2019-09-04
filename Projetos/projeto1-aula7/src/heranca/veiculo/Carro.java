package heranca.veiculo;

public class Carro extends Veiculo {

	private String modelo;

	public Carro(String cor, int ano, int identificacao, String modelo) {

		super(cor, ano, identificacao);
		this.modelo = modelo;

		/*
		 * System.out.println("Criando objeto carro.");
		 * 
		 * System.out.println(cor); System.out.println(ano);
		 * System.out.println(identificacao);
		 */
	}

	@Override
	public void mover() {
		System.out.println("Correr");
	}

}
