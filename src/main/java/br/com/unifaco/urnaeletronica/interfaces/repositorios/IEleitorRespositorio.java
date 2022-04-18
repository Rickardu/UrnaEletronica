package br.com.unifaco.urnaeletronica.interfaces.repositorios;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.unifaco.urnaeletronica.Dominio.Eleitor;

public interface IEleitorRespositorio {	 
	public Eleitor listarPorCpf(String cpf) throws SQLException;	 
	public Eleitor listarPorTitulo(String titulo) throws SQLException;
	

}
