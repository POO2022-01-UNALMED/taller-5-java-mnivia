package zooAnimales;

import java.util.Arrays;

import gestion.Zona;

public class Animal {
	
	private static int totalAnimales; //Este atributo pa mi debe ser estatico
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal() {
		totalAnimales++;
		
	}

	public Animal(String nombre, int edad, String habitat, String genero) {
		totalAnimales++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	
	public static String totalPorTipo() {//ya miraremos
		
		String formato="Mamiferos: "+Mamifero.getListado().size()+"\n"
						+"Aves: "+Ave.getListado().size()+"\n"
		                +"Reptiles: "+Reptil.getListado().size()+"\n"
		                +"Peces: "+Pez.getListado().size()+"\n"
		                +"Anfibios: "+Anfibio.getListado().size();
			
		
		return formato;
	}

	
	@Override
	public String toString() {
		
		if(zona != null) {
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en "
					+ habitat + "y mi genero es " + genero + ", la zona en la que me ubico es " + this.zona.getNombre() + "en el "+this.zona.getZoo();			
		}
		else {
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en "
					+ habitat + "y mi genero es " + genero; 
		}
						
	}
	


}
