package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codeLivre;
	private String nomLivre;
	private String dateParution;

	public Livre() {
	}

	public Livre(int codeLivre, String nomLivre, String dateParution) {
		super();
		this.codeLivre = codeLivre;
		this.nomLivre = nomLivre;
		this.dateParution = dateParution;
	}

	public int getCodeLivre() {
		return codeLivre;
	}

	public void setCodeLivre(int codeLivre) {
		this.codeLivre = codeLivre;
	}

	public String getNomLivre() {
		return nomLivre;
	}

	public void setNomLivre(String nomLivre) {
		this.nomLivre = nomLivre;
	}

	public String getDateParution() {
		return dateParution;
	}

	public void setDateParution(String dateParution) {
		this.dateParution = dateParution;
	}

	@Override
	public String toString() {
		return "Livre [codeLivre=" + codeLivre + ", nomLivre=" + nomLivre + ", dateParution=" + dateParution + "]";
	}

}
