
public class RepeticaoWhileBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador = 0;
		
		while(true) {
			if(contador == 10){
				System.out.printf("%n Break = (while-true)");
				break;
			}
			System.out.println(contador);
			contador++;
		}
	}

}
