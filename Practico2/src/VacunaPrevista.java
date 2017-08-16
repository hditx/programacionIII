import java.util.GregorianCalendar;

public class VacunaPrevista {
	private int idVacunaPrevista;
	private GregorianCalendar fecha;
	private Enfermedad enfermedad;
	
	public VacunaPrevista(int idVacunaPrevista, GregorianCalendar fecha, Enfermedad enfermedad) {
		this.idVacunaPrevista = idVacunaPrevista;
		this.fecha = fecha;
		this.enfermedad = enfermedad;
	}
	
	public VacunaPrevista(){
	}

	public int getIdVacunaPrevista() {
		return idVacunaPrevista;
	}

	public void setIdVacunaPrevista(int idVacunaPrevista) {
		this.idVacunaPrevista = idVacunaPrevista;
	}
	
	
}
