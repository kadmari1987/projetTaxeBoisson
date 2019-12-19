package ma.techmind.compte1boot.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TaxeAnnuelle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long id;
	@ManyToOne
	private Redevable redevable;
	@ManyToOne
	private Local local;
	private double pourcentageTaux;
	private double chiffreAffaire;
	private double montant;
	public TaxeAnnuelle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TaxeAnnuelle(long id, Redevable redevable, Local local, double pourcentageTaux, double chiffreAffaire,
			double montant) {
		super();
		this.id = id;
		this.redevable = redevable;
		this.local = local;
		this.pourcentageTaux = pourcentageTaux;
		this.chiffreAffaire = chiffreAffaire;
		this.montant = montant;
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
		TaxeAnnuelle other = (TaxeAnnuelle) obj;
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
	public Redevable getRedevable() {
		return redevable;
	}
	public void setRedevable(Redevable redevable) {
		this.redevable = redevable;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public double getPourcentageTaux() {
		return pourcentageTaux;
	}
	public void setPourcentageTaux(double pourcentageTaux) {
		this.pourcentageTaux = pourcentageTaux;
	}
	public double getChiffreAffaire() {
		return chiffreAffaire;
	}
	public void setChiffreAffaire(double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
}
