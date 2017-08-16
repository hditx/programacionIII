import java.util.Calendar;
import java.util.GregorianCalendar;

public class Mascota {
	private int idMascota;
	private Raza raza;
	private String colorPelo;
	private GregorianCalendar fechaNacimiento;
	private float pesoActual;
	private String nombre;
	
	public Mascota(int idMascota, Raza raza, String colorPelo, GregorianCalendar fechaNacimiento, 
			float pesoActual, String nombre){
		this.setIdMascota(idMascota);
		this.raza = raza;
		this.setColorPelo(colorPelo);
		this.fechaNacimiento = fechaNacimiento;
		this.setPesoActual(pesoActual);
		this.setNombre(nombre);
	}
	
	public Mascota() {
	}

	public int getIdMascota(){
		return this.idMascota;
	}
	
	public String getRaza(){
		return this.raza.getNombre();
	}
	
	public String getColorPelo(){
		return this.colorPelo;
	}
	
	public String getFechaNacimiento(){
		return this.fechaNacimiento.get(this.fechaNacimiento.DAY_OF_MONTH) + "/" + 
				this.fechaNacimiento.get(this.fechaNacimiento.MONTH) + "/" + 
				this.fechaNacimiento.get(this.fechaNacimiento.YEAR);
	}
	
	public float getPesoActual(){
		return this.pesoActual;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setIdMascota(int idMascota){
		this.idMascota = idMascota;
	}
	
	public void setRaza(Raza raza){
		this.raza.setIdRaza(raza.getIdRaza());
		this.raza.setNombre(raza.getNombre());
	}
	
	public void setColorPelo(String colorPelo){
		this.colorPelo = colorPelo;		
	}
	
	public void setPesoActual(float pesoActual){
		this.pesoActual = pesoActual;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setFechaNacimiento(GregorianCalendar fechaNacimiento){
		this.fechaNacimiento.set(fechaNacimiento.get(fechaNacimiento.YEAR), 
				fechaNacimiento.MONTH, fechaNacimiento.DAY_OF_MONTH);
	}

	@Override
	public String toString() {
		return raza + ", Color: " + colorPelo + "\n" + fechaNacimiento
				+ "\n Peso: " + pesoActual + "\n nombre:" + nombre;
	}
	
	
}
