package br.com.master3.beans;

public class Cidade {
	private int id;
	private String cidade;
	private String estado;
	private String siglaEstado;
	private String pais;
	private String siglaPais;
	public int getId() {
		return id;
	}
	
	
	
	public Cidade(int id, String cidade, String estado, String siglaEstado, String pais, String siglaPais) {
		super();
		this.id = id;
		this.cidade = cidade;
		this.estado = estado;
		this.siglaEstado = siglaEstado;
		this.pais = pais;
		this.siglaPais = siglaPais;
	}


	public Cidade() {
		super();
	}


	public void setBasico(String cidade, String estado) {
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public String getBasico( ) {
		return cidade + "\n" + estado;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}
	
	
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	public String getSiglaPais() {
		return siglaPais;
	}
	
	public void setSiglaPais(String siglaPais) {
		this.siglaPais = siglaPais;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
