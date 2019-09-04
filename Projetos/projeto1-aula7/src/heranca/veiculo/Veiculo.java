package heranca.veiculo;

public class Veiculo {

	private String cor;
	private int ano;
	private int identificacao;

	public Veiculo(String cor, int ano, int identificacao) {

		this.cor = cor;
		this.ano = ano;
		this.identificacao = identificacao;
		//System.out.println("Criando objeto veículo.");
	}

	public void mover() {
		System.out.println("Veículo se movendo.");
	}

}
