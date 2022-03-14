package Dominio;

import Dominio.enum_.EnderecoEleitoralEnum;

public class EnderecoEleitoral  extends BaseEntidade {

	private String zona;
	private String secao;
	private EnderecoEleitoralEnum situacao;
	private Endereco endereco;
	
	public EnderecoEleitoral() {}
	public EnderecoEleitoral(String pais, String estado, String cidade, String bairro, String cep, String numero,
			String logradouro, String pontoReferencia, String zona,String secao,EnderecoEleitoralEnum situacao,Endereco endereco) {
		 
		this.zona=zona;
		this.secao=secao;
		this.situacao=situacao;
		this.endereco =endereco;
		// TODO Auto-generated constructor stub
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getSecao() {
		return secao;
	}
	public void setSecao(String secao) {
		this.secao = secao;
	}
	public EnderecoEleitoralEnum getSituacao() {
		return situacao;
	}
	public void setSituacao(EnderecoEleitoralEnum situacao) {
		this.situacao = situacao;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	

}
