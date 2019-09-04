import java.util.Arrays;
import java.util.Scanner;

public class MaioresMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count;

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tamanho do array: ");
		count = sc.nextInt();

		int num[] = new int[count];
		System.out.println("Entre com os elementos do array: ");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(num);
		
		System.out.printf("%n", num.length);
			
		System.out.println("Maior Número: " + num[num.length - 1]);
		
		System.out.println("Menor Número: " + num[0] + ", ");

		
			


	}

}
