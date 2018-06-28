package model;

import java.sql.Date;

public class Mostra {

	private int codMostra;
	private Curso codCurso;
	private String nome;
	private String Desc;
	private String CoordProjetoMostra;
	private int DataMostra;
	private String semestreMostra;
	private Date dataAltCadas;
	private Grupo CodGrupo;

	public int getCodMostra() {
		return codMostra;
	}

	public void setCodMostra(int codMostra) {
		this.codMostra = codMostra;
	}

	public Curso getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(Curso codCurso) {
		this.codCurso = codCurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesc() {
		return Desc;
	}

	public void setDesc(String desc) {
		Desc = desc;
	}

	public String getCoordProjetoMostra() {
		return CoordProjetoMostra;
	}

	public void setCoordProjetoMostra(String coordProjetoMostra) {
		CoordProjetoMostra = coordProjetoMostra;
	}

	public int getDataMostra() {
		return DataMostra;
	}

	public void setDataMostra(int dataMostra) {
		DataMostra = dataMostra;
	}

	public String getSemestreMostra() {
		return semestreMostra;
	}

	public void setSemestreMostra(String semestreMostra) {
		this.semestreMostra = semestreMostra;
	}

	public Date getDataAltCadas() {
		return dataAltCadas;
	}

	public void setDataAltCadas(Date dataAltCadas) {
		this.dataAltCadas = dataAltCadas;
	}

	public Grupo getCodGrupo() {
		return CodGrupo;
	}

	public void setCodGrupo(Grupo codGrupo) {
		CodGrupo = codGrupo;
	}

}
