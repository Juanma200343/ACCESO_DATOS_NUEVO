package ejemploLecturaXML;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class UtilesDomXML {
    
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
    
    public Libro fromElement2Libro(Element raiz) {
		Element tituloElemento = (Element) raiz.getElementsByTagName("titulo").item(0);
		Element autorElemento = (Element) raiz.getElementsByTagName("autor").item(0);
		String id =  raiz.getAttribute("id");
		String categoria = raiz.getAttribute("categoria");
		String titulo = tituloElemento.getTextContent();
		String autor = autorElemento.getTextContent();
		
		Libro libro = new Libro(id, categoria, titulo, autor);
	
		return libro;
	}
    	
    public List<Libro> leerLibrosDesdeXML(){
		List<Libro> libros = new ArrayList<Libro>();
    	
    	return libros;
    	
    }
    
    
}    	
    	
    

