package pacote.animal;

public class Gato extends Animal{
	
	public Gato() {
		super("Miau, miau");
	}

	@Override
	public void fazerRuido() {
		System.out.println("Miar= " + getRuido());
		
	}

	@Override
	public void comer() {
		System.out.println("Come rato");
		
	}

}
