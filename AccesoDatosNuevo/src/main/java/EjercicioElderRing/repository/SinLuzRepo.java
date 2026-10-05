package EjercicioElderRing.repository;

import java.util.Map;
import java.util.Set;

import EjercicioElderRing.modelo.Encuentro;
import EjercicioElderRing.modelo.SinLuz;

public class SinLuzRepo {
	
	private Map<SinLuz,Encuentro> map;

	

	public SinLuzRepo(Map<SinLuz, Encuentro> map) {
		super();
		this.map = map;
	}

	public void getSinLuz() {
		
	}
	
	public void agregaEncuentro() {
		
	}

	@Override
	public String toString() {
		return "SinLuzRepo [map=" + map + "]";
	}


}
