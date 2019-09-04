package projeto.throws0;

public class Calculadora {

	public static void main(String[] args) {

		Double num1 = 5.0;
		Double num2 = 6.0;

		try {
			System.out.println(Calculadora.calculaMedia(num1, num2));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Double calculaMedia(Double x, Double y) throws Exception {
		Double media = (x + y) / 2;
		if (media < 3) {
			throw new Exception("Criando Exceção com throws.");
		}
		return media;
	}

}
