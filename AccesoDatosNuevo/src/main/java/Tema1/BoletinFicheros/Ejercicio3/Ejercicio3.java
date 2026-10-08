package Tema1.BoletinFicheros.Ejercicio3;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ejercicio3 {

    private static final Logger logger = LogManager.getLogger(Ejercicio3.class);

    public static void main(String[] args) {

        // Apartado A

        String carpetaUsuario = System.getProperty("user.home");

        File directorio = new File(carpetaUsuario, "miDirectorio");

        if (!directorio.exists()) {

            if (directorio.mkdir()) {
                logger.info("Directorio creado correctamente.");
            } else {
                logger.error("No se ha podido crear el directorio.");
            }

        } else {
            logger.info("El directorio ya existe.");
        }

        // Apartado B

        File a1 = new File(directorio, "lectura.txt");
        File a2 = new File(directorio, "normal.txt");

        try {

            if (a1.createNewFile()) {
                logger.info("lectura.txt creado correctamente.");
            } else {
                logger.info("lectura.txt ya existía.");
            }

            if (a2.createNewFile()) {
                logger.info("normal.txt creado correctamente.");
            } else {
                logger.info("normal.txt ya existía.");
            }

        } catch (IOException e) {
            logger.error("No se han podido crear los ficheros.", e);
        }

        // Apartado C

        if (a1.setReadOnly()) {
            logger.info("lectura.txt se ha puesto en solo lectura.");
        } else {
            logger.error("No se ha podido poner lectura.txt en solo lectura.");
        }

        logger.info("Permisos de " + a1.getName());
        logger.info("Lectura: " + a1.canRead());
        logger.info("Escritura: " + a1.canWrite());
        logger.info("Ejecución: " + a1.canExecute());

        logger.info("Permisos de " + a2.getName());
        logger.info("Lectura: " + a2.canRead());
        logger.info("Escritura: " + a2.canWrite());
        logger.info("Ejecución: " + a2.canExecute());

        // Apartado D

        File nuevoNombre = new File(directorio, "renombrado.txt");

        if (a2.renameTo(nuevoNombre)) {
            logger.info("Fichero renombrado correctamente.");
        } else {
            logger.error("No se ha podido renombrar el fichero.");
        }

        // Apartado E

        if (a1.delete()) {

            logger.info("lectura.txt se ha borrado correctamente.");

        } else {

            logger.error("No se ha podido borrar. Quitando solo lectura...");

            if (a1.setWritable(true)) {

                logger.info("Se ha quitado la marca de solo lectura.");

            } else {
                logger.error("No se ha podido quitar la marca de solo lectura.");
            }
        }

        // Apartado F

        String[] contenido = directorio.list();

        if (contenido != null) {

            logger.info("Contenido final de miDirectorio:");

            for (String nombre : contenido) {
                logger.info(nombre);
            }

        } else {
            logger.error("No se ha podido mostrar el contenido.");
        }
    }
}