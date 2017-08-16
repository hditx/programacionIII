public class Duracion {
	private int idDuracion;
	private String tipoDuracion;
	private String duracion;
	
	public Duracion(int idDuracion, String tipoDuracion, String duracion) {
		this.idDuracion = idDuracion;
		this.tipoDuracion = tipoDuracion;
		this.duracion = duracion;
	}
	
	public Duracion(){
	}

	public int getIdDuracion() {
		return idDuracion;
	}

	public void setIdDuracion(int idDuracion) {
		this.idDuracion = idDuracion;
	}

	public String getTipoDuracion() {
		return tipoDuracion;
	}

	public void setTipoDuracion(String tipoDuracion) {
		this.tipoDuracion = tipoDuracion;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	
	
}
