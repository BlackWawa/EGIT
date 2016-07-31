package presentation;

import metier.Livre;
import metier.Personne;
import service.Service;

public class Controller {

	Personne p = new Personne();
	Livre l = new Livre();
	Service s = new Service();

	public String ajouterPersonne(Personne p) {
		s.addPersonne(p);
		return "";
	}

	public String trouverPersonne(int p) {
		s.trouverPersonne(p);
		return "";
	}

	public String supprimerPersonne(int p) {
		s.suppPersonne(p);
		return s.suppPersonne(p);
	}

	public String afficherListe() {
		s.listPersonne(p);
		return "";
	}

	public String ajouterLivre(Livre l) {
		s.addLivre(l);
		return "";
	}

	public String modifierLivre(Livre l) {
		s.modLivre(l);
		return "";
	}

	public String supprimerLivre(Livre l) {
		s.suppLivre(l);
		return "";
	}

}
