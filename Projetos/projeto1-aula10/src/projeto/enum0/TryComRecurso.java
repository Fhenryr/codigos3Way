package projeto.enum0;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class TryComRecurso {

	public static void main(String[] args) {
		PrintStream ps = System.out;
		try (InputStreamReader leitor = new InputStreamReader(System.in)) {
			Character ch = (char) leitor.read();
		} catch (IOException e) {
			ps.printf("um erro aconteceu: %s\n", e);
		}
	}

}
