package Tema1.ejemplosFicheros;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EjemploFichero {
	
	private static final Logger logger = LogManager.getLogger(EjemploFichero.class);
	
	static String rutaDirectorio = "C:\\Users\\alumno\\Desktop\\2ºDAM\\ACCESO A DATOS\\ACCESO_DATOS_NUEVO\\AccesoDatosNuevo\\src\\main\\java\\Tema1\\ejemplosFicheros";
	
	public static void main(String[] args) {
		File  directorio = new File(rutaDirectorio);
		// Referencio a un fichero dentro del directorio 
		File fichero = new File(directorio, "fichero.txt");
	try {
		boolean creado = fichero.createNewFile(); // Aquí Sí creo fichero
	} catch (IOException e) {
		// TODO Auto-generated catch block
		logger.error("Error al crear fichero:" + e.getMessage());
	}
		
	}

}
