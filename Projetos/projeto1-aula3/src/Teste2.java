import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int num = sc.nextInt();
		
		int total = num % 2;
		if (total == 0) {
			System.out.println("Numero Par");
		}else {
			System.out.println("Número Ímpar");
		}
	}

}
