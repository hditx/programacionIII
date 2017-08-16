public class Periodo {
	private int idPeriodo;
	private String tipoPeriodo;
	private Duracion cadaCuanto;
	
	public Periodo(int idPeriodo, String tipoPeriodo, Duracion cadaCuanto) {
		this.idPeriodo = idPeriodo;
		this.tipoPeriodo = tipoPeriodo;
		this.cadaCuanto = cadaCuanto;
	}
	
	public Periodo(){
	}

	public int getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(int idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public String getTipoPeriodo() {
		return tipoPeriodo;
	}

	public void setTipoPeriodo(String tipoPeriodo) {
		this.tipoPeriodo = tipoPeriodo;
	}
	
	
}
