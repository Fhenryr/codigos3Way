package interfaces;

public class TesteCalculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();

		System.out.println(calc.soma(5.0, 10.0));
		System.out.println(calc.subtracao(10.0, 5.0));
		System.out.println(calc.multiplicacao(5.0, 5.0));

	}

}
