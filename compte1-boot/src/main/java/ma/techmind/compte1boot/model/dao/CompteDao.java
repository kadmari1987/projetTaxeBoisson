package ma.techmind.compte1boot.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.techmind.compte1boot.bean.Compte;

@Repository
public interface CompteDao extends JpaRepository<Compte, String>

{
	public Compte findByRib(String rib);

}
