package model;
import java.util.*;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name="cliente_sq", sequenceName="cliente_sq", initialValue=0, allocationSize=1)

public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente_sq")
	private long idCliente;
	
	private String apellidoFamilia;
	@ManyToOne
	private Domicilio domicilio;
	private String nroCuenta;
	private String telefono;
	
	@OneToMany(mappedBy="duenio")
	private List<Paciente> listaMascota;
	
	public Cliente() {
	}
	
	public Cliente(long idCliente, String apellidoFamilia, Domicilio domicilio, String nroCuenta, String telefono,
			List<Paciente> listaMascota) {
		this.idCliente = idCliente;
		this.apellidoFamilia = apellidoFamilia;
		this.domicilio = domicilio;
		this.nroCuenta = nroCuenta;
		this.telefono = telefono;
		this.listaMascota = listaMascota;
	}
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public String getApellidoFamilia() {
		return apellidoFamilia;
	}
	public void setApellidoFamilia(String apellidoFamilia) {
		this.apellidoFamilia = apellidoFamilia;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	public String getNroCuenta() {
		return nroCuenta;
	}
	public void setNroCuenta(String nroCuenta) {
		this.nroCuenta = nroCuenta;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public List<Paciente> getListaMascota() {
		return listaMascota;
	}
	public void setListaMascota(List<Paciente> listaMascota) {
		this.listaMascota = listaMascota;
	}
	
	
	
	
}
