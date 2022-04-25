package zooAnimales;

import java.util.*;

public class Anfibio extends Animal {
	
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		listado.add(this);
		// agregar cada vez que se cree un animal de este tipo
	}
	/*
	public Anfibio(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		// TODO Auto-generated constructor stub
	}
	*/
	public Anfibio(String Nombre,int edad, String habitat, String genero,String colorPiel, boolean venenoso) {
		listado.add(this);
		setNombre(Nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
	}
	
	
	
	public static ArrayList<Anfibio> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public String movimiento() {
		return("saltar");
	}
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio.ranas++;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio.salamandras++;
		return new Anfibio(nombre, edad, "selva", genero, "negro", true);
	}	

	
}
