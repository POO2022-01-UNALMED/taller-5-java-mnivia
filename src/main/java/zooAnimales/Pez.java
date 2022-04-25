package zooAnimales;

import java.util.ArrayList;



public class Pez extends Animal {
	
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		listado.add(this);
		// TODO Auto-generated constructor stub
	}
	
	/*
	public Pez(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		// TODO Auto-generated constructor stub
	}
	*/
	
	public Pez(String Nombre, int edad, String habitat, String genero,String colorEscamas,int cantidadAletas) {
		listado.add(this);
		setNombre(Nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		
	}
	
	
	
	public static ArrayList<Pez> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	public String movimiento() {
		return("nadar");
	}	
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez.salmones++;
		return new Pez(nombre, edad, "oceano", genero, "gris", 6);
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez.bacalaos++;
		return new Pez(nombre, edad, "oceano", genero, "gris", 6);
	}	
	

}
