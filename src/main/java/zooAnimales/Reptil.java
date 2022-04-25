package zooAnimales;

import java.util.ArrayList;


public class Reptil extends Animal {
	
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();	
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	
	public Reptil() {
		listado.add(this);
		// TODO Auto-generated constructor stub
	}
	/*
	public Reptil(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		// TODO Auto-generated constructor stub
	}
	*/
	public Reptil(String Nombre, int edad, String habitat, String genero,String colorEscamas,int largoCola) {
		listado.add(this);
		setNombre(Nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;

	}
	
	
	
	public static ArrayList<Reptil> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public String movimiento() {
		return("reptar");
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil.iguanas++;
		return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil.serpientes++;
		return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	}	
	
}
