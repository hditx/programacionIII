package model;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import java.io.Serializable;
import java.time.LocalDate;
@Entity
@SequenceGenerator(name="vacuna_colocada_sq", sequenceName="vacuna_colocada_sq", initialValue=0, allocationSize=1)
public class VacunaColocada implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="vacuna_colocada_sq")
	private long idVacuna;
	private LocalDate fechaColocacion;
	@ManyToOne()
	private Enfermedad enfermedad;
	
	public VacunaColocada() {}
	
	public VacunaColocada(long idVacuna, LocalDate fechaColocacion, Enfermedad enfermedad) {
		super();
		this.idVacuna = idVacuna;
		this.fechaColocacion = fechaColocacion;
		this.enfermedad = enfermedad;
	}

	public long getIdVacuna() {
		return idVacuna;
	}

	public void setIdVacuna(long idVacuna) {
		this.idVacuna = idVacuna;
	}

	public LocalDate getFechaColocacion() {
		return fechaColocacion;
	}

	public void setFechaColocacion(LocalDate fechaColocacion) {
		this.fechaColocacion = fechaColocacion;
	}

	public Enfermedad getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	
}
