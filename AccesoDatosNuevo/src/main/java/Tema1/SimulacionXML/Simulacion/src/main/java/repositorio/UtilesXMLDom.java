package Tema1.SimulacionXML.Simulacion.src.main.java.repositorio;

import java.io.File;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import Tema1.SimulacionXML.Simulacion.src.main.java.exception.VeterinariaException;
import Tema1.SimulacionXML.Simulacion.src.main.java.modelo.Mascota;
import Tema1.SimulacionXML.Simulacion.src.main.java.modelo.Propietario;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UtilesXMLDom {
	
	private static final String RUTA_RESOURCES = "src/main/resources/";
	private static final Logger logger = LogManager.getLogger(UtilesXMLDom.class);
	
	private void escribeDocumentoEnFichero(Document documento, String nombreFichero) throws TransformerException {
		// clases necesarias finalizar la creación del archivo XML
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer;
		transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(documento);
		StreamResult resultado = new StreamResult(new File(this.RUTA_RESOURCES + nombreFichero));
		transformer.transform(source, resultado);
	}
	
	private Element creaElemento(String nombreElemento, String valorElemento, Element padre, Document documento) {
		Element elemento = documento.createElement(nombreElemento);
		if (valorElemento != null) {
			Text texto = documento.createTextNode(valorElemento);
			elemento.appendChild(texto);// Cargo el elemento con el valor
		}
		padre.appendChild(elemento);// Se lo asigno a su padre como Hijo
		return elemento;
	}
	
	
	
	private void agregaEmpleadoADocumento(Document documento, Element padre, Mascota m) {
		// Para cada una de los atributos de persona, creo un elemento hijo
		Element nombre = this.creaElemento("nombre", m.getNombre(), padre, documento);
		Propietario p = m.getPropietario();
		Element propietario = this.creaElemento("propietario", null, padre, documento);
		Element nombrePropietario = this.creaElemento("nombreP", p.getNombre(), propietario, documento);
	}
	
	private Document construyoObjetoDocumento(String nombreRaiz) throws ParserConfigurationException {
		Document documento = null;
		DocumentBuilderFactory factoria = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factoria.newDocumentBuilder();
		DOMImplementation implementacion = builder.getDOMImplementation();
		documento = implementacion.createDocument(null, nombreRaiz, null);
		// Primer parámetro uri: si null no está validado por ninguna ruta
		// segundo parámetro: nombre fichero
		// tercer parámetro: document type Por defecto null Permite asociar DTD
		return documento;
	}

	
	public void escribeMascotaEnXML(String nombreFichero, List<Mascota> mascotas) {
		try {
			Document documento = this.construyoObjetoDocumento("clinica");
			// Recupero la raíz del documento
			Element raiz = documento.getDocumentElement();
			for (Mascota m : mascotas) {
				Element mascota = this.creaElemento("mascota", null, raiz, documento);
				agregaEmpleadoADocumento(documento, mascota, m );
			}
			escribeDocumentoEnFichero(documento, nombreFichero);
		} catch (ParserConfigurationException e1) {
			logger.error(e1.getMessage());
		} catch (TransformerException e1) {
			logger.error(e1.getMessage());
		}
	}
	
	private  Mascota getMascotaFromElement(Element elemento)
	{
		String nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
		Propietario propietario = this.getPropietarioFromElement((Element) elemento.getElementsByTagName("propietario").item(0));
		
		Mascota m = new Mascota(nombre,propietario);
			
	 // La etiqueta empleado tiene el atributo identificador
			m.setNombre(nombre);
			m.setPropietario(propietario);
			return m;
	}
	
	private Propietario getPropietarioFromElement(Element e) { // Devuelve Propietario para Mascotas
		Propietario p = new Propietario(e.getElementsByTagName("nombreP").item(0).getTextContent());
	
		return p;
	}
	
	public List<Mascota> leerMascotasXML(Element raiz){
		NodeList lista = raiz.getElementsByTagName("mascota");
		List<Mascota> mascotas = new ArrayList<Mascota>();
		for (int i = 0; i < lista.getLength(); i++) {
			Element elementoMascota = (Element) lista.item(i);
			Mascota mascota = getMascotaFromElement(elementoMascota);
			mascotas.add(mascota);
		}
		return mascotas;
		
	}
	
	public Document getDocumentFromXML(String nombreFichero)  {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        Document doc = null;
        try {
            builder = factory.newDocumentBuilder();
            doc = builder.parse(new File(RUTA_RESOURCES,nombreFichero));
        } catch (ParserConfigurationException e) {
        	logger.error(e.getMessage());
        } catch (SAXException e) {
        	logger.error(e.getMessage());

        } catch (IOException e) {
        	logger.error(e.getMessage());
        }

        return doc;
    }
	
	public List<Mascota> lecturaXML() throws VeterinariaException {
		Document doc = getDocumentFromXML("veterinaria2.xml");
		Element raiz = doc.getDocumentElement();
		List<Mascota> mascotas =  leerMascotasXML(raiz);
		return mascotas;
	}

}
