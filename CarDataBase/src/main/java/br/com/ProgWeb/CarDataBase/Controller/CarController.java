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
		
	}
	
	@GetMapping({"/cars/brand"})
	public Iterable<Car> getCarsByBrand(@RequestParam("brand") String brand) {
		
		return carRepository.findByBrand(brand);
		
		//http://localhost:8081/cars/brand?brand=honda
		
	}
	
	@GetMapping({"/cars/colorOrBrand"})
	public Iterable<Car> getCarsByColorOrBrand(@RequestParam("color") String color, @RequestParam("brand") String brand) {
		
		return carRepository.findByBrandOrColor(color, brand);  	
		
		//http://localhost:8081/cars/colorOrBrand?color=vermelho&brand=Ford
		//mas esse link ai nao ta funcionando, ta dando uma array vazia, ou seja, o metodo ta funcionando, mas nao encontra nada no BD.
		
	}
}
