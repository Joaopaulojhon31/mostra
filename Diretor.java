package model;

import java.util.Date;

public class Diretor {

	private int masp_diretor;
	private String nome_diretor;
	private int telefone_diretor;
	private String Depto_diretor;
	private String Email_diretor;
	private Utramig utramig;
	private Date Data_alt_cadas_direttor;
	private Utramig cnpj;
	private int status;
	
	
	
	
	public int getStatus() {
		return status;
	}
	public int setStatus(int status) {
		return this.status = status;
	}
	public Date getData_alt_cadas_direttor() {
		return Data_alt_cadas_direttor;
	}
	public void setData_alt_cadas_direttor(Date data_alt_cadas_direttor) {
		Data_alt_cadas_direttor = data_alt_cadas_direttor;
	}
	public Utramig getCnpj() {
		return cnpj;
	}
	public void setCnpj(Utramig cnpj) {
		this.cnpj = cnpj;
	}
	public int getMasp_diretor() {
		return masp_diretor;
	}
	public void setMasp_diretor(int masp_diretor) {
		this.masp_diretor = masp_diretor;
	}
	public String getNome_diretor() {
		return nome_diretor;
	}
	public void setNome_diretor(String nome_diretor) {
		this.nome_diretor = nome_diretor;
	}
	public int getTelefone_diretor() {
		return telefone_diretor;
	}
	public void setTelefone_diretor(int telefone_diretor) {
		this.telefone_diretor = telefone_diretor;
	}
	public String getDepto_diretor() {
		return Depto_diretor;
	}
	public void setDepto_diretor(String depto_diretor) {
		Depto_diretor = depto_diretor;
	}
	public String getEmail_diretor() {
		return Email_diretor;
	}
	public void setEmail_diretor(String email_diretor) {
		Email_diretor = email_diretor;
	}
	public Utramig getUtramig() {
		return utramig;
	}
	public void setUtramig(Utramig utramig) {
		this.utramig = utramig;
	}
	public Date getDataAltCadas() {
		return Data_alt_cadas_direttor;
	}
	public Date setDataAltCadas(Date dataAltCadas) {
		return this.Data_alt_cadas_direttor = dataAltCadas;
	}
	
	
	
	

}
