package membros.classe;

public class Carro {
	private static int contadorObjetos = 0;
	private int ano;
	private String cor;
	private String modelo;
	private String placa;

	public Carro(String modelo) {
		contadorObjetos++;
		System.out.println("Nome do Objeto: " + modelo);
		System.out.println("Quantidade de objetos: " + contadorObjetos);
		System.out.println();
	}
	
	/*
	 * public Carro(String placa) { this.placa = placa; }
	 */
	public Carro(String modelo, String placa) {
		this.modelo = modelo;
		this.placa = placa;
	}

	public Carro(String modelo, String cor, int ano, String placa) {
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.placa = placa;
	}

	public String ligar(String nomeMotorista) {
		return nomeMotorista + "O carro está ligando.";

	}

	public String frear() {
		return "freando";
	}

	public String acelerar() {
		return "acelerando";
	}
	
	public void print(String msg) {
		System.out.println(msg);
		print();
	}

	public void print() {
		System.out.println("Carro de placa: " + placa);
		System.out.println("Cor: " + cor);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
	}
	
	public static int getContador() {
		return contadorObjetos;
	}

}
