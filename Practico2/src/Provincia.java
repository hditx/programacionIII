public class Provincia {
	private int idProvincia;
	private String nombre;
	
	public Provincia(int idProvincia, String nombre){
		this.setIdProvincia(idProvincia);
		this.setNombre(nombre);
	}
	
	public Provincia() {
	}

	public int getIdProvincia(){
		return this.idProvincia;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setIdProvincia(int idProvincia){
		this.idProvincia = idProvincia;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
}
