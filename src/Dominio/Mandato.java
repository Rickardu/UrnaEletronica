package Dominio;

import java.util.ArrayList;
import java.util.Date;

import Dominio.enum_.CargoEnum;

public class Mandato   {
	private CargoEnum cargo;
	private ArrayList<Candidato> candidatos;
	private Date dataInicioReferencia;
	private Date dataFimReferencia;
	private Date dataInicio;
	private Date dataFim;
	private boolean situacao;
	public Mandato(CargoEnum cargo, ArrayList<Candidato> candidatos, Date dataInicioReferencia, Date dataFimReferencia,
			Date dataInicio, Date dataFim, boolean situacao) {
		super();
		this.cargo = cargo;
		this.candidatos = candidatos;
		this.dataInicioReferencia = dataInicioReferencia;
		this.dataFimReferencia = dataFimReferencia;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.situacao = situacao;
	}
	public CargoEnum getCargo() {
		return cargo;
	}
	public void setCargo(CargoEnum cargo) {
		this.cargo = cargo;
	}
	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}
	public void setCandidatos(ArrayList<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
	public Date getDataInicioReferencia() {
		return dataInicioReferencia;
	}
	public void setDataInicioReferencia(Date dataInicioReferencia) {
		this.dataInicioReferencia = dataInicioReferencia;
	}
	public Date getDataFimReferencia() {
		return dataFimReferencia;
	}
	public void setDataFimReferencia(Date dataFimReferencia) {
		this.dataFimReferencia = dataFimReferencia;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
	
	
	

}
