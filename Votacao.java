package model;

import java.sql.Date;

public class Votacao {
	private Curso idCurso;
	private Date dataVotacao;
	private int codCurso;
	private Curso nome;
	private String nomeVotante;
	private double porcent;
	private double total;
	
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getNomeVotante() {
		return nomeVotante;
	}
	public void setNomeVotante(String nomeVotante) {
		this.nomeVotante = nomeVotante;
	}
	
	

	public double getPorcent() {
		return porcent;
	}
	public void setPorcent(double porcent) {
		this.porcent = porcent;
	}
	public Curso getNome() {
		return nome;
	}
	public void setNome(Curso nome) {
		this.nome = nome;
	}

	public Curso getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Curso idCurso) {
		this.idCurso = idCurso;
	}
	public int getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}

	
	public Date getDataVotacao() {
		return dataVotacao;
	}
	public Date setDataVotacao(Date dataVotacao) {
		return this.dataVotacao = dataVotacao;
	}
	public void setTotal(boolean b) {
		// TODO Auto-generated method stub
		
	}
	

}
