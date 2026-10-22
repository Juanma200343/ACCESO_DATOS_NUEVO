package Tema1.ejemploLecturaYEscriturasDeFicheros.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Tema1.ejemploLecturaYEscriturasDeFicheros.Persona;
import Tema1.ejemploLecturaYEscriturasDeFicheros.RepositorioException;
import Tema1.ejemploLecturaYEscriturasDeFicheros.repositorio.RepositorioPersonasTxt;
import Tema1.ejemplosFicheros.EjemploFichero;

public class GestionaPersona {
	private static final Logger logger = LogManager.getLogger(GestionaPersona.class);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String rutaDirectorio = "src\\main\\resources\\personas.txt";

		  File fichero = new File(rutaDirectorio);
		
		   List<Double> notas = new ArrayList<>();
		    notas.add(7.5);
		    notas.add(8.25);

		    List<Persona> personas = new ArrayList<>();

		    Persona p = new Persona("Andra", notas);
		    personas.add(p);
		    p.escribePersonas(personas, "personas.txt");
		    
		    RepositorioPersonasTxt rep = new RepositorioPersonasTxt(personas, fichero);
		    try {
				rep.findAll();
			} catch (RepositorioException e) {
				// TODO Auto-generated catch block
			logger.info("Salta RepositorioException");
			}		
		    
		}

	}
