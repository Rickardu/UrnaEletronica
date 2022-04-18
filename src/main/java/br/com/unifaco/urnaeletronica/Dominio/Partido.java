package br.com.unifaco.urnaeletronica.Dominio;

import java.util.ArrayList;
import java.util.Date;

import br.com.unifaco.urnaeletronica.Dominio.enum_.PartidoEnum;

public class Partido extends PessoaJuridica {
	 
	private String registro;
	private String sigla;
	private Date dataCriacao;
	private Date dataFechamento;
	private PartidoEnum Status;
	private Eleitor presidenteNacional;
	private ArrayList<Eleitor> presidentesEstaduais;	 
	
	
	public Partido(String razaoSocial, String nomeFantasia, Endereco endereco,String cnpj) {
		super(razaoSocial, nomeFantasia, endereco, cnpj);
	}
	
	public Partido(String razaoSocial, String nomeFantasia, Endereco endereco,String cnpj, String sigla, Date dataCriacao,
			Date dataFechamento, PartidoEnum status, String registro,Eleitor presidenteNacional,ArrayList<Eleitor> presidentesEstaduais) {
		super(razaoSocial, nomeFantasia, endereco,cnpj);
		this.sigla = sigla;
		this.dataCriacao = dataCriacao;
		this.dataFechamento = dataFechamento;
		Status = status;
		this.presidenteNacional=presidenteNacional;
		this.presidentesEstaduais=presidentesEstaduais;
		this.registro=registro;
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
	public PartidoEnum getStatus() {
		return Status;
	}
	public void setStatus(PartidoEnum status) {
		Status = status;
	}
	 

	public String getRegistro() {
		return registro;
	}


	public void setRegistro(String registro) {
		this.registro = registro;
	}


	public Eleitor getPresidenteNacional() {
		return presidenteNacional;
	}


	public void setPresidenteNacional(Eleitor presidenteNacional) {
		this.presidenteNacional = presidenteNacional;
	}


	public ArrayList<Eleitor> getPresidentesEstaduais() {
		return presidentesEstaduais;
	}


	public void setPresidentesEstaduais(ArrayList<Eleitor> presidentesEstaduais) {
		this.presidentesEstaduais = presidentesEstaduais;
	}
	
	
	
	

	
	

}
