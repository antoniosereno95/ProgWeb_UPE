package br.com.ProgWeb.CarDataBase.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
@JsonIgnoreProperties({"hibernateLazyInicializer", "handler"})
//pra resolver o problema do carregamento do arquivo JSON, eu tive que colcoar essas anotaçoes de JSONIgnore com a propriedade LazyInicializer, assim como mostrado em sala de aula
//@Table(name="carro") a anotacao ta aqui por motivos didaticos
public class Car {
	
	//Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@JsonIgnore
	private long id;

	private String brand, model, color, registerNumber;
	private int year, price;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner")
	@JsonIgnore //a anotacao JsonIgnore tbm é colocada encima da propriedade Owener por ocnta da anotaçao @ManyToMany que possibilita um Owner ter diversos carros
	private Owner owner;
	
	//construtor
	public Car(String brand, String model, String color, String registerNumber, int year, int price, Owner owner) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.registerNumber = registerNumber;
		this.year = year;
		this.price = price;
		this.owner = owner;
	}
	//construtor vazio pro spring fazer as operacoes dele
	public Car() {}


	//Gets and Sets
	public Owner getOwner() {
		return owner;
	}
	

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", model=" + model + ", color=" + color + ", registerNumber="
				+ registerNumber + ", year=" + year + ", price=" + price + ", owner=" + owner + "]";
	}
	
}