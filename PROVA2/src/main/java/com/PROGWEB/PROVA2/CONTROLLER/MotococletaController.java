package com.PROGWEB.PROVA2.CONTROLLER;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.PROGWEB.PROVA2.MODEL.Motocicleta;
import com.PROGWEB.PROVA2.REPOSITORY.MotocicletaRepository;


@RestController
@RequestMapping("/api")
public class MotococletaController {

	@Autowired
	MotocicletaRepository motoRepository;
	
	@GetMapping("/create")
	public void Create(@RequestBody Motocicleta moto2) {
			motoRepository.save(moto2);
			System.out.println("Created: "+ moto2);

	}
	
	@GetMapping("/delete/{id}")
	public String Delete(@RequestParam Long id) {
		Optional<Motocicleta> encontrado = motoRepository.findById(id);
		
		if(encontrado.isPresent()) {
			motoRepository.deleteById(id);
			return "Salvou o id: "+id;
		}else {
			return "not found";
		}
		
	}
	
	@PostMapping("/listagem")
	public List<Motocicleta> index(){
		return (List<Motocicleta>) motoRepository.findAll();
	}
	
	@PostMapping("/buscar/{id}")
	public Motocicleta Buscar(@RequestParam Long id) {
		
		Optional<Motocicleta> moto4 = motoRepository.findById(id);
		
		if(moto4.isPresent()) {
			Motocicleta motorr = moto4.get();
			
			return motorr;
		}else {
			return null;
		}
		
	}
	
	@PostMapping("/update/{id}")
	public String Update(@RequestParam Long id, @RequestBody Motocicleta moto3) {
		
		Optional<Motocicleta> encontrado = motoRepository.findById(id);
		
		if(encontrado.isPresent() && !encontrado.equals(moto3)) {
			Motocicleta update = encontrado.get();
			
			update.setMarca(moto3.getMarca());
			update.setModelo(moto3.getModelo());
			update.setCor(moto3.getCor());
			update.setPlaca(moto3.getPlaca());
			update.setAno(moto3.getAno());
			update.setValor(moto3.getValor());
			update.setProprietario(moto3.getProprietario());
			
			motoRepository.save(update);
			
			return "updeitado";
		}else {
			return "Deu ruim";
		}
		
	}
	
	
}
