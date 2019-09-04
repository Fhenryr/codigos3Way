import java.util.Arrays;
import java.util.Scanner;

public class TesteArrayScanner {

	public static void main(String[] args) {
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
		
		System.out.println("Elementos do Array de ascendente: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + ", ");
		}
		System.out.printf("%n", num.length);
	}
}
