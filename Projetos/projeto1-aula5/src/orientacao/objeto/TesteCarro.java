package orientacao.objeto;

public class TesteCarro {
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.ano = 1990;
		carro1.cor = "Preto";
		carro1.modelo = "Gol";
		carro1.placa = "HGF-5432";
		System.out.println(carro1.ligar());
		System.out.println(carro1.ligar());
		System.out.println(carro1.acelerar());
		carro1.frear();
		
		System.out.println(carro1.ano);
		System.out.println(carro1.cor);
		System.out.println(carro1.modelo);
		System.out.printf("%n", carro1.placa);

		Carro carro2 = new Carro();
		carro2.ano = 1980;
		carro2.cor = "Vermelho";
		carro2.modelo = "Chevete";
		carro2.placa = "HGF-9752";
		System.out.println(carro2.ligar());
		System.out.println(carro2.acelerar());
		carro2.frear();

		System.out.println(carro2.ano);
		System.out.println(carro2.cor);
		System.out.println(carro2.modelo);
		System.out.printf("%n", carro2.placa);

		Carro carro3 = new Carro();
		carro3.ano = 2010;
		carro3.cor = "Azul";
		carro3.modelo = "Sonic";
		carro3.placa = "HGF-8762";
		System.out.println(carro3.ligar());
		System.out.println(carro3.acelerar());
		carro3.frear();

		System.out.println(carro3.ano);
		System.out.println(carro3.cor);
		System.out.println(carro3.modelo);
		System.out.printf("%n", carro3.placa);
		
	}

}
