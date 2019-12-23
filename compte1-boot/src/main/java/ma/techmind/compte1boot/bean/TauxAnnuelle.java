package ma.techmind.compte1boot.bean;

public class TauxAnnuelle {
	private long id;
	private double tauxActuelle;
	private double tauxPrecedent;
	public TauxAnnuelle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TauxAnnuelle(long id, double tauxActuelle, double tauxPrecedent) {
		super();
		this.id = id;
		this.tauxActuelle = tauxActuelle;
		this.tauxPrecedent = tauxPrecedent;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getTauxActuelle() {
		return tauxActuelle;
	}
	public void setTauxActuelle(double tauxActuelle) {
		this.tauxActuelle = tauxActuelle;
	}
	public double getTauxPrecedent() {
		return tauxPrecedent;
	}
	public void setTauxPrecedent(double tauxPrecedent) {
		this.tauxPrecedent = tauxPrecedent;
	}

	
}
