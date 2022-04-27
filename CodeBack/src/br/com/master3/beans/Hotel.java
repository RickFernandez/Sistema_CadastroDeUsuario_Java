package br.com.master3.beans;

public class Hotel {
	private int id;
	private Cidade cidade;
	private int classificassao;
	private String valor;
	private String localizacao;
	private String site;
	private String fone;
	private String email;
	private String obs;
	
	
	
	
	
	
	public Hotel(int id, Cidade cidade, int classificassao, String valor, String localizacao, String site, String fone,
			String email, String obs) {
		super();
		this.id = id;
		this.cidade = cidade;
		this.classificassao = classificassao;
		this.valor = valor;
		this.localizacao = localizacao;
		this.site = site;
		this.fone = fone;
		this.email = email;
		this.obs = obs;
	}
	public Hotel() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public int getClassificassao() {
		return classificassao;
	}
	public void setClassificassao(int classificassao) {
		this.classificassao = classificassao;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	
	
	
}	
