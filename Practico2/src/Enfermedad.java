public class Enfermedad {
	private int idEnfermedad;
	private String nombre;
	private String tipoEnfermedad;
	
	public Enfermedad(int idEnfermedad, String nombre, String tipoEnfermedad) {
		this.idEnfermedad = idEnfermedad;
		this.nombre = nombre;
		this.tipoEnfermedad = tipoEnfermedad;
	}
	
	public Enfermedad(){
	}
	
	public int getIdEnfermedad() {
		return idEnfermedad;
	}
	
	public void setIdEnfermedad(int idEnfermedad) {
		this.idEnfermedad = idEnfermedad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTipoEnfermedad() {
		return tipoEnfermedad;
	}
	
	public void setTipoEnfermedad(String tipoEnfermedad) {
		this.tipoEnfermedad = tipoEnfermedad;
	}
	
}
