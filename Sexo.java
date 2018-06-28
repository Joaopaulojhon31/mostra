package model;

import java.util.Date;

import javax.xml.crypto.Data;

public class Sexo {
	private int codigo;
	private String descricao;
	private Date data_alteracao_cadastro;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getData_alteracao_cadastro() {
		return data_alteracao_cadastro;
	}
	public void setData_alteracao_cadastro(Date data_alteracao_cadastro) {
		this.data_alteracao_cadastro = data_alteracao_cadastro;
	}

}
