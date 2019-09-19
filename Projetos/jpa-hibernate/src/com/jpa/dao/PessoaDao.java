package com.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.model.Pessoa;

public class PessoaDao {
	// Nossa classe PessoaDao segue o padrão de projeto Singleton que garante que apenas uma instancia dessa classe
	// será criada durante toda a aplicação.
	private static PessoaDao instance;
	EntityManager entityManager;

	private PessoaDao() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		if (entityManager == null) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-hibernate");
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

	public static PessoaDao getIstance() {
		if (instance == null) {
			instance = new PessoaDao();
		}
		return instance;
	}
	
	public void persist(Pessoa pessoa) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(pessoa);
			entityManager.getTransaction().commit();
			
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
	
	
	public Pessoa getByid(final int id) {
		return entityManager.find(Pessoa.class, id);
	}

	public void merge(Pessoa pessoa) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(pessoa);
			entityManager.getTransaction().commit();
			
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
	
	public List<Pessoa> BuscarLista(){
		return entityManager.createQuery("FROM " + Pessoa.class.getName()).getResultList();
	}
	
	public void remove(Pessoa pessoa) {
		try {
			entityManager.getTransaction().begin();
			pessoa = entityManager.find(Pessoa.class, pessoa.getId());
			entityManager.remove(pessoa);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
	
	public void removePorId(final int id) {
		try {
			Pessoa pessoa = new Pessoa();
			pessoa.setId(id);
			remove(pessoa);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
