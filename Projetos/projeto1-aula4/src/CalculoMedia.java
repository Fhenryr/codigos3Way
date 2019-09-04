
public class CalculoMedia {

	public static void main(String[] args) {

		double array1[] = { 19, 12.89, 16.5, 200, 13.7, 67, 98, 56, 3.46, 98 };
		double total = 0;

		for (int i = 0; i < array1.length; i++) {
			total = total + array1[i];
			System.out.println(total);
		}
		System.out.println(array1.length);
		double media = total / array1.length;

		System.out.format("A média é: %.3f", media);
	}

}
