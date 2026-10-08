package Tema1.BoletinFicheros.Ejercicio8;

import java.io.File;
import java.util.Comparator;

public class ComparadorTamano implements Comparator<File> {

	@Override
	public int compare(File o1, File o2) {
		// TODO Auto-generated method stub
		return (int) (o1.length() - o2.length());
	}
}