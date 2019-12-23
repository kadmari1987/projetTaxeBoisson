package ma.techmind.compte1boot.model.ws.provided;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.techmind.compte1boot.bean.Categorie;
import ma.techmind.compte1boot.model.service.facade.CategorieService;

@RestController
@RequestMapping("taxeBoisson-api/categorie")
public class CategorieRest {

	@Autowired
	private CategorieService categorieService;
	@GetMapping("/type/{type}")
	public Categorie findByType(@PathVariable String type) {
		return categorieService.findByType(type);
	}

	@PostMapping("/")
	public void save(@RequestBody Categorie categorie) {
		categorieService.save(categorie);
	}

	@GetMapping("/")
	public List<Categorie> findAll() {
		return categorieService.findAll();
	}

	@GetMapping("/non-paye")
	public List<Categorie> findByNonPaye() {
		return categorieService.findByNonPaye();
	}

	@GetMapping("/non-paye/pourcentage/{pourcentage}")
	public List<Categorie> findByNonPaye(@PathVariable double pourcentage) {
		return categorieService.findByNonPaye(pourcentage);
	}

	@DeleteMapping("/type/{type}")	
	public int deleteByType(@PathVariable String type) {
		return categorieService.deleteByType(type);
	}
	
	
	
}
