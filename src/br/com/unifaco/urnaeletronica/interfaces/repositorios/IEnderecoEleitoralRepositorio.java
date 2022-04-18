package interfaces.repositorios;

import java.sql.SQLException;

import Dominio.EnderecoEleitoral;

public interface IEnderecoEleitoralRepositorio {
	public EnderecoEleitoral consultarPorId(long id) throws SQLException;
}
