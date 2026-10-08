package Tema1.BoletinFicheros.Ejercicio8;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Ejercicio8 {
	
    private static final Logger logger = LogManager.getLogger(Ejercicio8.class);



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String carpetaUsuario = System.getProperty("user.home");

		 File directorio = new File(carpetaUsuario, "Ejercicio8");

		  File[] contenido = directorio.listFiles();
		  
		 
		  Arrays.sort(contenido, new ComparadorTamano());
		  

	      /*  if (contenido != null) {

	            logger.info("Contenido final de miDirectorio:");

	            for (String nombre : contenido) {
	                logger.info(nombre);
	            }

	        } else {
	            logger.error("No se ha podido mostrar el contenido.");
	        }*/
		
	}

}
