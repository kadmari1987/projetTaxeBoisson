package ma.techmind.compte1boot.bean;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Rue {

	private long id;
	private String nom;
	@ManyToOne
	private Quartier id_quartier;
	public Rue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rue(long id, String nom, Quartier id_quartier) {
		super();
		this.id = id;
		this.nom = nom;
		this.id_quartier = id_quartier;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rue other = (Rue) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Quartier getId_quartier() {
		return id_quartier;
	}
	public void setId_quartier(Quartier id_quartier) {
		this.id_quartier = id_quartier;
	}
	
	
}
