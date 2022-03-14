package interfaces.repositorios;

import java.sql.SQLException;

import Dominio.Endereco;

public interface IEnderecoRepositorio {
	public Endereco consultarPorId(long id) throws SQLException;

}
