package model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
@SequenceGenerator(name="motivo_visita_sq", sequenceName="motivo_visita_sq", initialValue=0, allocationSize=1)
public class MotivoVisita implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="motivo_visita_sq")
	private long idMotivoVisita;
	private String descripcion;
	
	public MotivoVisita() {}
	
	public MotivoVisita(long idMotivoVisita, String descripcion) {
		super();
		this.idMotivoVisita = idMotivoVisita;
		this.descripcion = descripcion;
	}

	public long getIdMotivoVisita() {
		return idMotivoVisita;
	}

	public void setIdMotivoVisita(long idMotivoVisita) {
		this.idMotivoVisita = idMotivoVisita;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
