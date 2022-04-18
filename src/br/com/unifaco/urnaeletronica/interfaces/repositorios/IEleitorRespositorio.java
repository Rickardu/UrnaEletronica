package interfaces.repositorios;

import java.sql.SQLException;
import java.util.ArrayList;

import Dominio.Eleitor;

public interface IEleitorRespositorio {	 
	public Eleitor listarPorCpf(String cpf) throws SQLException;	 
	public Eleitor listarPorTitulo(String titulo) throws SQLException;
	

}
