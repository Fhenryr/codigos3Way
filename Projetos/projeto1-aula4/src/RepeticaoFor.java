
public class RepeticaoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int cont = 0; cont < 10; cont++) {
			System.out.print(cont+ " ");
			
		}
		
		for (int i = 10; true ; i--) {
			System.out.print(i+ " ");
			
			if(i == 0){
				System.out.printf("%n Break = (while-true)");
				break;
			}
		}
	}

}
