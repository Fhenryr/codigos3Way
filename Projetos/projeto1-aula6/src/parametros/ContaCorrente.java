package parametros;

public class ContaCorrente {

	public String titular;
	public Integer numeroConta;
	public double saldo;

	public void depositar(double valorDeposito) {
		saldo = saldo + valorDeposito;
	}

	public void sacar(double valorSaque) {
		saldo = saldo - valorSaque;
	}

	public void transferir() {

	}
}
