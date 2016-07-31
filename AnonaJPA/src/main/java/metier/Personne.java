package metier;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Livre livre;

	public Personne() {
	}

	public Personne(int id, String nom, String prenom, Livre livre) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.livre = livre;
	}

	public Personne(String prenom, String nom, Livre livre) {

		this.nom = nom;
		this.prenom = prenom;
		this.livre = livre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", livre=" + livre + "]";
	}

}
