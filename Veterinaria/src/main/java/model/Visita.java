package model;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import java.io.Serializable;
import java.time.LocalDate;
@Entity
@SequenceGenerator(name="visita_sq", sequenceName="visita_sq", initialValue=0, allocationSize=1)
public class Visita implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="visita_sq")
	private long idVisita;
	private LocalDate fechaVisita;
	@ManyToOne
	private MotivoVisita motivoVisita;
	private double pesoVisita;
	
	public Visita() {}
	
	public Visita(long idVisita, LocalDate fechaVisita, MotivoVisita motivoVisita, double pesoVisita) {
		super();
		this.idVisita = idVisita;
		this.fechaVisita = fechaVisita;
		this.motivoVisita = motivoVisita;
		this.pesoVisita = pesoVisita;
	}

	public long getIdVisita() {
		return idVisita;
	}

	public void setIdVisita(long idVisita) {
		this.idVisita = idVisita;
	}

	public LocalDate getFechaVisita() {
		return fechaVisita;
	}

	public void setFechaVisita(LocalDate fechaVisita) {
		this.fechaVisita = fechaVisita;
	}

	public MotivoVisita getMotivoVisita() {
		return motivoVisita;
	}

	public void setMotivoVisita(MotivoVisita motivoVisita) {
		this.motivoVisita = motivoVisita;
	}

	public double getPesoVisita() {
		return pesoVisita;
	}

	public void setPesoVisita(double pesoVisita) {
		this.pesoVisita = pesoVisita;
	}
	
	
}
