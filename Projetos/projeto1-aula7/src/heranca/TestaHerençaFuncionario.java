package heranca;

public class TestaHeren�aFuncionario {

	public static void main(String[] args) {
		Engenheiro testeNomeEng = new Engenheiro();
		Diretor testeNomeDir = new Diretor();
		Secret�rio testeNomeSec = new Secret�rio();
		Gerente testeNomeGer = new Gerente();

		
		testeNomeDir.nome = "Marcelo";
		testeNomeEng.nome = "Bruno";
		testeNomeGer.nome = "Vanessa";
		testeNomeSec.nome = "Vera";
		
		
		System.out.println(testeNomeDir.nome);
		System.out.println(testeNomeEng.nome);
		System.out.println(testeNomeGer.nome);
		System.out.println(testeNomeSec.nome);

	}

}
