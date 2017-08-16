public class Medicamento {
	private int idMedicamento;
	private float docis;
	private Periodo periodoAdministracion;
	private String nombre;
	
	public Medicamento(int idMedicamento, float docis, String nombre, Periodo periodoAdministracion) {
		this.idMedicamento = idMedicamento;
		this.docis = docis;
		this.nombre = nombre;
		this.periodoAdministracion = periodoAdministracion;
	}
	
	public Medicamento(){
	}
	
	public int getIdMedicamento() {
		return idMedicamento;
	}
	public void setIdMedicamento(int idMedicamento) {
		this.idMedicamento = idMedicamento;
	}
	public float getDocis() {
		return docis;
	}
	public void setDocis(float docis) {
		this.docis = docis;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
