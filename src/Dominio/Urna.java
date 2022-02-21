package Dominio;

import java.util.Date;

public class Urna {
	public String identificador;
	public Date dataHabilitacao;
	public boolean status;
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public Date getDataHabilitacao() {
		return dataHabilitacao;
	}
	public void setDataHabilitacao(Date dataHabilitacao) {
		this.dataHabilitacao = dataHabilitacao;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	//TESTE
	
	

}
