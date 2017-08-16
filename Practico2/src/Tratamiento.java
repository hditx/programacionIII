public class Tratamiento {
	private int idTratamiento;
	private String nombre;
	private String tipoTratamiento;
	private String observaciones;
	
	public Tratamiento(int idTratamiento, String nombre, String tipoTratamiento, String observaciones) {
		this.idTratamiento = idTratamiento;
		this.nombre = nombre;
		this.tipoTratamiento = tipoTratamiento;
		this.observaciones = observaciones;
	}
	
	public Tratamiento(){
	}

	public int getIdTratamiento() {
		return idTratamiento;
	}

	public void setIdTratamiento(int idTratamiento) {
		this.idTratamiento = idTratamiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoTratamiento() {
		return tipoTratamiento;
	}

	public void setTipoTratamiento(String tipoTratamiento) {
		this.tipoTratamiento = tipoTratamiento;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
}
