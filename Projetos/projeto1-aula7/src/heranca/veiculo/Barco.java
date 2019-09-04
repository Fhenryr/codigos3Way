package heranca.veiculo;

public class Barco extends Veiculo{
	
	private String modelo;

	public Barco(String cor, int ano, int identificacao, String modelo) {

		super(cor, ano, identificacao);
		this.modelo = modelo;

	//	System.out.println("Criando objeto barco.");
	}

	@Override
	public void mover() {
		System.out.println("Navegar");
	}
}
