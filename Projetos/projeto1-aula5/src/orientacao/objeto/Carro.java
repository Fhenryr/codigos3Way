package orientacao.objeto;

public class Carro {

	public int ano;
	public String cor;
	public String modelo;
	public String placa;
	private boolean ligado = false;
	
	
	public Carro() {
		System.out.println("Criando objeto Carro:");
	}
	
	public String ligar() {
		
		if(ligado == false) {
			ligado = true;
			return "Carro está ligando";
		}
		return "Carro já está ligado";
		
		
	}
	public String frear() {
		System.out.println("freando");
		return "freando";
	}
	public String acelerar() {
		return "acelerando";
	}
}
