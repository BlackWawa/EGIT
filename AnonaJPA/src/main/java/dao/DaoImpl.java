package dao;

import java.util.List;

import metier.Livre;
import metier.Personne;

public interface DaoImpl {

	public String addPersonne(Personne p);
	public String modPersonne(Personne p);
	public String suppPersonne(Personne p);
	public List<Personne> listPersonne(Personne p);
	public String addLivre(Livre p);
	public String modLivre(Livre p);
	public String suppLivre(Livre p);
	public List<Livre> listLivre(Livre l);
	
}
