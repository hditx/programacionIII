import java.util.ArrayList;

public class Cliente {
	private int idCliente;
	private String apellido;
	private int telefono;
	private String direccion;
	private Localidad localidad;
	private ArrayList<Persona> familia;
	private int nroCuentaBanco;
	private ArrayList<Mascota> mascota;
	
	public Cliente(int idCliente, String apellido, int telefono, String direccion, 
			Localidad localidad, int nroCuentaBanco){
		this.setIdCliente(idCliente);
		this.setApellido(apellido);
		this.setTelefono(telefono);
		this.setDireccion(direccion);
		this.localidad = localidad;
		this.familia = new ArrayList<Persona>();
		this.setNroCuentaBanco(nroCuentaBanco);
		this.mascota = new ArrayList<Mascota>();
	}
	
	public int getIdCliente(){
		return this.idCliente;
	}
	
	public String getApellido(){
		return this.apellido;
	}
	
	public int getTelefono(){
		return this.telefono;
	}
	
	public String getDireccion(){
		return this.direccion;
	}
	
	public String getLocalidad(){
		return this.localidad.getNombre();
	}
	
	public int getNroCuentaBanco(){
		return this.nroCuentaBanco;
	}
	
	public void setIdCliente(int idCliente){
		this.idCliente = idCliente;
	}
	
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	
	public void setTelefono(int telefono){
		this.telefono = telefono;
	}
	
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
	
	
	public void setNroCuentaBanco(int nroCuentaBanco){
		this.nroCuentaBanco = nroCuentaBanco;
	}
	
	public void addFamilia(Persona e){
		this.familia.add(e);
	}
	
	public void addMascota(Mascota e){
		this.mascota.add(e);
	}
	
	public void getCollectionFamily(){
		int i = 0;
		for(i = 0; i < this.familia.size(); ++i){
			System.out.println(this.familia.get(i));
		}
		
	}
	
	public void getCollectionPet(){
		int i;
		for(i = 0; i < this.mascota.size(); ++i){
			System.out.println(this.mascota.get(i));
		}
	}
}
