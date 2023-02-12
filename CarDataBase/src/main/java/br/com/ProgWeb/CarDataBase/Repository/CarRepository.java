package br.com.ProgWeb.CarDataBase.Repository;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import br.com.ProgWeb.CarDataBase.Model.Car;


public interface CarRepository extends CrudRepository <Car, Long> {
	
	List<Car> findByBrand(String brand);
	List<Car> findByColor(String color);
	List<Car> findByYear(int year);
	
	List<Car> findByBrandAndModel(String brand, String model);//aqui definimos o metodo da interface que sera utilizado
	
	List<Car> findByBrandOrColor(String brand, String color);//aqui definimos o metodo da interface que sera utilizado

	List<Car> findByBrandAndColor(String brand, String color);//aqui definimos o metodo da interface que sera utilizado
	
	List<Car> findByBrandOrderByYearAsc(String brand);
	
}