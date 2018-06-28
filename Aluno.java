package model;

import java.sql.Date;

public class Aluno {

	private int matricula;
	private Grupo codGrupo;
	private Turma codTurma;
	private String nome;
	private String email;
	private Sexo sexoAluno;
	private Date dataAltCadas;
	private int codAluno;
	private int status;
	
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getCodAluno() {
		return codAluno;
	}
	public void setCodAluno(int codAluno) {
		this.codAluno = codAluno;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Grupo getCodGrupo() {
		return codGrupo;
	}
	public void setCodGrupo(Grupo codGrupo) {
		this.codGrupo = codGrupo;
	}
	public Turma getCodTurma() {
		return codTurma;
	}
	public void setCodTurma(Turma codTurma) {
		this.codTurma = codTurma;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Sexo getSexoAluno() {
		return sexoAluno;
	}
	public void setSexoAluno(Sexo sexoAluno) {
		this.sexoAluno = sexoAluno;
	}
	public Date getDataAltCadas() {
		return dataAltCadas;
	}
	public void setDataAltCadas(Date dataAltCadas) {
		this.dataAltCadas = dataAltCadas;
	}

	
}
