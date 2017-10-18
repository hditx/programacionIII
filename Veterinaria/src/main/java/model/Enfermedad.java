package model;
import java.io.Serializable;

import javax.persistence.*;
@Entity
@SequenceGenerator(name="enfermedad_sq", sequenceName="enfermedad_sq", initialValue=0, allocationSize=1)
public class Enfermedad implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="enfermedad_sq")
	private long idEnfermedad;
	private String nombreEnfermedad;
	
	public Enfermedad() {}
	
	public Enfermedad(long idEnfermedad, String nombreEnfermedad) {
		super();
		this.idEnfermedad = idEnfermedad;
		this.nombreEnfermedad = nombreEnfermedad;
	}

	public long getIdEnfermedad() {
		return idEnfermedad;
	}

	public void setIdEnfermedad(long idEnfermedad) {
		this.idEnfermedad = idEnfermedad;
	}

	public String getNombreEnfermedad() {
		return nombreEnfermedad;
	}

	public void setNombreEnfermedad(String nombreEnfermedad) {
		this.nombreEnfermedad = nombreEnfermedad;
	}
	
	
}
