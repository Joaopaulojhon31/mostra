package model;

import java.sql.Date;

public class Grupo {

	private int codgrupo;
	private Mostra codmostra;
	private String desc;
	private String liderProjeto;
	private Date dataAltCadas;
	private Aluno codAluno;
	private Aluno aluno;
	private int status;
	
	
	
	
	

	public int getStatus() {
		return status;
	}
	public int setStatus(int status) {
		return this.status = status;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Aluno getCodAluno() {
		return codAluno;
	}
	public void setCodAluno(Aluno codAluno) {
		this.codAluno = codAluno;
	}
	public int getCodgrupo() {
		return codgrupo;
	}
	public void setCodgrupo(int codgrupo) {
		this.codgrupo = codgrupo;
	}
	public Mostra getCodmostra() {
		return codmostra;
	}
	public void setCodmostra(Mostra codmostra) {
		this.codmostra = codmostra;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String i) {
		this.desc = i;
	}
	public String getLiderProjeto() {
		return liderProjeto;
	}
	public void setLiderProjeto(String i) {
		this.liderProjeto = i;
	}
	public Date getDataAltCadas() {
		return dataAltCadas;
	}
	public Date setDataAltCadas(Date date) {
		return this.dataAltCadas = date;
	}



}
