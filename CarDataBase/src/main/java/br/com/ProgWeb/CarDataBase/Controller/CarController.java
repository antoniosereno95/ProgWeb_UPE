package br.com.ProgWeb.CarDataBase.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ProgWeb.CarDataBase.Model.Car;
import br.com.ProgWeb.CarDataBase.Repository.CarRepository;

@RestController
public class CarController {

	@Autowired
	private CarRepository carRepository;
	
	@GetMapping({"/","/cars"})
	public Iterable<Car> getCars() {
		return carRepository.findAll();
	}
	
	@GetMapping({"/cars/color"})
	public Iterable<Car> getCarsByColor(@RequestParam("color") String color) {
		
		return carRepository.findByColor(color);
		
		//http://localhost:8081/cars/color?color=amarela
		//http://localhost:8081/cars/colorOrBrand?color=vermelho
		
	}
	
	@GetMapping({"/cars/brand"})
	public Iterable<Car> getCarsByBrand(@RequestParam("brand") String brand) {
		
		return carRepository.findByBrand(brand);
		
		//http://localhost:8081/cars/brand?brand=honda
		//http://localhost:8081/cars/colorOrBrand?brand=Ford
		
	}
	
	@GetMapping({"/cars/colorAndBrand"})
	public Iterable<Car> getCarsByBrandAndColor(@RequestParam(name="brand",required=true) String brand, @RequestParam(name ="color",required=true) String color) {
		
		//->Comentario pro professor: Aqui eu tive que colocar os @RequestParam como obrigatorio
		//pra quando o usuario colocar la os parametros a busca poder funcionar com o Adento Logico do AND, essa que é feita automaticamente pelo Repository 
		 
		return carRepository.findByBrandAndColor(brand, color);  	
		
		//http://localhost:8081/cars/colorAndBrand?color=vermelho&brand=Ford
	}
	
	@GetMapping({"/cars/colorOrBrand"})
	public Iterable<Car> getCarsByBrandOrColor(@RequestParam(name="brand",required=true) String brand, @RequestParam(name ="color",required=true) String color) {
		
		//->Comentario pro professor: Aqui eu tive que colocar os @RequestParam como obrigatorio
		//pra quando o usuario colocar la os parametros a busca poder funcionar com o Adento Logico do OR, essa que é feita automaticamente pelo Repository 
				
		return carRepository.findByBrandOrColor(brand, color);
		
		//http://localhost:8081/cars/colorOrBrand?color=vermelho&brand=Ford
	
	}
}
