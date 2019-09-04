package heranca.veiculo;

public class ArrayVeiculo {

	public void testarArrayVeiculo(Veiculo[] veiculos) {

		for (Veiculo av : veiculos) {
			av.mover();
			System.out.println("CLASSE:" + av.getClass().getSimpleName());
		}
		
	}

}
