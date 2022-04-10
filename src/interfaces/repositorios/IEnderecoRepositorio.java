package interfaces.repositorios;

import java.sql.SQLException;
import java.util.ArrayList;

import Dominio.Endereco;

public interface IEnderecoRepositorio {
	public Endereco consultarPorId(long id) throws SQLException;
	public ArrayList<Endereco> consultarPorCep(String cep) throws SQLException;

}
