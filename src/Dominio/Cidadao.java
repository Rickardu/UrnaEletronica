package Dominio;

import Dominio.enum_.SexoEnum;

public class Cidadao {
	private String nome;
	private String dataNascimento;
	private Endereco endereco;
	private String cpf;
	private String rg;
	private SexoEnum sexo;
	private String numReservista;
	
	

	public Cidadao(String nome, String dataNascimento, Endereco endereco, String cpf, String rg, SexoEnum sexo,
			String numReservista) {	
		 
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.cpf = cpf;
		 this.rg = rg;
		this.sexo = sexo;
		this.numReservista = numReservista;
	}
	
	public Cidadao(String nome, String dataNascimento, Endereco endereco, String cpf, String rg, SexoEnum sexo			 ) {		 
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;		 
	}
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
	public SexoEnum getSexo() {
		return sexo;
	}
	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
	}
	public String getNumReservista() {
		return numReservista;
	}
	public void setNumReservista(String numReservista) {
		this.numReservista = numReservista;
	}
	
	
}
