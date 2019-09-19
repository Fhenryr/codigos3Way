package com.jpa.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.model.Cliente;

public class TesteJPA {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-projeto-b");
		EntityManager entityManager = factory.createEntityManager();
		
		Cliente cliente = new Cliente();
		cliente.setNome("vera");
		cliente.setProfissao("Programador");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Marcelo Cunha");
		cliente2.setProfissao("Assistente");
		
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.persist(cliente2);
		entityManager.getTransaction().commit();
		
		List<Cliente> clienteJPA = entityManager.createQuery("FROM " + Cliente.class.getName()).getResultList();
		
		for (Cliente clienteLaco : clienteJPA) {
			System.out.println(clienteLaco);
		}
	}

}
