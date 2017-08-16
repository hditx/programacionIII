import java.util.GregorianCalendar;

public class Visita {
	private int idVisita;
	private Paciente paciente;
	private GregorianCalendar fecha;
	private float pesoPaciente;
	private String observaciones;
	
	public Visita(int idVisita, Paciente paciente, GregorianCalendar fecha, float pesoPaciente, String observaciones) {
		this.idVisita = idVisita;
		this.paciente = paciente;
		this.fecha = fecha;
		this.pesoPaciente = pesoPaciente;
		this.observaciones = observaciones;
	}
	
	public Visita(){
	}
	
	public int getIdVisita() {
		return idVisita;
	}
	
	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public GregorianCalendar getFecha() {
		return fecha;
	}
	
	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}
	
	public String getObservaciones() {
		return observaciones;
	}
	
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
}
