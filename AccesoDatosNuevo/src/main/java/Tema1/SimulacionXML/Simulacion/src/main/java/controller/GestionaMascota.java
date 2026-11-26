package Tema1.SimulacionXML.Simulacion.src.main.java.controller;

import java.util.ArrayList;

import java.util.List;

import Tema1.SimulacionXML.Simulacion.src.main.java.modelo.Mascota;
import Tema1.SimulacionXML.Simulacion.src.main.java.modelo.Propietario;
import Tema1.SimulacionXML.Simulacion.src.main.java.repositorio.UtilesXMLDom;

public class GestionaMascota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tema1.SimulacionXML.Simulacion.src.main.java.modelo.Propietario p = new Propietario("Juan");
		Mascota m = new Mascota("Rodolfo", p);
		
		Propietario p2 = new Propietario("Pepe");
		Mascota m2= new Mascota("Pintitas", p2);
		
		Propietario p3 = new Propietario("Rodrigo");
		Mascota m3= new Mascota("Oso", p3);
		
		List<Mascota> mascotas = new ArrayList<Mascota>();
		mascotas.add(m);
		mascotas.add(m2);
		mascotas.add(m3);
		
		UtilesXMLDom utiles = new UtilesXMLDom();
//		utiles.escribeMascotaEnXML("veterinaria2.xml", mascotas);

	}

}
