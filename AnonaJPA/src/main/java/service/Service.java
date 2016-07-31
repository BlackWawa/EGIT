package service;

import java.util.List;

import dao.Dao;
import metier.Livre;
import metier.Personne;

public class Service {

	Dao dao = new Dao();

	public String addPersonne(Personne p) {
		dao.addPersonne(p);
		return dao.addPersonne(p);
		
	}

	public String trouverPersonne(int p) {

		dao.trouverPersonne(p);
		return dao.trouverPersonne(p);

	}

	public String suppPersonne(int p) {

		dao.suppPersonne(p);
		return dao.suppPersonne(p);
	}

	public String addLivre(Livre l) {

		dao.addLivre(l);
		return dao.addLivre(l);

	}

	public String modLivre(Livre l) {

		dao.modLivre(l);
		return dao.modLivre(l);

	}

	public String suppLivre(Livre l) {

		dao.suppLivre(l);
		return dao.suppLivre(l);

	}

	public List<Personne> listPersonne(Personne p) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Livre> listLivre(Livre l) {
		// TODO Auto-generated method stub
		return null;
	}

}
