package test;

import metier.Livre;
import metier.Personne;
import presentation.Controller;

public class Test {

	public static void main(String[] args) {

		String prenom = "Julie";
		String nom = "FLUBERT";
		Livre l = new Livre(1, "Dracula", "Parot");

		Personne p = new Personne(prenom, nom, l);
		Personne p1 = new Personne(prenom, nom, l);
		Personne p2 = new Personne(prenom, nom, l);
		Personne p3 = new Personne(prenom, nom, l);

		Controller c = new Controller();
		p.setLivre(l);

		c.ajouterPersonne(p);
		c.ajouterPersonne(p1);
		c.ajouterPersonne(p2);
		c.ajouterPersonne(p3);
		
		c.ajouterLivre(l);
		
		c.trouverPersonne(2);
		
		c.supprimerPersonne(4);
	}

}
