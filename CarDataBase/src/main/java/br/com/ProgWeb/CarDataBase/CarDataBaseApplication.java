package br.com.ProgWeb.CarDataBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.ProgWeb.CarDataBase.Model.Car;
import br.com.ProgWeb.CarDataBase.Model.Owner;
import br.com.ProgWeb.CarDataBase.Repository.CarRepository;
import br.com.ProgWeb.CarDataBase.Repository.OwnerRepository;

@SpringBootApplication
public class CarDataBaseApplication implements CommandLineRunner {
	@Autowired
	private CarRepository carRepository;
	
	@Autowired
	private OwnerRepository ownerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CarDataBaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Owner antonio = new Owner("antonio", "sereno");
		
		Owner amadeu = new Owner("amadeu", "santos");
		
		ownerRepository.save(antonio);
		
		ownerRepository.save(amadeu);
		
		
		//debug
		System.out.println(antonio);
		
		System.out.println(amadeu);
		//-
		
		
		Car carro3 = new Car(
				"lamburguine", "tt7", "amarela", "AtF-5621", 2017, 42000, antonio);
		
		carRepository.save(carro3);
		
		System.out.println(carro3);
		
		Car carro4 = new Car(
				"audi", "tt", "branco", "kar-5391", 2017, 42000, amadeu);
		
		carRepository.save(carro4);
		
		System.out.println(carro4);
		
		//Aqui é o script da aula ja!
		Owner owner1 = new Owner("Jamuelton", "Angelim");
		
		Owner owner2 = new Owner("Ronald", "Macario");
		
		ownerRepository.save(owner1);
		
		ownerRepository.save(owner2);
		
		carRepository.save(new Car(
				"Ford", "Ka", "vermelho", "ADF-1121", 2017, 42000,owner1)
				);
		
		carRepository.save(new Car(
				"Honda", "Civic", "preto", "ADS-5351", 1997, 15000,owner1)
				);
		
		carRepository.save(new Car(
				"Toyota", "Corolla", "prata", "FTP-2839", 1994, 13000,owner2)
				);
	}

}