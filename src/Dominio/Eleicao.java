package Dominio;

import java.util.ArrayList;

public class Eleicao {
	int ano;
	ArrayList<Candidato> candidatos;
	ArrayList<Eleitor> eleitores;
	ArrayList<Zona> zonas;	
	ArrayList<Secao> secoes;
	ArrayList<Urna> urnas;
	ArrayList<Voto> votos;
	int mes;
	int dia;
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}
	public void setCandidatos(ArrayList<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
	public ArrayList<Eleitor> getEleitores() {
		return eleitores;
	}
	public void setEleitores(ArrayList<Eleitor> eleitores) {
		this.eleitores = eleitores;
	}
	public ArrayList<Zona> getZonas() {
		return zonas;
	}
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	public ArrayList<Secao> getSecoes() {
		return secoes;
	}
	public void setSecoes(ArrayList<Secao> secoes) {
		this.secoes = secoes;
	}
	public ArrayList<Urna> getUrnas() {
		return urnas;
	}
	public void setUrnas(ArrayList<Urna> urnas) {
		this.urnas = urnas;
	}
	public ArrayList<Voto> getVotos() {
		return votos;
	}
	public void setVotos(ArrayList<Voto> votos) {
		this.votos = votos;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	

}
