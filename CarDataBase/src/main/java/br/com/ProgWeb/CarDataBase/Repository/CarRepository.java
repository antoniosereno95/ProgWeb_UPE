package br.com.ProgWeb.CarDataBase.Repository;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import br.com.ProgWeb.CarDataBase.Model.Car;

@Service
public interface CarRepository extends CrudRepository <Car, Long> {
	
	List<Car> findByBrand(String brand);
	List<Car> findByColor(String color);
	List<Car> findByYear(int year);
	
	List<Car> findByBrandAndModel(String brand, String model);
	List<Car> findByBrandOrColor(String brand, String color);

	List<Car> findByBrandOrderByYearAsc(String brand);
	
}