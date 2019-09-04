
public class Teste1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 20;
		int num2 = 10;
		int num3 = 55;
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("Numero maior é Num1: " + num1);
		}else if (num3 > num2 && num3 > num1){
			System.out.println("Numero maior é num3: " + num3);
		}else {
			System.out.println("Numero maior é Num2: " + num2);
		}

	}

}
