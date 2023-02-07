package br.com.ProgWeb.CarDataBase.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.ProgWeb.CarDataBase.Model.Car;

import java.util.List;

public interface CarRepository extends CrudRepository <Car, Long> {
	
	List<Car> findByBrand(String brand);
	List<Car> findByColor(String color);
	List<Car> findByYear(int year);
	
	List<Car> findByBrandAndModel(String brand, String model);
	List<Car> findByBrandOrColor(String brand, String color);

	List<Car> findByBrandOrderByYearAsc(String brand);
	
}