package projeto.enum0;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ManipulandoExcecoes {
	public static void main(String[] args) {
		
		PrintStream ps = System.out;
		System.out.println("Infoorme a posição: ");
		InputStreamReader leitor = new InputStreamReader(System.in);
		int[] array = {1,2,3,4};
		try {
			Character ch = (char) leitor.read();
			int i = Integer.parseInt(ch.toString());
			ps.print(array[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			ps.printf("Indice fora do limite [0..3] : %s/n", e.getMessage());
		}catch (NumberFormatException e) {
			ps.printf("Erro de conversão : %s\n", e.getMessage());			
		}catch (IOException e) {
			ps.printf("Erro de entrada/saida : %s\n", e.getMessage());
		}finally {
			ps.printf("Sempre passo aqui pra fechar todos os recursos");
		}
		
	}

}
