package Tema1.Boletin2XML.ejercicio1.controller;

import java.util.ArrayList;
import java.util.List;

import Tema1.Boletin2XML.ejercicio1.modelo.Empleado;
import Tema1.Boletin2XML.ejercicio1.modelo.Puesto;
import Tema1.Boletin2XML.ejercicio1.repositorio.UtilesXMLDom;
import ejemploLecturaXML.UtilesDomXML;

public class GestionaEmpleadosXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puesto p1 = new Puesto("Analista de Marketing", 35000);
		Empleado e1 = new Empleado("Juan Pérez", "Empresa",p1);
		
		Puesto p2 = new Puesto("Diseñadora", 28000);
		Empleado e2 = new Empleado("María Pérez Sánchez", "Microsoft", p2);
		
		Puesto p3 = new Puesto("Jefe de equipo", 35000);
		Empleado e3 = new Empleado("Carlos Ruiz Martín", "Amazon",p3);
		
		Puesto p4 = new Puesto("Analista", 30000);
		Empleado e4 = new Empleado("Laura Fernández Díaz", "Apple", p4);
		
		List<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(e1);
		empleados.add(e2);
		empleados.add(e3);
		empleados.add(e4);
		
		UtilesXMLDom utiles = new UtilesXMLDom();
		utiles.escribeEmpleadoEnXML("empleados.xml", empleados);
		
		//List<Empleado> em2 = utiles.leerEmpleadosDesdeXML();
	}

}
