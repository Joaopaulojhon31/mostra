package model;

import java.sql.Date;

public class Curso {

	private int cod;
	private Utramig cnpj;
	private String nome;
	private String descCurso;
	private Date dataAltCadas;
	private Aluno aluno;

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public Utramig getCnpj() {
		return cnpj;
	}

	public void setCnpj(Utramig cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescCurso() {
		return descCurso;
	}

	public void setDescCurso(String descCurso) {
		this.descCurso = descCurso;
	}

	public Date getDataAltCadas() {
		return dataAltCadas;
	}

	public Date setDataAltCadas(Date dataAltCadas) {
		return this.dataAltCadas = dataAltCadas;
	}



}
