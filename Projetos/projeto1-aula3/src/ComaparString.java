import java.util.Scanner;

public class ComaparString {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o Sexo: ");
		String sexo = sc.next();
		
		
		if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		} else if(sexo.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		}else {
			System.out.println("Sexo Invalido");
		}

	}

}
