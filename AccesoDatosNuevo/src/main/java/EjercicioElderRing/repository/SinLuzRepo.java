package EjercicioElderRing.repository;

import java.util.Set;

import EjercicioElderRing.modelo.SinLuz;

public class SinLuzRepo {
	
	Set<SinLuz> listaSinLuz;

	public SinLuzRepo(Set<SinLuz> listaSinLuz) {
		super();
		this.listaSinLuz = listaSinLuz;
	}

	public void getSinLuz() {
		
	}
	
	public void agregaEncuentro() {
		
	}
	
	@Override
	public String toString() {
		return "SinLuzRepo [listaSinLuz=" + listaSinLuz + "]";
	}

	
	
	
}
