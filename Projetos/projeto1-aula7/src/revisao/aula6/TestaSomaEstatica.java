package revisao.aula6;

import java.util.Scanner;

public class TestaSomaEstatica {
	static double num1, num2;
	public static void main(String[] args) {

		int opcao;
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		num1 = sc.nextInt();
		System.out.println("Informe o segundo número: ");
		num2 = sc.nextInt();

		System.out.println("Informe agora a operação: <1>SOMA ou <2>Multiplica");
		opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			Soma();
			break;
		case 2:
			Multiplica();
			break;

		default:
			break;
		}

	}

	public static void Soma() {
		double total = num1 + num2;
		System.out.println("Valor total:" + total);
	}

	public static void Multiplica() {
		double total = num1 * num2;
		System.out.println("Valor total:" + total);
	}
}
