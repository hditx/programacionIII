package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the telefonos database table.
 * 
 */
@Entity
@SequenceGenerator(name="telefono_sq", sequenceName="telefono_sq", initialValue=0, allocationSize=1)
@Table(name="telefonos")
@NamedQuery(name="Telefono.findAll", query="SELECT t FROM Telefono t")
public class Telefono implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="telefono_sq")
	@Column(name="id_telefono")
	private Integer idTelefono;

	@Column(name="numero_telefono")
	private Integer numeroTelefono;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente clientes;

	public Telefono() {
	}

	public Integer getIdTelefono() {
		return this.idTelefono;
	}

	public void setIdTelefono(Integer idTelefono) {
		this.idTelefono = idTelefono;
	}

	public Integer getNumeroTelefono() {
		return this.numeroTelefono;
	}

	public void setNumeroTelefono(Integer numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public Cliente getClientes() {
		return this.clientes;
	}

	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}

}