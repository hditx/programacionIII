package model;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.SequenceGenerator;

import java.io.Serializable;
import java.time.LocalDate;
@Entity
@SequenceGenerator(name="enfermedad_paciente_sq", sequenceName="enfermedad_paciente_sq", initialValue=0, allocationSize=1)
public class EnfermedadPaciente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="enfermedad_paciente_sq")
	private long idEnfermedadPaciente;
	
	@ManyToOne
	private Enfermedad enfermedad;
	
	private LocalDate fechaEnfermedad;
	
	@ManyToMany
	@JoinTable(name="medicacion_enfermedad")
	private List<Medicacion> medicacion;
	
	public EnfermedadPaciente() {}
	
	public EnfermedadPaciente(long idEnfermedadPaciente, Enfermedad enfermedad, LocalDate fechaEnfermedad,
			List<Medicacion> medicacion) {
		super();
		this.idEnfermedadPaciente = idEnfermedadPaciente;
		this.enfermedad = enfermedad;
		this.fechaEnfermedad = fechaEnfermedad;
		this.medicacion = medicacion;
	}

	public long getIdEnfermedadPaciente() {
		return idEnfermedadPaciente;
	}

	public void setIdEnfermedadPaciente(long idEnfermedadPaciente) {
		this.idEnfermedadPaciente = idEnfermedadPaciente;
	}

	public Enfermedad getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}

	public LocalDate getFechaEnfermedad() {
		return fechaEnfermedad;
	}

	public void setFechaEnfermedad(LocalDate fechaEnfermedad) {
		this.fechaEnfermedad = fechaEnfermedad;
	}

	public List<Medicacion> getMedicacion() {
		return medicacion;
	}

	public void setMedicacion(List<Medicacion> medicacion) {
		this.medicacion = medicacion;
	}
	
	
}
