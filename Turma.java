package model;

import java.sql.Date;

public class Turma {
	private int cod;
	private Curso codCurso;
	private String etapaTurma;
	private String turnoTurma;
	private String nomeTurma;
	private String salaTurma;
	private Date dataAltCadas;
	private int porcento;
	private Aluno MatriculaAluno;
	private int status;
	
	
	
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public Curso getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(Curso codCurso) {
		this.codCurso = codCurso;
	}
	public String getEtapaTurma() {
		return etapaTurma;
	}
	public void setEtapaTurma(String etapaTurma) {
		this.etapaTurma = etapaTurma;
	}
	public String getTurnoTurma() {
		return turnoTurma;
	}
	public void setTurnoTurma(String turnoTurma) {
		this.turnoTurma = turnoTurma;
	}
	public String getNomeTurma() {
		return nomeTurma;
	}
	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}
	public String getSalaTurma() {
		return salaTurma;
	}
	public void setSalaTurma(String salaTurma) {
		this.salaTurma = salaTurma;
	}
	public Date getDataAltCadas() {
		return dataAltCadas;
	}
	public Date setDataAltCadas(Date dataAltCadas) {
		return this.dataAltCadas = dataAltCadas;
	}
	public int getPorcento() {
		return porcento;
	}
	public void setPorcento(int porcento) {
		this.porcento = porcento;
	}
	public Aluno getMatriculaAluno() {
		return MatriculaAluno;
	}
	public void setMatriculaAluno(Aluno matriculaAluno) {
		MatriculaAluno = matriculaAluno;
	}
	public int getStatus() {
		return status;
	}
	public int setStatus(int status) {
		return this.status = status;
	}
	
	

}
