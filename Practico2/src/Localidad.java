public class Localidad {
	private int idLocalidad;
	private String nombre;
	private Provincia provincia;
	
	public Localidad(int idLocalidad, String nombre, Provincia provincia){
		this.setIdLocalidad(idLocalidad);
		this.setNombre(nombre);
		this.provincia = provincia;
	}
	
	public int getIdLocalidad(){
		return this.idLocalidad;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public int getProvinciaId(){
		return this.provincia.getIdProvincia();
	}
	
	public String getProvinciaNombre(){
		return this.provincia.getNombre();
	}
	
	public void setIdLocalidad(int idLocalidad){
		this.idLocalidad = idLocalidad;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setPronvincia(Provincia provincia){
		this.provincia.setIdProvincia(provincia.getIdProvincia());
		this.provincia.setNombre(provincia.getNombre());
	}
}
