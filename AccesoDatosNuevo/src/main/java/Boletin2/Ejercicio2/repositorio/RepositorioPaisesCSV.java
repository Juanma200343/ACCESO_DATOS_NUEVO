package Boletin2.Ejercicio2.repositorio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Boletin2.Ejercicio2.modelo.Pais;

public class RepositorioPaisesCSV {
	private static final Logger logger = LogManager.getLogger(RepositorioPaisesCSV.class);
	static  String rutaDirectorio = "src\\main\\resources";

	Set<Pais>paises ;
	File fichero ;
	
	public RepositorioPaisesCSV(Set<Pais> paises , File fichero) {
		super();
		this.paises = new HashSet<Pais>();
		this.fichero = new File(rutaDirectorio);
	}
	
	public Set<Pais> getPaises() {
		return paises;
	}

	public void setPaises(Set<Pais> paises) {
		this.paises = paises;
	}

	public File getFichero() {
		return fichero;
	}

	public void setFichero(File fichero) {
		this.fichero = fichero;
	}

	public void leerFichero(String nombreFichero,Set<Pais> paises) {
		   Scanner in = null;
		    File directorio = new File(rutaDirectorio);
		    File fichero = new File(directorio, "paises.csv");

		    try {
		        boolean creado = fichero.createNewFile();
		    } catch (IOException e) {
		        logger.error("Error al crear fichero:" + e.getMessage());
		    }

		    try {
		        FileReader fichero2 = null;
				try {
					fichero2 = new FileReader(nombreFichero);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        in = new Scanner(fichero2);

		        while (in.hasNext()) {
		            String nombrePais = in.next();
		            logger.info("Dame contienente: ");
		            String continente = "";
		        	Pais p = new Pais(nombrePais, continente);
		            p = new Pais(nombrePais,p.getContinente());
		            paises.add(p);
		        }

		    } finally {
		        if (in != null) {
		            in.close();
		        }
		    }
		}
	
	
	
	}
	
	


