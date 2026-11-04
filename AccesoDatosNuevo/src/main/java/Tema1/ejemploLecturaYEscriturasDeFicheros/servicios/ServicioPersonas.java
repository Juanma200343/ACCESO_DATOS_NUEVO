package Tema1.ejemploLecturaYEscriturasDeFicheros.servicios;

import java.util.List;

import Tema1.ejemploLecturaYEscriturasDeFicheros.Modelo.Persona;

public class ServicioPersonas implements IServicioPersonas {
	
	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona buscar(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean alta(String nombre, List<Double> notas) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificarNotas(String nombre, List<Double> notas) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean baja(String nombre) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean media(Persona p) {
		// TODO Auto-generated method stub
		return false;
	}

}
