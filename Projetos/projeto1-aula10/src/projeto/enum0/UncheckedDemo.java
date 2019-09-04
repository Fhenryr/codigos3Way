package projeto.enum0;

public class UncheckedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			int num[] = { 1, 2, 3, 4, };
			System.out.println(num[5]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exceção: " + e);
			e.printStackTrace();
		}
		System.out.println("Sair do bloco");

	}

}
