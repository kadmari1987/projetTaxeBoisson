package ma.techmind.compte1boot.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Compte implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String rib;
	private double solde;
	private Boolean ouvert;
	
	
	public String getRib() {
		return rib;
	}
	public void setRib(String rib) {
		this.rib = rib;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Boolean getOuvert() {
		return ouvert;
	}
	public void setOuvert(Boolean ouvert) {
		this.ouvert = ouvert ;
	}
	@Override
	public String toString() {
		return "Compte [rib=" + rib + ", solde=" + solde + ", ouvert=" + ouvert + "]";
	}
	public Compte() {
		super();
	}
	public Compte(String rib, double solde, Boolean ouvert) {
		super();
		this.rib = rib;
		this.solde = solde;
		this.ouvert = ouvert;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ouvert == null) ? 0 : ouvert.hashCode());
		result = prime * result + ((rib == null) ? 0 : rib.hashCode());
		long temp;
		temp = Double.doubleToLongBits(solde);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Compte other = (Compte) obj;
		if (ouvert == null) {
			if (other.ouvert != null)
				return false;
		} else if (!ouvert.equals(other.ouvert))
			return false;
		if (rib == null) {
			if (other.rib != null)
				return false;
		} else if (!rib.equals(other.rib))
			return false;
		if (Double.doubleToLongBits(solde) != Double.doubleToLongBits(other.solde))
			return false;
		return true;
	}
	
	
}
