package com.jpa.teste;

import java.util.Collections;
import java.util.List;

import com.jpa.dao.PessoaDao;
import com.jpa.model.Pessoa;

public class TestaPessoaDAO {
	static PessoaDao pessoaDao1 = PessoaDao.getIstance();

	public static void main(String[] args) {
		// incluirPessoa();
		// buscarPessoaPorId();
		//listarPessoa();
		// alterarPessoa();
		//removePessoaPorid();
		removePessoa();
	}

	@SuppressWarnings("unused")
	private static void incluirPessoa() {

		Pessoa p = new Pessoa();

		p.setCpf("01138285196");
		p.setNome("Marcelo");

		pessoaDao1.persist(p);

	}

	@SuppressWarnings("unused")
	private static void buscarPessoaPorId() {
		Pessoa p = pessoaDao1.getByid(8);
		System.out.println(p);
	}

	@SuppressWarnings("unused")
	private static void listarPessoa() {
		List<Pessoa> p = pessoaDao1.BuscarLista();
		System.out.println(p);

	}

	@SuppressWarnings("unused")
	private static void alterarPessoa() {
		Pessoa p = new Pessoa();
		p.setId(5);
		p.setCpf("12312312345");
		p.setNome("Fhenryr");

		pessoaDao1.merge(p);
	}

	@SuppressWarnings("unused")
	private static void removePessoa() {
		Pessoa p = new Pessoa();
		p.setId(9);
		pessoaDao1.remove(p);
	}
	

	@SuppressWarnings("unused")
	private static void removePessoaPorid() {
		pessoaDao1.removePorId(7);
	}
}
