package Tema1.Boletin2XML.ejercicio1.repositorio;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import Tema1.Boletin2XML.ejercicio1.modelo.Empleado;
import Tema1.Boletin2XML.ejercicio1.modelo.Puesto;
import Tema1.Boletin2XML.exception.EmpleadoException;
import Tema1.ejemplosFicheros.EjemploFichero;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

	private void agregaEmpleadoADocumento(Document documento, Element padre, Empleado e) {
		// Para cada una de los atributos de persona, creo un elemento hijo
		Element nombre = this.creaElemento("nombreApellido", e.getNombreApellidos(), padre, documento);
		Element empresa = this.creaElemento("empresa", e.getEmpresa(), padre, documento);
		if (Integer.toString(e.getEdad()) != null) {/* Aqui crea edad si no es nula */
			Element edad = this.creaElemento("edad", Integer.toString(e.getEdad()), padre, documento);
		}
		// El identificador lo vamos a crear como un atributo de la etiqueta empleado
		if (e.getId() != null) {
			padre.setAttribute("identificador", e.getId());
		}
		Puesto p = e.getPuesto();
		Element puesto = this.creaElemento("puesto", null, padre, documento);
		Element nombrePuesto = this.creaElemento("nombrePuesto", p.getNombrePuesto(), puesto, documento);
		Element salario = this.creaElemento("salario", Integer.toString(p.getSalario()), puesto, documento);

		if (p.getDepartamento() != null) {
			Element departamento = this.creaElemento("Departamento", p.getDepartamento(), puesto, documento);
		}
		if (p.getId() != null) {
			Element id = this.creaElemento("Identificador", p.getId(), puesto, documento);
		}
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

	public void escribeEmpleadoEnXML(String nombreFichero, List<Empleado> empleados) {
		try {
			Document documento = this.construyoObjetoDocumento("empleados");
			// Recupero la raíz del documento
			Element raiz = documento.getDocumentElement();
			for (Empleado e : empleados) {
				Element empleado = this.creaElemento("empleado", null, raiz, documento);
				agregaEmpleadoADocumento(documento, empleado, e );
			}
			escribeDocumentoEnFichero(documento, nombreFichero);
		} catch (ParserConfigurationException e1) {
			logger.error(e1.getMessage());
		} catch (TransformerException e1) {
			logger.error(e1.getMessage());
		}
	}
	private  Empleado getEmpleadoFromElement(Element elemento)
	{
		String nombre = elemento.getElementsByTagName("nombreApellidos").item(0).getTextContent();
		String empresa = elemento.getElementsByTagName("empresa").item(0).getTextContent();
		Puesto puesto = this.getPuestoFromElement((Element) elemento.getElementsByTagName("puesto").item(0));
		
		Empleado e = new Empleado(nombre,empresa,puesto);
			
			if(elemento.getElementsByTagName("edad").item(0) != null) {
				int edad = Integer.parseInt(elemento.getElementsByTagName("edad").item(0).getTextContent());
				e.setEdad(edad);
			}
			if(elemento.getElementsByTagName("id").item(0) != null ) {
				String id = elemento.getAttribute("identificador");
				e.setId(id);
			}
	 // La etiqueta empleado tiene el atributo identificador
			e.setNombreApellidos(nombre);
			e.setEmpresa(empresa);
			return e;

	}
	
	private Puesto getPuestoFromElement(Element e) { // Devuelve puesto para Empleados
		Puesto p = new Puesto(e.getElementsByTagName("nombrePuesto").item(0).getTextContent(),Integer.parseInt(e.getElementsByTagName("salario").item(0).getTextContent()));
		if(e.getElementsByTagName("departamento").item(0).getTextContent() != null) {
			p.setDepartamento(e.getElementsByTagName("departamento").item(0).getTextContent());
		}
		if(e.getAttribute("id") != null) {
			p.setId(e.getAttribute("id"));
		}
		return p;
	}
	
	public List<Empleado> leerEmpleadosDesdeXML(Element raiz) {
	    // 1. Obtener todos los elementos <empleado>
	    NodeList listaNodos = raiz.getElementsByTagName("empleado");
	    // 2. Crear la colección de empleados
	    List<Empleado> empleados = new ArrayList<>();
	    // 3. Recorrer los elementos <empleado>
	    for (int i = 0; i < listaNodos.getLength(); i++) {
	        Element elementoEmpleado = (Element) listaNodos.item(i);
	        // 4. Convertir el elemento en un objeto Empleado
	        Empleado empleado = getEmpleadoFromElement(elementoEmpleado);
	        // 5. Añadir el empleado a la colección
	        empleados.add(empleado);
	    }
	    return empleados;
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
	
	public Set<Empleado> lecturaXML() throws EmpleadoException {
		Document doc = getDocumentFromXML("empleados.xml");
		Element raiz = doc.getDocumentElement();
		Set<Empleado> empleados = (Set<Empleado>) leerEmpleadosDesdeXML(raiz);
		return empleados;
	}
	
}
