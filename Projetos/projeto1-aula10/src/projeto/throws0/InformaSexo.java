package projeto.throws0;

import java.util.Scanner;

public class InformaSexo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o Sexo: ");
		String sexo = sc.next();
		try {
			System.out.println(InformaSexo.InfSexo(sexo));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String InfSexo(String sx) throws Exception {
		
		if (sx.equalsIgnoreCase("F")) {
			System.out.println("Sexo Feminino");
		}else if(sx.equalsIgnoreCase("M")) {
			System.out.println("Sexo Masculino");
	
		}else {
			throw new Exception("Erro, Sexo Indefinido");
			
		}
		return sx;
	}

}
