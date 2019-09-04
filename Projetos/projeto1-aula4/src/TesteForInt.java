
public class TesteForInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		System.out.printf(" "+array2[0]);
		System.out.printf(" "+array2[6]);
		System.out.printf(" "+array2[array2.length -1]);
		System.out.println();
		for (int i:array2) {
			System.out.println(i);
		}
		
		
		String arrayString[] = {"Volvo", "BMW", "FORD", "Honda"};
		for (String i:arrayString) {
			System.out.println(i);
		}
		
	}

}
