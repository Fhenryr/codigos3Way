package metodos.abstratos;

public class TesteConta {

	public static void main(String[] args) {
		ContaPoupanša cp = new ContaPoupanša();
		
		cp.setSaldo(12.33);
		
		cp.imprimeExtrato();

	}

}
