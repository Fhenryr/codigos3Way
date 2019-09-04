package heranca.veiculo;

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

public class TesteHeranca {
	public static void main(String[] args) {

		/*
		 * Veiculo c = new Carro("vermelho", 2019, 202020, "teste"); c.mover();
		 * System.out.println(); Veiculo b = new Barco("vermelho", 2019, 202020,
		 * "teste"); b.mover(); System.out.println(); Veiculo a = new Aviao("vermelho",
		 * 2019, 202020, "teste"); a.mover(); System.out.println();
		 * 
		 * MetodoPolimorfico poli = new MetodoPolimorfico(); Carro carro = new
		 * Carro(null, 0, 0, null); poli.testarChamadaHeranca(carro); Barco barco = new
		 * Barco(null, 0, 0, null); poli.testarChamadaHeranca(barco); Aviao aviao = new
		 * Aviao(null, 0, 0, null); poli.testarChamadaHeranca(aviao);
		 */

		Carro[] c = new Carro[3];
		c[0] = new Carro("vermelho", 2019, 202020, "teste");
		c[1] = new Carro(null, 0, 0, null);
		c[2] = new Carro(null, 0, 0, null);

		Barco[] b = new Barco[3];
		b[0] = new Barco(null, 0, 0, null);
		b[1] = new Barco("vermelho", 2019, 202020, "teste");
		b[2] = new Barco(null, 0, 0, null);

		Aviao[] a = new Aviao[3];
		a[0] = new Aviao(null, 0, 0, null);
		a[1] = new Aviao(null, 0, 0, null);
		a[2] = new Aviao("vermelho", 2019, 202020, "teste");

		Veiculo[] v = new Veiculo[3];
		v[0] = new Carro("teste", 0, 0, "lol");
		v[1] = new Aviao("teste", 2, 2, "lol");
		v[2] = new Barco("teste", 1, 1, "lol");

		ArrayVeiculo av = new ArrayVeiculo();

		av.testarArrayVeiculo(c);
		System.out.println();
		av.testarArrayVeiculo(a);
		System.out.println();
		av.testarArrayVeiculo(b);
		System.out.println();
		av.testarArrayVeiculo(v);
		System.out.println();
		
		


		/*
		 * System.out.println(v[0].getClass().getSimpleName());
		 * System.out.println(v[1].getClass().getSimpleName());
		 * System.out.println(v[2].getClass().getSimpleName());
		 */
		  
		for (int i = 0; i < v.length; i++) {
			if (v[i] instanceof Barco) {
				System.out.println("Veiculo:[" + i + "] " + v[i].getClass().getSimpleName());

			}
		}
		  
		 
	}

}
