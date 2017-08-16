import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
	private String apellido;
	private String nombre;
	private Documento documento;
	private GregorianCalendar fechaNacimiento;
	
	public Persona(String apellido, String nombre, GregorianCalendar fechaNacimiento, Documento documento){
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.fechaNacimiento = fechaNacimiento;
		this.documento = documento;
	}
	
	public String getApellido(){
		return this.apellido;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getFechaNacimiento(){
		return this.fechaNacimiento.get(this.fechaNacimiento.DAY_OF_MONTH) + "/" + 
				this.fechaNacimiento.get(this.fechaNacimiento.MONTH) + "/" + 
				this.fechaNacimiento.get(this.fechaNacimiento.YEAR);
	}
	
	public String getDocumento(){
		return this.documento.getTipoDocumento() + " : " + this.documento.getNroDocumento();
	}
	
	public void setApellido(String apellido){
		this.apellido = apellido;
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
		return apellido +  nombre + "\n" + documento
				+ "\n" + fechaNacimiento ;
	}
	
	
}
