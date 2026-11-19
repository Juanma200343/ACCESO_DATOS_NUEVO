package Tema1.BoletinXML.ejercicio1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;

import ejemploLecturaXML.EjemploDOM;
import ejemploLecturaXML.UtilesDomXML;

public class GestionaPeliculas {
	   private static final String RUTA_RESOURCES = "src/main/resources/peliculas.xml";
		private static final Logger logger = LogManager.getLogger(GestionaPeliculas.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UtilesDomXMLPelicula utiles = new UtilesDomXMLPelicula() ;
		Document doc = utiles.getDocumentFromXML("peliculas.xml") ;
		
		utiles.getDocumentFromXML(RUTA_RESOURCES);
		
		
	}

}
