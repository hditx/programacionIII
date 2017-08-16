import java.util.ArrayList;
import java.util.GregorianCalendar;

public class VisitaVacunacion extends Visita{
	private int idVisitaVacunacion;
	private Medicamento vacuna;
	private ArrayList<VacunaPrevista> vacunasColocadas;
	
	public VisitaVacunacion(int idVisita, Paciente paciente, GregorianCalendar fecha, float pesoPaciente,
			String observaciones, int idVisitaVacunacion, Medicamento vacuna) {
		super(idVisita, paciente, fecha, pesoPaciente, observaciones);
		this.idVisitaVacunacion = idVisitaVacunacion;
		this.vacuna = vacuna;
		this.vacunasColocadas = new ArrayList<VacunaPrevista>();
	}

	public VisitaVacunacion(){
		super();
	}

	public int getIdVisitaVacunacion() {
		return idVisitaVacunacion;
	}

	public void setIdVisitaVacunacion(int idVisitaVacunacion) {
		this.idVisitaVacunacion = idVisitaVacunacion;
	}
	
	
	
}
