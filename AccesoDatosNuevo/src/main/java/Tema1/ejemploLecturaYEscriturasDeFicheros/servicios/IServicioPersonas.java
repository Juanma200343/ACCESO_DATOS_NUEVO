package Tema1.ejemploLecturaYEscriturasDeFicheros.servicios;

import java.util.List;

import Tema1.ejemploLecturaYEscriturasDeFicheros.Modelo.Persona;

public interface IServicioPersonas {
	
	public abstract List<Persona> listar();

	public abstract Persona buscar(String nombre);

	public abstract boolean alta(String nombre ,List<Double> notas);

	public abstract boolean modificarNotas(String nombre,List<Double> notas);

	public abstract boolean baja(String nombre);
	
	public abstract boolean media(Persona p);

	
}
