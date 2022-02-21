package Dominio;

public class Eleitor {
	String nome;
	String dataNascimento;
	String Endereco;
	String cpf;
	String rg;
	String titulo;
	boolean situacao;
	String Zona;
	String Secao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public String getZona() {
		return Zona;
	}
	public void setZona(String zona) {
		Zona = zona;
	}
	public String getSecao() {
		return Secao;
	}
	public void setSecao(String secao) {
		Secao = secao;
	}
	
}
