package heranca.veiculo;

public class Aviao extends Veiculo{

	private String modelo;

	public Aviao(String cor, int ano, int identificacao, String modelo) {

		super(cor, ano, identificacao);
		this.modelo = modelo;

	//	System.out.println("Criando objeto Avião.");
	}

	@Override
	public void mover() {
		System.out.println("Voar");
	}
}
