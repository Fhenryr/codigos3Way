import java.util.Scanner;

public class EstruturaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o mês");
		int mesAno = sc.nextInt();
		
		switch (mesAno) {
		case 12:
		case 1:
		case 2:
			System.out.println("Verão");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Outono");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Inverno");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Primavera");
			break;
		default:
			System.out.println("Mês inválido");
			break;
		}
	}

}
