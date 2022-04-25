package zooAnimales;

import java.util.ArrayList;



public class Mamifero extends Animal {
	
	
	private static ArrayList<Mamifero> listado=new  ArrayList <Mamifero> (); 
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		listado.add(this); 
		
	}
	/*
	public Mamifero(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
	
	}
	*/
	
	public Mamifero(String Nombre, int edad, String habitat, String genero,boolean pelaje, int patas) {
		listado.add(this);
		setNombre(Nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		this.pelaje=pelaje;
		this.patas = patas;
	}
	
		

	public boolean getPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
		
	
	public static ArrayList<Mamifero> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero.caballos++;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero.leones++;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}
	
	public String movimiento() {
		return("desplazarse");
	}
	
	
	
	

}
