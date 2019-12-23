package ma.techmind.compte1boot.model.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.techmind.compte1boot.bean.Categorie;
import ma.techmind.compte1boot.model.dao.CategorieDao;
import ma.techmind.compte1boot.model.service.facade.CategorieService;

@Service
public class CategorieServiceImpl implements CategorieService {

	@Autowired
	private CategorieDao categorieDao;

	@Override
	public Categorie findByType(String type) {
		return categorieDao.findByType(type);
	}

	@Override
	public void save(Categorie categorie) {

		categorieDao.save(categorie);
	}

	@Override
	public List<Categorie> findAll() {

		return categorieDao.findAll();
	}

	@Override
	public List<Categorie> findByNonPaye() {
		return categorieDao.findByNonPaye();
	}

	@Override
	public List<Categorie> findByNonPaye(double pourcentage) {
		return categorieDao.findByNonPaye(pourcentage);
	}

	@Override
	@Transactional	
	public int deleteByType(String type) {

		return categorieDao.deleteByType(type);
	}

}
