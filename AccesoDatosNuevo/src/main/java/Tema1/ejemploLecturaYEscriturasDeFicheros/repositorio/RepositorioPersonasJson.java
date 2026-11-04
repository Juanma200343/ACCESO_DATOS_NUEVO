package Tema1.ejemploLecturaYEscriturasDeFicheros.repositorio;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import Tema1.ejemploLecturaYEscriturasDeFicheros.RepositorioException;
import Tema1.ejemploLecturaYEscriturasDeFicheros.Modelo.Persona;

public class RepositorioPersonasJson implements IRepositorioPersonas {
	
	private static final String  rutaDirectorioPadre = "src\\main\\resources";
	private static final String rutaDirectorioHijo = "src\\main\\java\\Tema1\\ejemploLecturaYEscriturasDeFicheros\\repositorio\\RepositorioPersonasJson.java";
	
	private Gson gson ;
	private File fichero;
	private List<Persona> personas;
	
	public RepositorioPersonasJson(Gson gson, File fichero, List<Persona> personas) {
		super();
		this.gson = gson;
		this.fichero = new File(rutaDirectorioPadre, rutaDirectorioHijo);
		this.personas = new ArrayList<Persona>();
	}

	public Gson getGson() {
		return gson;
	}

	public void setGson(Gson gson) {
		this.gson = gson;
	}

	public File getFichero() {
		return fichero;
	}

	public void setFichero(File fichero) {
		this.fichero = fichero;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	@Override
	public List<Tema1.ejemploLecturaYEscriturasDeFicheros.Persona> findAll() throws RepositorioException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tema1.ejemploLecturaYEscriturasDeFicheros.Persona findById(String nombre) throws RepositorioException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String nombre) throws RepositorioException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void save(Tema1.ejemploLecturaYEscriturasDeFicheros.Persona persona) throws RepositorioException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteById(String nombre) throws RepositorioException {
		// TODO Auto-generated method stub
		return false;
	} 
	
	
	
	
	
	
}
