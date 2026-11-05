package Boletin2.Ejercicio2.repositorio;

import java.util.List;

import Boletin2.Ejercicio2.modelo.Pais;

public interface IRepositorioPaisesCSV {
	
	
	   List<Pais> findAll();                                     
	   //Hace lectura de fichero si lista personas es nula
	   
	   Pais findById(String nombre) ;
	   //Puede devolver null si no hay una persona con eses nombre
	   
	  boolean existsById(String nombre) ;
	   void save(Pais p);         
	   // alta o modificación Escribe fichero
	   
	   boolean deleteById(String nombre) ;
	   // Escribe en fichero

	


}
