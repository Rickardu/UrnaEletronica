package Dominio;

import java.util.ArrayList;
import java.util.Date;

import Dominio.enum_.CandidaturaEnum;
import Dominio.enum_.SexoEnum;

public class Candidato    {
	 
	private String registro;
	private String numero;
	private Eleitor eleitor;
	private String cargo;
	private Eleicao eleicao;
	private  Partido partido;
	private ArrayList<Partido> coligacao;
	private int quantidadeVotos;
	private CandidaturaEnum situacao; 
 
	public Candidato(String registro, String numero, Eleitor eleitor, String cargo, Eleicao eleicao, Partido partido,
			ArrayList<Partido> coligacao, int quantidadeVotos, CandidaturaEnum situacao) {		 
		this.registro = registro;
		this.numero = numero;
		this.eleitor = eleitor;
		this.cargo = cargo;
		this.eleicao = eleicao;
		this.partido = partido;
		this.coligacao = coligacao;
		this.quantidadeVotos = quantidadeVotos;
		this.situacao = situacao;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	 
	public CandidaturaEnum isSituacao() {
		return situacao;
	}
	public void setSituacao(CandidaturaEnum situacao) {
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

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Eleitor getEleitor() {
		return eleitor;
	}

	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}

	public CandidaturaEnum getSituacao() {
		return situacao;
	}
	
	
}
