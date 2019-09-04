package pacote.teste;

import pacote.DAO.ClienteDAO;
import pacote.principal.Cliente;

public class TestaClienteDAO {
	static Cliente cliente = new Cliente();
	static ClienteDAO cDAO = new ClienteDAO();

	public static void main(String[] args) {

		//testeInserir();
		//testeObter();
		//testeAlterar();
		
		testeRemover();
	}

	private static void testeRemover() {
		cliente.setCodigo(3);
		cDAO.remover(cliente);
	}

	private static void testeAlterar() {
		cliente.setSenha("senha");
		cliente.setLogin("senha");
		cliente.setEndereco("senha");
		cliente.setCidade("senha");
		cliente.setBairro("senha");
		cliente.setEstado("senha");
		cliente.setCep("senha");
		cliente.setCodigo(3);
		
		cDAO.alterar(cliente);
	}

	private static void testeObter() {
		cliente.setSenha("senha");
		cliente.setLogin("senha");

		Cliente clienteRetorno = cDAO.obter(cliente);
		System.out.println(cDAO.obter(cliente));
		System.out.println(clienteRetorno);
	}

	private static void testeInserir() {

		cliente.setNome("Marcelo");
		cliente.setLogin("postgres");
		cliente.setSenha("1234");
		cliente.setEndereco("rua 233");
		cliente.setCidade("Goiania");
		cliente.setBairro("Universitario");
		cliente.setEstado("Goiás");
		cliente.setCep("74000-000");

		cDAO.inserir(cliente);
	}

}
