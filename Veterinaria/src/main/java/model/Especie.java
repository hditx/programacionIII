package model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
@SequenceGenerator(name="especie_sq", sequenceName="especie_sq", initialValue=0, allocationSize=1)
public class Especie implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="especie_sq")
	private long idEspecie;
	private String nombre;
	
	public Especie() {}
	
	public Especie(long idEspecie, String nombre) {
		this.idEspecie = idEspecie;
		this.nombre = nombre;
	}
	public long getIdEspecie() {
		return idEspecie;
	}
	public void setIdEspecie(long idEspecie) {
		this.idEspecie = idEspecie;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
		
}
