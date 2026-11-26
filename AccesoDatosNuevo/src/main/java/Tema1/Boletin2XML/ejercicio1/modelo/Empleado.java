package Tema1.Boletin2XML.ejercicio1.modelo;//

public class Empleado {
	
	private String id;
	private String nombreApellidos;
	private int edad;
	private String empresa;
	private Puesto puesto;
	
	public Empleado(String nombreApellidos, String empresa, Puesto puesto) {
		super();
		this.nombreApellidos = nombreApellidos;
		this.empresa = empresa;
		this.puesto = puesto;
	}
	
	public Empleado(String id, String nombreApellidos, int edad, String empresa, Puesto puesto) {
		super();
		this.id = id;
		this.nombreApellidos = nombreApellidos;
		this.edad = edad;
		this.empresa = empresa;
		this.puesto = puesto;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombreApellidos() {
		return nombreApellidos;
	}

	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombreApellidos=" + nombreApellidos + ", edad=" + edad + ", empresa=" + empresa
				+ ", puesto=" + puesto + "]";
	}

	
	
}
