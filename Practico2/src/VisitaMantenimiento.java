import java.util.GregorianCalendar;

public class VisitaMantenimiento extends Visita{
	private int idVisitaMantenimiento;
	private Tratamiento tratamiento;
	
	public VisitaMantenimiento(int idVisita, Paciente paciente, GregorianCalendar fecha, float pesoPaciente,
			String observaciones, int idVisitaMantenimiento, Tratamiento tratamiento) {
		super(idVisita, paciente, fecha, pesoPaciente, observaciones);
		this.idVisitaMantenimiento = idVisitaMantenimiento;
		this.tratamiento = tratamiento;
	}
	
	public VisitaMantenimiento(){
		super();
	}
	
	public int getIdVisitaMantenimiento() {
		return idVisitaMantenimiento;
	}
	public void setIdVisitaMantenimiento(int idVisitaMantenimiento) {
		this.idVisitaMantenimiento = idVisitaMantenimiento;
	}
	
	
}
