package Dominio;

public class EnderecoEleitoral  {

	private String zona;
	private String secao;
	private boolean situacao;
	private Endereco endereco;
	
	public EnderecoEleitoral() {}
	public EnderecoEleitoral(String pais, String estado, String cidade, String bairro, String cep, String numero,
			String logradouro, String pontoReferencia, String zona,String secao,boolean situacao,Endereco endereco) {
		 
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
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	

}
