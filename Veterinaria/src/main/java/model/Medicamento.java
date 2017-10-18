package model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
@SequenceGenerator(name="medicamento_sq", sequenceName="medicamento_sq", initialValue=0, allocationSize=1)
public class Medicamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="medicamento_sq")
	private long idMedicamento;
	private String codigo;
	private String nombre;

	public Medicamento() {}
	
	public Medicamento(long idMedicamento, String codigo, String nombre) {
		super();
		this.idMedicamento = idMedicamento;
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public long getIdMedicamento() {
		return idMedicamento;
	}

	public void setIdMedicamento(long idMedicamento) {
		this.idMedicamento = idMedicamento;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
