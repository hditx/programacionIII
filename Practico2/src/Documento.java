public class Documento {
	private int idDocumento;
	private String tipoDocumento;
	private int nroDocumento;

	public Documento(int idDocumento, String tipoDocumento, int nroDocumento){
		this.setIdDocumento(idDocumento);
		this.setTipoDocumento(tipoDocumento);
		this.setNroDocumento(nroDocumento);
	}
	
	public int getIdDocumento(){
		return this.idDocumento;
	}
	
	public String getTipoDocumento(){
		return this.tipoDocumento;
	}
	
	public int getNroDocumento(){
		return this.nroDocumento;
	}
	
	public void setIdDocumento(int idDocumento){
		this.idDocumento = idDocumento;
	}
	
	public void setTipoDocumento(String tipoDocumento){
		this.tipoDocumento = tipoDocumento;
	}
	
	public void setNroDocumento(int nroDocumento){
		this.nroDocumento = nroDocumento;
	}

	@Override
	public String toString() {
		return tipoDocumento + ": " + nroDocumento;
	}
	
	
}
