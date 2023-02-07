package br.com.ProgWeb.CarDataBase.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
