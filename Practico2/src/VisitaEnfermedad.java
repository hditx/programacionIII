import java.util.GregorianCalendar;

public class VisitaEnfermedad extends Visita{
	private int idVisitaEnfermedad;
	private Enfermedad enfermedad;
	private Medicamento medicamente;
	
	public VisitaEnfermedad(int idVisita, Paciente paciente, GregorianCalendar fecha, float pesoPaciente,
			String observaciones, int idVisitaEnfermedad, Enfermedad enfermedad, Medicamento medicamento) {
		super(idVisita, paciente, fecha, pesoPaciente, observaciones);
		this.idVisitaEnfermedad = idVisitaEnfermedad;
		this.enfermedad = enfermedad;
		this.medicamente = medicamento;
	}
	public VisitaEnfermedad(){
		super();
	}

	public int getIdVisitaEnfermedad() {
		return idVisitaEnfermedad;
	}
	public void setIdVisitaEnfermedad(int idVisitaEnfermedad) {
		this.idVisitaEnfermedad = idVisitaEnfermedad;
	}
	
	
}
