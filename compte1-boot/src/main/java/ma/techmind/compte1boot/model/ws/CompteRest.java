package ma.techmind.compte1boot.model.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.techmind.compte1boot.bean.Compte;
import ma.techmind.compte1boot.model.service.CompteService;

@RestController
@RequestMapping("banque-api/compte")
public class CompteRest {

	@Autowired
	private CompteService compteService;

	@PutMapping("/crediter/rib/{rib}/montant/{montant}")
	public void crediter(@PathVariable String rib, @PathVariable double montant) {
		compteService.crediter(rib, montant);
	}

	@PutMapping("/debiter/rib/{rib}/montant/{montant}")
	public void debiter(@PathVariable String rib, @PathVariable double montant) {
		compteService.debiter(rib, montant);
	}

	@GetMapping("/rib/{releveib}")
	public Compte findByRib(@PathVariable String releveib) {
		return compteService.findByRib(releveib);
	}

	@PostMapping("/")
	public void save(@RequestBody Compte compte) {
		compteService.save(compte);
	}

	@GetMapping("/")
	public List<Compte> findAll() {
		return compteService.findAll();
	}

}
