package com.progweb.atv.AtividadeEmSala.Controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.progweb.atv.AtividadeEmSala.Models.Costumer;
import com.progweb.atv.AtividadeEmSala.Repository.CostumerRepository;

@Controller
@RequestMapping("/costumer")
public class CostumerController {
	
	@Autowired
	CostumerRepository costumerRepository;
	
	@PostMapping("/create")
	public void CreateCostumer(@Valid Costumer novoCostumer) {
		costumerRepository.save(novoCostumer);
	}
	
	@PostMapping("/update")
	public String UpdateCostumer(@RequestBody @Valid Costumer atualizarCostumer) {
		
		Optional<Costumer> encontrado = costumerRepository.findById(atualizarCostumer.getId());
		
		if(!encontrado.equals(atualizarCostumer)) {
			
			Costumer Update = encontrado.get();
			Update.setNome(atualizarCostumer.getNome());
			Update.setEmail(atualizarCostumer.getEmail());
			Update.setIdade(atualizarCostumer.getIdade());
			costumerRepository.save(Update);
			
			System.out.println("Atualizado");
			return "Atualizado";
		}else {
			System.out.println("Erro, objeto igual ao do banco de dados");
			return "Not found";
		}
	
	}
	
	/*
	@PutMapping("/tutorials/{id}")
	  public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
	    Optional<Tutorial> tutorialData = tutorialRepository.findById(id);

	    if (tutorialData.isPresent()) {
	      Tutorial _tutorial = tutorialData.get();
	      _tutorial.setTitle(tutorial.getTitle());
	      _tutorial.setDescription(tutorial.getDescription());
	      _tutorial.setPublished(tutorial.isPublished());
	      return new ResponseEntity<>(tutorialRepository.save(_tutorial), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	*/
	
	@PostMapping("/delete/{id}")
	public String DeleteCostumer(@RequestBody @Valid Costumer deletarCostumer) {
		
		Optional<Costumer> encontrado = costumerRepository.findById(deletarCostumer.getId());
		
		if(encontrado.isPresent()) {
			costumerRepository.deleteById(encontrado.get().getId());
			return "Deletou";
		}else {
			return "Costumer not found";
		}
		
	}
	
	
	@GetMapping("/index")
	public List<Costumer> Index() {
		List<Costumer> lista = costumerRepository.findAll();
		
		return lista;
	}
	
	@GetMapping("/getById/{id}")
	public Optional<Costumer> GetById(@PathVariable Long id) {
		
		Optional<Costumer> encontrado = costumerRepository.findById(id);
		
		if(encontrado.isPresent()) {
			return encontrado;
		}else {
			return null;
		}
	}
	
}
