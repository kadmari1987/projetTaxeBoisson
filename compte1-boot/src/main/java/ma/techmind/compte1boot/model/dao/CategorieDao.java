package ma.techmind.compte1boot.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ma.techmind.compte1boot.bean.Categorie;

@Repository
public interface CategorieDao extends JpaRepository<Categorie, Long> {

	public Categorie findByType(String type);
	
	@Query(value="SELECT * FROM categorie WHERE total > totalpaye",nativeQuery = true)
	public List<Categorie> findByNonPaye();
	
	@Query("SELECT c FROM Categorie c WHERE c.totalpaye<c.total*:pourcentage")
	public List<Categorie> findByNonPaye(@Param("pourcentage") double pourcentage);
	 
	public int deleteByType(String type);
	
}
