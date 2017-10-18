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
@SequenceGenerator(name="medicacion_sq", sequenceName="medicacion_sq", initialValue=0, allocationSize=1)
public class Medicacion implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="medicacion_sq")
	private long idMedicacion;
	private String dosis;
	@ManyToOne
	private Medicamento medicamento;
	private int intervalo;
	private String periodo;
	
	public Medicacion() {}
	
	public Medicacion(long idMedicacion, String dosis, Medicamento medicamento, int intervalo, String periodo) {
		super();
		this.idMedicacion = idMedicacion;
		this.dosis = dosis;
		this.medicamento = medicamento;
		this.intervalo = intervalo;
		this.periodo = periodo;
	}

	public long getIdMedicacion() {
		return idMedicacion;
	}

	public void setIdMedicacion(long idMedicacion) {
		this.idMedicacion = idMedicacion;
	}

	public String getDosis() {
		return dosis;
	}

	public void setDosis(String dosis) {
		this.dosis = dosis;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public int getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	
}
