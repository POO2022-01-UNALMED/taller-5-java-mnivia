package gestion;


import zooAnimales.Animal;
import java.util.*;

public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona() {
		
	}
	
	public Zona(String nombre, Zoologico zoo) {		
		this.nombre = nombre;
		this.zoo = zoo;
		//this.animales = animales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	
	
	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
	}
	
	public int cantidadAnimales() {
		return this.animales.size();
	}
	
	
	
	
	

}
