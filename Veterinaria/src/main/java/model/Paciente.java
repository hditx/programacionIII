package model;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;
import javax.persistence.*;

@Entity
@SequenceGenerator(name="paciente_sq", sequenceName="paciente_sq", initialValue=0, allocationSize=1)
public class Paciente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="paciente_sq")
	private long idPaciente;
	private String alias;
	
	@ManyToOne()
	private Raza raza;
	private String colorPelo;
	private LocalDate fechaNacimiento;
	
	@ManyToOne
	private Cliente duenio;
	private double pesoActual;
	@OneToMany()
	private List<Visita> visitas;
	@OneToMany()
	private List<VacunaColocada> vacunas;
	@OneToMany()
	private List<EnfermedadPaciente> enfermedades;
	
	public Paciente() {}
	
	public Paciente(long idPaciente, String alias, Raza raza, String colorPelo, LocalDate fechaNacimiento,
			Cliente duenio, double pesoActual, List<Visita> visitas, List<VacunaColocada> vacunas,
			List<EnfermedadPaciente> enfermedades) {
		this.idPaciente = idPaciente;
		this.alias = alias;
		this.raza = raza;
		this.colorPelo = colorPelo;
		this.fechaNacimiento = fechaNacimiento;
		this.duenio = duenio;
		this.pesoActual = pesoActual;
		this.visitas = visitas;
		this.vacunas = vacunas;
		this.enfermedades = enfermedades;
	}


	public long getIdPaciente() {
		return idPaciente;
	}


	public void setIdPaciente(long idPaciente) {
		this.idPaciente = idPaciente;
	}


	public String getAlias() {
		return alias;
	}


	public void setAlias(String alias) {
		this.alias = alias;
	}


	public Raza getRaza() {
		return raza;
	}


	public void setRaza(Raza raza) {
		this.raza = raza;
	}


	public String getColorPelo() {
		return colorPelo;
	}


	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public Cliente getDuenio() {
		return duenio;
	}


	public void setDuenio(Cliente duenio) {
		this.duenio = duenio;
	}


	public double getPesoActual() {
		return pesoActual;
	}


	public void setPesoActual(double pesoActual) {
		this.pesoActual = pesoActual;
	}


	public List<Visita> getVisita() {
		return visitas;
	}


	public void setVisita(List<Visita> visitas) {
		this.visitas = visitas;
	}


	public List<VacunaColocada> getVacunas() {
		return vacunas;
	}


	public void setVacunas(List<VacunaColocada> vacunas) {
		this.vacunas = vacunas;
	}


	public List<EnfermedadPaciente> getEnfermedades() {
		return enfermedades;
	}


	public void setEnfermedades(List<EnfermedadPaciente> enfermedades) {
		this.enfermedades = enfermedades;
	}
	
	
}
