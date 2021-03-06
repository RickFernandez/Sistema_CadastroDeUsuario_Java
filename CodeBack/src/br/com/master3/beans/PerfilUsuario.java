package br.com.master3.beans;

import java.time.LocalDate;

public class PerfilUsuario {
	private String nivelAcesso;
	private LocalDate ultimoAcesso;
	private String status;
			
	public PerfilUsuario() {
		super();
	}
	public PerfilUsuario(String nivelAcesso, LocalDate ultimoAcesso, String status) {
		super();
		this.nivelAcesso = nivelAcesso;
		this.ultimoAcesso = ultimoAcesso;
		this.status = status;
	}	
	public String getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	public LocalDate getUltimoAcesso() {
		return ultimoAcesso;
	}
	public void setUltimoAcesso(LocalDate ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
