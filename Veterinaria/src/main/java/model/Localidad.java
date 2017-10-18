package model;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="localidad_sq", sequenceName="localidad_sq", initialValue=0, allocationSize=1)
public class Localidad implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="localidad_sq")
	private long idLocalidad;
	private String codigoPostal;
	private String nombre;
	
	public Localidad() {}
	
	public Localidad(long idLocalidad, String codigoPostal, String nombre) {
		super();
		this.idLocalidad = idLocalidad;
		this.codigoPostal = codigoPostal;
		this.nombre = nombre;
	}

	public long getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(long idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
