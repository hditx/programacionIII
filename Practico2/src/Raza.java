public class Raza {
	private int idRaza;
	private String nombre;
	private Especie especie;
	
	public Raza(int idRaza, String nombre, Especie especie){
		this.setIdRaza(idRaza);
		this.setNombre(nombre);
		this.especie = especie;
	}
	
	public int getIdRaza(){
		return this.idRaza;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public int getIdEspecie(){
		return this.especie.getIdEspecie();
	}
	
	public String getNombreEspecie(){
		return this.especie.getNombre();
	}
	
	public void setIdRaza(int idRaza){
		this.idRaza = idRaza;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setEspecie(Especie especie){
		this.especie.setIdEspecie(especie.getIdEspecie());
		this.especie.setNombre(especie.getNombre());
	}

	@Override
	public String toString() {
		return nombre + "\n" + especie;
	}
	
	
}
