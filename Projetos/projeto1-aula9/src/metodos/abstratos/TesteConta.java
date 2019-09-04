package metodos.abstratos;

public class TesteConta {

	public static void main(String[] args) {
		ContaPoupança cp = new ContaPoupança();
		
		cp.setSaldo(12.33);
		
		cp.imprimeExtrato();

	}

}
