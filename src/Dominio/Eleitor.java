package Dominio;

import Dominio.enum_.SexoEnum;

public class Eleitor extends Cidadao {

	private String titulo;
	private boolean situacao;
	private EnderecoEleitoral eleitoral;

	public Eleitor(String nome, String dataNascimento, Endereco endereco, String cpf, String rg, SexoEnum sexo,
			String numReservista, String titulo, boolean situacao, Zona zona, Secao secao,
			EnderecoEleitoral eleitoral) {
		super(nome, dataNascimento, endereco, cpf, rg, sexo, numReservista);
		this.titulo = titulo;
		this.situacao = situacao;
		this.eleitoral = eleitoral;
	}

	public Eleitor(String nome, String dataNascimento, Endereco endereco, String cpf, String rg, SexoEnum sexo,
			String titulo, boolean situacao, Zona zona, Secao secao,
			EnderecoEleitoral eleitoral) {
		super(nome, dataNascimento, endereco, cpf, rg, sexo);
		this.titulo = titulo;
		this.situacao = situacao;
		this.eleitoral = eleitoral;
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

	public EnderecoEleitoral getEleitoral() {
		return eleitoral;
	}

	public void setEleitoral(EnderecoEleitoral eleitoral) {
		this.eleitoral = eleitoral;
	}
	

}
