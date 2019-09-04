package escopo;

public class EscopoDeVariavel {

	public static void main(String[] args) {
		
		int var2;
		int var1 = 10;
		
		if(var1 < 100) {
			var2 = 20;
		}else {
			var2 = 21;
		}
		
		System.out.println("Valor de var1: " + var1);
		
		System.out.println("Valor de var2: " + var2);
		
	}

}
