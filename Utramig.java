package model;

import java.math.BigInteger;
import java.sql.Date;

public class Utramig {

	private long cnpj;
	private String nome;
	private int telefone;
	private String email;
	private Diretor maspDiretor;
	private Date dataALtCadas;
	
	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Diretor getMasp_diretor() {
		return maspDiretor;
	}

	public void setMasp_diretor(Diretor masp_diretor) {
		this.maspDiretor = masp_diretor;
	}

	public Date getDataALtCadas() {
		return dataALtCadas;
	}

	public Date setDataALtCadas(Date dataALtCadas) {
		return this.dataALtCadas = dataALtCadas;
	}

	public void setMasp_diretor(int nextInt) {
		// TODO Auto-generated method stub
		
	}

}
