
public class TesteArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[] = new int [8];
		array1[0] = 10;
		array1[1] = 9;
		array1[2] = 8;
		array1[3] = 7;
		array1[4] = 6;
		array1[5] = 5;
		array1[6] = 4;
		
		int []array2 = {0, 4, 36, 49, 64, 81, 100};
		
		for (int i = 0; i <array1.length; i++) {
			System.out.println("array1 " + array1[i]);
		}
		System.out.println();
		for (int i = 0; i < array2.length; i++) {
			System.out.println("array2 " + array2[i]);
		}
		

	}

}
