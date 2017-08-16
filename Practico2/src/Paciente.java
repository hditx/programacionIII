import java.util.ArrayList;

public class Paciente {
	private int idPaciente;
	private String nombre;
	private Mascota mascota;
	private float peso;
	private ArrayList<Formulario> formulario;
	
	public Paciente(int idPaciente, String nombre, Mascota mascota, float peso) {
		this.idPaciente = idPaciente;
		this.nombre = nombre;
		this.mascota = mascota;
		this.peso = peso;
		this.formulario = new ArrayList<Formulario>();
	}
	
	public int getMascotaIdPaciente(){
		return this.mascota.getIdMascota();
	}
	
	public String getColorPeloMascota(){
		return this.mascota.getColorPelo();
	}
	
	public String getNombreMascota(){
		return this.mascota.getNombre();
	}
	
	public float getPesoActualMascota(){
		return this.mascota.getPesoActual();
	}
	
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Mascota getMascota() {
		return mascota;
	}
	
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public void addVisita(Formulario e){
		this.formulario.add(e);
	}
}
