package ma.techmind.compte1boot.model.service;

import java.util.List;

import ma.techmind.compte1boot.bean.Compte;

public interface CompteService {

	public Compte findByRib(String rib);

	public void save(Compte compte);

	public List<Compte> findAll();

	public int crediter(String rib, double montant);

	public int debiter(String rib, double montant);
}
