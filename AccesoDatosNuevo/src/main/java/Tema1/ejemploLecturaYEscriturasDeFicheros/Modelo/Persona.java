package Tema1.ejemploLecturaYEscriturasDeFicheros.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private double nota_min;
	private double nota_max;
	private String nombre;
	private List<Double> notas;
	public Persona(String nombre, List<Double> notas) {
		super();
		this.nombre = nombre;
		this.notas = new ArrayList<Double>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Double> getNotas() {
		return notas;
	}
	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}
	@Override
	public String toString() {
		return "Persona [nota_min=" + nota_min + ", nota_max=" + nota_max + ", nombre=" + nombre + ", notas=" + notas
				+ "]";
	}
	
	
	

	

}
