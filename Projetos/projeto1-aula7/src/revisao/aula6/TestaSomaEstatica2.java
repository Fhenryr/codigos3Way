package revisao.aula6;

import java.util.Scanner;

public class TestaSomaEstatica2 {
	static double num1, num2, total;
	public static void main(String[] args) {

		int opcao;
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro n�mero: ");
		num1 = sc.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		num2 = sc.nextInt();

		System.out.println("Informe agora a opera��o: <1>SOMA ou <2>Multiplica");
		opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.printf("Valor Total �: " + Soma(total));
			break;
		case 2:
			System.out.println("Valor Total �: " + Multiplica(total));
			break;

		default:
			break;
		}

	}

	public static double Soma(double totalSoma) {
		totalSoma = num1 + num2;
		return totalSoma;
	}

	public static double  Multiplica(double totalMulti) {
		totalMulti = num1 * num2;
		return totalMulti;
	}
}
