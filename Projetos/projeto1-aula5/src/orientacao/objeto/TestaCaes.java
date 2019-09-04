package orientacao.objeto;

public class TestaCaes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro cachorro1 = new Cachorro();
		cachorro1.nome = "Pluto";
		cachorro1.corOlhos = "azuis";
		cachorro1.peso = 53;
		cachorro1.quantPatas = 4;

		System.out.println(cachorro1.nome);
		System.out.println(cachorro1.corOlhos);
		System.out.println(cachorro1.peso);
		System.out.printf("%n", cachorro1.quantPatas);

		Cachorro cachorro2 = new Cachorro();
		cachorro2.nome = "Rex";
		cachorro2.corOlhos = "amarelo";
		cachorro2.peso = 22;
		cachorro2.quantPatas = 3;
		
		System.out.println(cachorro2.nome);
		System.out.println(cachorro2.corOlhos);
		System.out.println(cachorro2.peso);
		System.out.printf("%n", cachorro2.quantPatas);

		Cachorro cachorro3 = new Cachorro();
		cachorro3.nome = "Sansao";
		cachorro3.corOlhos = "preto";
		cachorro3.peso = 60;
		cachorro3.quantPatas = 4;
		
		System.out.println(cachorro3.nome);
		System.out.println(cachorro3.corOlhos);
		System.out.println(cachorro3.peso);
		System.out.printf("%n", cachorro3.quantPatas);

		Cachorro cachorro4 = new Cachorro();
		cachorro4.nome = "Maya";
		cachorro4.corOlhos = "Castanho";
		cachorro4.peso = 15;
		cachorro4.quantPatas = 4;

		System.out.println(cachorro4.nome);
		System.out.println(cachorro4.corOlhos);
		System.out.println(cachorro4.peso);
		System.out.printf("%n", cachorro4.quantPatas);
	}

}
