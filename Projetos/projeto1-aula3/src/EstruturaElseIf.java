
public class EstruturaElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mesAno = 13;
		
		if (mesAno == 12 || mesAno == 1 || mesAno == 2) {
			System.out.println("Verão");
		}else if (mesAno == 3 || mesAno == 4 || mesAno == 5) {
			System.out.println("Outono");
		}else if(mesAno == 6 || mesAno == 7 || mesAno == 8) {
			System.out.println("Inverno");
		}else if(mesAno == 9 || mesAno == 10 || mesAno == 11) {
			System.out.println("Primavera");
		}else {
			System.out.println("Mês Invalido: " + mesAno);
		}

	}

}
