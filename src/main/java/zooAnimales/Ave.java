package zooAnimales;

import java.util.ArrayList;


public class Ave extends Animal {
	
	
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {		
		listado.add(this);
	}
	
	/*
	public Ave(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		// TODO Auto-generated constructor stub
	}
	*/

	public Ave(String Nombre, int edad, String habitat, String genero,String colorPlumas){
		listado.add(this);
		setNombre(Nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		this.colorPlumas = colorPlumas;
	}
	
	
	
	public static ArrayList<Ave> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	public String movimiento() {
		return("volar");
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave.halcones++;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) { 
		Ave.aguilas++;
		return new Ave(nombre, edad, "montanas", genero, "blanco");
	}
	
}
