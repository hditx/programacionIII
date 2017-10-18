package model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
@Entity
@SequenceGenerator(name="raza_sq", sequenceName="raza_sq", initialValue=0, allocationSize=1)
public class Raza implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="raza_sq")
	private long idRaza;
	private String nombre;
	@ManyToOne
	private Especie especie;
	
	public Raza() {}
	
	public Raza(long idRaza, String nombre, Especie especie) {
		this.idRaza = idRaza;
		this.nombre = nombre;
		this.especie = especie;
	}

	public long getIdRaza() {
		return idRaza;
	}

	public void setIdRaza(long idRaza) {
		this.idRaza = idRaza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}
	
	
}
