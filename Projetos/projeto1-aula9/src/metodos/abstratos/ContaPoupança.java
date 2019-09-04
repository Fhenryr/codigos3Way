package metodos.abstratos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupança extends Conta{

	@Override
	public void imprimeExtrato() {
		System.out.println("###Extrato da conta>###");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/aaaa hh:mm:ss");
		Date date = new Date();
		
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + sdf.format(date));
	}
}
