public class Formulario {
	private int idFormulario;
	private VisitaEnfermedad visitaEnfermedad;
	private VisitaVacunacion visitaVacunacion;
	private VisitaMantenimiento visitaMantenimiento;
	
	public Formulario(VisitaEnfermedad visitaEnfermedad, VisitaVacunacion visitaVacunacion, VisitaMantenimiento visitaMantenimiento){
		this.visitaEnfermedad = visitaEnfermedad;
		this.visitaVacunacion = visitaVacunacion;
		this.visitaMantenimiento = visitaMantenimiento;
	}
}
