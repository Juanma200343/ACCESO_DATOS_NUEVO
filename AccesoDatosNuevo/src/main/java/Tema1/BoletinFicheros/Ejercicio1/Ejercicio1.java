package Tema1.BoletinFicheros.Ejercicio1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Tema1.ejemplosFicheros.EjemploFichero;

public class Ejercicio1 {
private static final Logger logger = LogManager.getLogger(EjemploFichero.class);
	
	static String rutaDirectorio = "src\\main\\resources";
	

	public static void main(String[] args){
		// TODO Auto-generated method stub
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

            int totalFicheros = 0;
            int totalDirectorios = 0;

            // Recorremos los elementos
            for (File elemento : elementos) {

                if (elemento.isFile()) {
                    System.out.println("[F] " + elemento.getName());
                    totalFicheros++;

                } else if (elemento.isDirectory()) {
                    System.out.println("[D] " + elemento.getName());
                    totalDirectorios++;
                }
            }

            // Mostramos los totales
            System.out.println();
            System.out.println("Total de ficheros: " + totalFicheros);
            System.out.println("Total de directorios: " + totalDirectorios);

        } catch (RutaNoValidaException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {
            teclado.close();
        }

	}

}
