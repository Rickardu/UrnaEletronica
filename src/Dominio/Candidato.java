package Dominio;

import java.util.ArrayList;

import Dominio.enum_.SexoEnum;

public class Candidato  extends  Eleitor{
	 
	private String cargo;
	private Eleicao eleicao;
	private  Partido partido;
	private ArrayList<Partido> coligacao;
	private int quantidadeVotos;
	private boolean situacao;
	
	 
 
	 
	public Candidato(String nome, String dataNascimento, Endereco endereco, String cpf, String rg, SexoEnum sexo,
			String numReservista, String titulo, boolean situacao, Zona zona, Secao secao, EnderecoEleitoral eleitoral,
			String cargo, Eleicao eleicao, Partido partido, ArrayList<Partido> coligacao, int quantidadeVotos,
			boolean situacao2) {
		super(nome, dataNascimento, endereco, cpf, rg, sexo, numReservista, titulo, situacao, zona, secao, eleitoral);
		this.cargo = cargo;
		this.eleicao = eleicao;
		this.partido = partido;
		this.coligacao = coligacao;
		this.quantidadeVotos = quantidadeVotos;
		situacao = situacao2;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	 
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public Eleicao getEleicao() {
		return eleicao;
	}
	public void setEleicao(Eleicao eleicao) {
		this.eleicao = eleicao;
	}
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	public ArrayList<Partido> getColigacao() {
		return coligacao;
	}
	public void setColigacao(ArrayList<Partido> coligacao) {
		this.coligacao = coligacao;
	}
	public int getQuantidadeVotos() {
		return quantidadeVotos;
	}
	public void setQuantidadeVotos(int quantidadeVotos) {
		this.quantidadeVotos = quantidadeVotos;
	}
	
	
}
