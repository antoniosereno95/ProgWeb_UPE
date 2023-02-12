package br.com.ProgWeb.CarDataBase.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
@JsonIgnoreProperties({"hibernateLazyInicializer", "handler"})
//pra resolver o problema do carregamento do arquivo JSON, eu tive que colcoar essas anotaçoes de JSONIgnore com a propriedade LazyInicializer, assim como mostrado em sala de aula
//@Table(name="dono")
public class Owner {
	
	//Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ownerId;
	
	private String firstName, lasteName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	@JsonIgnore //Aqui tbm, usamos o jsonIgnore para que o Atributo lista de carros seja carregado em formato JSON sem dar o erro de StackOverflow
	private List<Car> cars;
	
	
	//construtor
	public Owner(String firstname, String lastename) {
		super();
		this.firstName = firstname;
		this.lasteName = lastename;
	}
	//construtor vazio pro spring fazer as operacoes dele
	public Owner() {}
	
	
	//Gets and Sets
	public List<Car> getCar() {
		return cars;
	}
	public void setCar(List<Car> cars) {
		this.cars = cars;
	}

	public long getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(long ownerid) {
		this.ownerId = ownerid;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}
	
	public String getLasteName() {
		return lasteName;
	}
	public void setLasteName(String lastename) {
		this.lasteName = lastename;
	}

	@Override
	public String toString() {
		return "Owner [ownerid=" + ownerId + ", firstname=" + firstName + ", lastename=" + lasteName + ", cars=" + cars
				+ "]";
	}
	
}
