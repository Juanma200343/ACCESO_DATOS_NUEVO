package Tema1.BoletinXML.ejercicio1;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import ejemploLecturaXML.Libro;

public class UtilesDomXMLPelicula {
	
	   public Document getDocumentFromXML(String nombreFichero) {
    	   DocumentBuilderFactory factory =   DocumentBuilderFactory.newInstance();
    	    DocumentBuilder builder;
    	    Document doc = null;
			
				try {
					builder = factory.newDocumentBuilder();
					doc = builder.parse( new File(nombreFichero));

				} catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return doc;
    }
    
	
	   public Pelicula fromElement2Pelicula(Element raiz) {
			Element tituloElemento = (Element) raiz.getElementsByTagName("Titulo").item(0);  
			Element duracionElemento = (Element) raiz.getElementsByTagName("Duracion").item(0);
			Element generoElemento = (Element)  raiz.getElementsByTagName("Genero").item(0);
			Element sinopsisElemento = (Element)  raiz.getElementsByTagName("sinopsis").item(0);
			Element anoElemento = (Element)  raiz.getElementsByTagName("Fecha").item(0);
			Element directorElemento = (Element)  raiz.getElementsByTagName("Director").item(0);
			
			Pelicula p = new Pelicula(tituloElemento, duracionElemento,generoElemento,sinopsisElemento,anoElemento,directorElemento);
		
			return p;
		}
	    	

}
