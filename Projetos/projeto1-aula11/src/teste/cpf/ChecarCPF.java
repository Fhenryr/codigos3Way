package teste.cpf;

import java.util.Scanner;

public class ChecarCPF {

	public static void main(String[] args) {
		String keyCPF;
		CPFUtil cpf = new CPFUtil();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o CPF que deseja Buscar: ");
		keyCPF = sc.next();

		System.out.println(cpf.retornaNomePorCPF(keyCPF));
		
	}

}
