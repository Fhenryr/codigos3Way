
public class DeclaracaoContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont = 0;
		
		while(true) {
			if (cont == 2) {
				System.out.println("continue - whilr-true");
				cont++;
				continue;
				
			}
			if (cont == 10) {
				System.out.println("break -  while-true");
				cont++;
				break;
				
			}
			System.out.println(cont);
			cont++;
		}

	}

}
