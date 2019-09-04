package orientacao.objeto;

public class TestaPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.corCabelo = "Castanho";
		pessoa1.corOlhos = "Castanho";
		pessoa1.sexo = "M";
		pessoa1.tipoSanguineo = "A+";
		
		System.out.println(pessoa1.corCabelo);
		System.out.println(pessoa1.corOlhos);
		System.out.println(pessoa1.sexo);
		System.out.printf("%n", pessoa1.tipoSanguineo);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.corCabelo = "Preto";
		pessoa2.corOlhos = "Azul";
		pessoa2.sexo = "F";
		pessoa2.tipoSanguineo = "O-";
		
		System.out.println(pessoa2.corCabelo);
		System.out.println(pessoa2.corOlhos);
		System.out.println(pessoa2.sexo);
		System.out.printf("%n", pessoa2.tipoSanguineo);

		Pessoa pessoa3 = new Pessoa();
		pessoa3.corCabelo = "Loiro";
		pessoa3.corOlhos = "Verde";
		pessoa3.sexo = "F";
		pessoa3.tipoSanguineo = "B-";

		System.out.println(pessoa3.corCabelo);
		System.out.println(pessoa3.corOlhos);
		System.out.println(pessoa3.sexo);
		System.out.printf("%n", pessoa3.tipoSanguineo);
	}

}
