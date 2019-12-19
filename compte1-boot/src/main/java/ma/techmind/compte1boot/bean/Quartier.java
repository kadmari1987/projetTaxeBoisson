package ma.techmind.compte1boot.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Quartier {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	private String nom;
	@ManyToOne
	private Zone id_zone;
	public Quartier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Quartier(long id, String nom, Zone id_zone) {
		super();
		this.id = id;
		this.nom = nom;
		this.id_zone = id_zone;
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
		Quartier other = (Quartier) obj;
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
	public Zone getId_zone() {
		return id_zone;
	}
	public void setId_zone(Zone id_zone) {
		this.id_zone = id_zone;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
