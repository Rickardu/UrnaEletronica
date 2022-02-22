package Dominio;

import java.util.Date;

public class Partido {
	private String nome;
	private String sigla;
	private Date dataCriacao;
	private Date dataFechamento;
	private boolean Status;
	private EnderecoEleitoral eleitoral;
	
	public Partido(String nome, String sigla, Date dataCriacao, Date dataFechamento, boolean status,
			EnderecoEleitoral eleitoral) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.dataCriacao = dataCriacao;
		this.dataFechamento = dataFechamento;
		Status = status;
		this.eleitoral = eleitoral;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Date getDataFechamento() {
		return dataFechamento;
	}
	public void setDataFechamento(Date dataFechamento) {
		this.dataFechamento = dataFechamento;
	}
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	public EnderecoEleitoral getEleitoral() {
		return eleitoral;
	}
	public void setEleitoral(EnderecoEleitoral eleitoral) {
		this.eleitoral = eleitoral;
	}
	
	

	
	

}
