package ejemploLecturaXML;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;


import javax.xml.parsers.*;

import java.io.File;
import java.io.IOException;

public class EjemploDOM {
    private static final String RUTA_RESOURCES = "src/main/resources/";
	private static final Logger logger = LogManager.getLogger(EjemploDOM.class);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UtilesDomXML utiles = new UtilesDomXML () ;
		Document doc = utiles.getDocumentFromXML("libro.xml") ;

		Element tituloElemento = (Element) doc.getElementsByTagName("titulo").item(0) ;

		String título = tituloElemento . getTextContent () ;

		Element autorElemento = (Element) doc.getElementsByTagName("autor").item(0) ;
		
		Element raiz = doc.getDocumentElement();
		Libro libro = (Libro) utiles.fromElement2Libro(raiz);
		System.out.println(libro);

		//String autor = autorElemento.getTextContent();​


		//logger.info("Título: " + título ) ; //Meter autor cuando vaya  " Autor: " + autor 
	}
	
}
