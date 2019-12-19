package ma.techmind.compte1boot.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.techmind.compte1boot.bean.Compte;
import ma.techmind.compte1boot.model.dao.CompteDao;
import ma.techmind.compte1boot.model.service.CompteService;

@Service
public class CompteServiceImpl implements CompteService {

	@Autowired
	private CompteDao compteDao;

	@Override
	public List<Compte> findAll() {
		return compteDao.findAll();
	}

	@Override
	public int crediter(String rib, double montant) {
		Compte compte = findByRib(rib);
		if (compte == null) {
			return -1;
		} else if (compte.getOuvert() == false) {
			return -2;
		} else {
			double nvsolde = compte.getSolde() + montant;
			compte.setSolde(nvsolde);
			save(compte);
			return 1;
		}

	}

	@Override
	public int debiter(String rib, double montant) {
		Compte compte = findByRib(rib);
		if (compte == null) {
			return -1;
		} else if (compte.getOuvert() == false) {
			return -2;
		} else if (compte.getSolde() < montant) {
			return -3;
		} else {
			double nvsolde = compte.getSolde() - montant;
			compte.setSolde(nvsolde);
			save(compte);
			return 1;
		}

	}

	@Override
	public Compte findByRib(String rib) {
		// TODO Auto-generated method stub
		return compteDao.findByRib(rib);
	}

	@Override
	public void save(Compte compte) {
		 compteDao.save(compte);
		
	}

}
