package model;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="domicilio_sq", sequenceName="domicilio_sq", initialValue=0, allocationSize=1)

public class Domicilio implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="domicilio_sq")	
	private long idDomicilio;
	
	private String calle;
	private int numero;
	private int piso;
	private String depto;
	
	@ManyToOne
	private Localidad localidad;
	
	public Domicilio() {}
	
	public Domicilio(long idDomicilio, String calle, int numero, int piso, String depto, Localidad localidad) {
		super();
		this.idDomicilio = idDomicilio;
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.depto = depto;
		this.localidad = localidad;
	}

	public long getIdDomicilio() {
		return idDomicilio;
	}

	public void setIdDomicilio(long idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
	
	
	
	
}
