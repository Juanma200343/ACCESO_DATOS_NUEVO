package Tema1.BoletinFicheros.Ejercicio4;

import java.io.File;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Tema1.BoletinFicheros.Ejercicio1.RutaNoValidaException;
import Tema1.ejemplosFicheros.EjemploFichero;

public class Ejercicio4 {
	
	private static final Logger logger = LogManager.getLogger(Ejercicio4.class);
	
	 String rutaDirectorio = "src\\main\\resources";
	
	 public void mostrarInformacion(String nombreYRutaFichero) {
		 File f = new File(nombreYRutaFichero);
		 if(f == null) {
			
		 }else {
			 for(File f1 : f.listFiles()) {
				 mostrarInformacion(f1.getAbsolutePath()); //Llamada recursiva de cada hijo
			 }
		 }
	 }
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio4 ej = new Ejercicio4();
		
        Scanner teclado = new Scanner(System.in);
        try {
            // Pedimos la ruta
            System.out.println("Introduce la ruta del directorio:");
            String ruta = teclado.nextLine();
            
            // Creamos el objeto File
            File directorio = new File(ruta);
            
            // Comprobamos que existe
            if (!directorio.exists()) {
                throw new RutaNoValidaException("La ruta no existe.");
            }

            // Comprobamos que es un directorio
            if (!directorio.isDirectory()) {
                throw new RutaNoValidaException("La ruta no es un directorio.");
            }

            // Obtenemos los elementos
            File[] elementos = directorio.listFiles();

            // Comprobamos si podemos leer el directorio
            if (elementos == null) {
                throw new RutaNoValidaException(
                        "No se puede leer el contenido del directorio."
                );
            }
        

	}catch (RutaNoValidaException e) {

        logger.error("Error");

    } finally {
        teclado.close();
    }

	}
}
