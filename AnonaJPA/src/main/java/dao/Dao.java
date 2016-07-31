package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import metier.Livre;
import metier.Personne;

public class Dao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Anona");
	EntityManager em = emf.createEntityManager();

	public String addPersonne(Personne p) {

		em.getTransaction().begin();

		em.persist(p);

		em.getTransaction().commit();

		System.out.println("Dao add Personne saved" + p);

		return null;
	}

	public String trouverPersonne(int p) {

		em.find(Personne.class, p);

		System.out.println("Ici il y a :" + em.find(Personne.class, p));
		return null;
	}

	public String suppPersonne(int p) {

		int h = 1;
		Personne i = em.find(Personne.class,h);
		em.getTransaction().begin();
		em.remove(i);
		em.getTransaction().commit();
		System.out.println("Dao removed Personne" + em.find(Personne.class, h));

		return null;

	}

	public String addLivre(Livre l) {
		em.persist(l);
		System.out.println("Dao add livre saved" + l);
		return null;

	}

	public String modLivre(Livre l) {
		return null;

	}

	public String suppLivre(Livre l) {
		return null;

	}

	public List<Personne> listPersonne(Personne p) {

		return null;
	}

	public List<Livre> listLivre(Livre l) {

		return null;
	}

}
