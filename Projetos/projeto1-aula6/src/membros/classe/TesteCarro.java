package membros.classe;

public class TesteCarro {
	public static void main(String[] args) {
		
		Carro carro1 = new Carro("HGF-5432");
		
		Carro carro2 = new Carro("Gol", "HGF-1234");
		
		Carro carro3 = new Carro("Gol", "Preto", 1990, "IDH-6543");
		
		/*System.out.println(carro1.placa);
		System.out.println();
		
		System.out.println(carro2.modelo);
		System.out.println(carro2.placa);

		System.out.println();
		System.out.println(carro3.modelo);
		System.out.println(carro3.cor);
		System.out.println(carro3.ano);
		System.out.println(carro3.placa);
		*/
		carro3.print();
		System.out.println();
		System.out.println();
		carro3.print("Marcelo");
						
		
	}

}
