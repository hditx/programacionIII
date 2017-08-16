public class Especie {
	private int idEspecie;
	private String nombre;
	
	public Especie(int idEspecie, String nombre){
		this.setIdEspecie(idEspecie);
		this.setNombre(nombre);
	}
	
	public int getIdEspecie(){
		return this.idEspecie;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setIdEspecie(int idEspecie){
		this.idEspecie = idEspecie;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Especie:" + nombre;
	}
	
	
}
