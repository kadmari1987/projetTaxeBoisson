package ma.techmind.compte1boot.model.service.facade;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ma.techmind.compte1boot.bean.Categorie;

public interface CategorieService {
	public Categorie findByType(String type);

	public void save(Categorie categorie);

	public List<Categorie> findAll();

	public List<Categorie> findByNonPaye();

	public List<Categorie> findByNonPaye( double pourcentage);

	public int deleteByType(String type);
}
