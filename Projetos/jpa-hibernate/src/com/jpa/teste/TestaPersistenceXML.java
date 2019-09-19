package com.jpa.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.model.Pessoa;

public class TestaPersistenceXML {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-hibernate");
		EntityManager entityManager = factory.createEntityManager();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("01138285196");
		pessoa.setNome("Marcelo");
		
		entityManager.getTransaction().begin();
		entityManager.persist(pessoa);
		entityManager.getTransaction().commit();
		
		List<Pessoa> todaPessoaJPA = entityManager.createQuery("FROM " + Pessoa.class.getName()).getResultList();
		
		for (Pessoa pessoaLaco : todaPessoaJPA) {
			System.out.println(pessoaLaco);
		}
		
		
		
		
		
	}
	
	
	
	

}
