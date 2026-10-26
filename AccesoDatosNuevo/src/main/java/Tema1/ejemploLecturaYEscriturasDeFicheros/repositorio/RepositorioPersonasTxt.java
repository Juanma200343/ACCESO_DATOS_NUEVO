package Tema1.ejemploLecturaYEscriturasDeFicheros.repositorio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Tema1.ejemploLecturaYEscriturasDeFicheros.Persona;
import Tema1.ejemploLecturaYEscriturasDeFicheros.RepositorioException;
import Tema1.ejemplosFicheros.EjemploFichero;

public class RepositorioPersonasTxt implements IRepositorioPersonas {
	private static final Logger logger = LogManager.getLogger(RepositorioPersonasTxt.class);
	
	static  String rutaDirectorio = "src\\main\\resources";
	
	private final static String SEPARADOR = " " ; 
	
	private List<Persona> personas;
	
	private File fichero;
	
	private List<Integer> notas;

	
	public RepositorioPersonasTxt(List<Persona> personas, File fichero) {
		super();
		try {
			this.personas = findAll();
		} catch (RepositorioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.fichero = new File(rutaDirectorio);
	}
	
	
	
	public List<Persona> getPersonas() {
		return personas;
	}
	
	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public File getFichero() {
		return fichero;
	}

	public void setFichero(File fichero) {
		this.fichero = fichero;
	}
	
	
	void muestraContenidoFich(String nombre, List<Integer> notas)
	        throws FileNotFoundException {

	    Scanner in = null;
	    File directorio = new File(rutaDirectorio);
	    File fichero = new File(directorio, "fichero.txt");

	    try {
	        boolean creado = fichero.createNewFile();
	    } catch (IOException e) {
	        logger.error("Error al crear fichero:" + e.getMessage());
	    }

	    try {
	        FileReader fichero2 = new FileReader(nombre);
	        in = new Scanner(fichero2);

	        while (in.hasNext()) {
	            String nombrePersona = in.next();
	            Persona p = new Persona(nombrePersona);

	            while (in.hasNextDouble()) {
	                double nota = in.nextDouble();

	                // Aquí puedes guardar la nota en la persona
	                // si tu clase Persona dispone de ese método.
	            }

	            personas.add(p);
	        }

	    } finally {
	        if (in != null) {
	            in.close();
	        }
	    }
	}

	@Override
	public List<Persona> findAll() throws RepositorioException {
		// TODO Auto-generated method stub
		if(personas == null) {
			try {
				muestraContenidoFich(rutaDirectorio, notas);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				logger.debug("FileNotFoundException " + e);
			}
		}
		
		return personas;
	}



	@Override
	public Persona findById(String nombre) throws RepositorioException {
		// TODO Auto-generated method stub
		  Persona personaEncontrada = null;

		    for (Persona persona : personas) {
		        if (persona.getNombre().equals(nombre)) {
		            personaEncontrada = persona;
		        }
		    }

		    return personaEncontrada;
	}
	
}
