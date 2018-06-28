package model;

import java.sql.Date;

public class Usuario {
	private int codMatriculaAdm;

	private String login;
	private String senha;
	private Date dataCadastro;
	private int codAdm;
	private Date DataAlt;
	private int id;
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodMatriculaAdm() {
		return codMatriculaAdm;
	}
	public void setCodMatriculaAdm(int codMatriculaAdm) {
		this.codMatriculaAdm = codMatriculaAdm;
	}
	public Date getDataAlt() {
		return DataAlt;
	}
	public Date setDataAlt(Date dataAlt) {
		return DataAlt = dataAlt;
	}
	public int getCodAdm() {
		return codAdm;
	}
	public void setCodAdm(int codAdm) {
		this.codAdm = codAdm;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public Date setDataCadastro(Date string) {
		return this.dataCadastro = string;
	}
	
	

	
	
	
}
