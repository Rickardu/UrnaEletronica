package Dominio;

public class PessoaJuridica {
	 
	private String razaoSocial;
	private String nomeFantasia;
	private Endereco endereco;
	private String cnpj;	
	
	public PessoaJuridica(String razaoSocial, String nomeFantasia, Endereco endereco,String cnpj) {	 
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.endereco = endereco;
		this.cnpj=cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

}
