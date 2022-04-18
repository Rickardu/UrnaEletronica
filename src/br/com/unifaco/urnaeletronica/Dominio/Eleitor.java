package Dominio;

import java.util.Date;

import Dominio.enum_.EleitorSituacaoEnum;
import Dominio.enum_.SexoEnum;

public class Eleitor extends PessoaFisica {

	private String titulo;
	private EleitorSituacaoEnum situacao;
	private EnderecoEleitoral enderecoEleitoral;
	private Date dataCadastro;
	
	public Eleitor(long id) {
		super(id);
	}
	public Eleitor() {
		
	}
	public Eleitor(long id, String nome, Date dataNascimento, Endereco endereco, String cpf, String rg, SexoEnum sexo,
			String numReservista, String titulo, EleitorSituacaoEnum situacao,
			EnderecoEleitoral eleitoral,Date dataCadastro) {
		super(id,nome, dataNascimento, endereco, cpf, rg, sexo, numReservista);
		this.titulo = titulo;
		this.situacao = situacao;
		this.enderecoEleitoral = eleitoral;
		this.dataCadastro=dataCadastro;
	}

	public Eleitor(long id, String nome, Date dataNascimento, Endereco endereco, String cpf, String rg, SexoEnum sexo,
			String titulo, EleitorSituacaoEnum situacao, EnderecoEleitoral eleitoral,Date dataCadastro) {
		super(id,nome, dataNascimento, endereco, cpf, rg, sexo);
		this.titulo = titulo;
		this.situacao = situacao;
		this.enderecoEleitoral = eleitoral;
		this.dataCadastro=dataCadastro;
	}
 

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public EleitorSituacaoEnum getSituacao() {
		return situacao;
	}

	public void setSituacao(EleitorSituacaoEnum situacao) {
		this.situacao = situacao;
	}

	public EnderecoEleitoral getEleitoral() {
		return enderecoEleitoral;
	}

	 
	public EnderecoEleitoral getEnderecoEleitoral() {
		return enderecoEleitoral;
	}
	public void setEnderecoEleitoral(EnderecoEleitoral enderecoEleitoral) {
		this.enderecoEleitoral = enderecoEleitoral;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
	

}
