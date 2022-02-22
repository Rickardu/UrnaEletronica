package Dominio;

public class EnderecoEleitoral extends Endereco{

	private Zona zona;
	private Secao secao;
	private boolean situacao;
	public EnderecoEleitoral(String pais, String estado, String cidade, String bairro, String cep, String numero,
			String logradouro, String pontoReferencia, Zona zona,Secao secao,boolean situacao) {
		super(pais, estado, cidade, bairro, cep, numero, logradouro, pontoReferencia);
		
		this.zona=zona;
		this.secao=secao;
		this.situacao=situacao;
		// TODO Auto-generated constructor stub
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public Secao getSecao() {
		return secao;
	}
	public void setSecao(Secao secao) {
		this.secao = secao;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
	
	

}
