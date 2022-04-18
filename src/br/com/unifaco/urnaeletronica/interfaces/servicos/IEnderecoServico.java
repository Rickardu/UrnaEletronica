package interfaces.servicos;

import java.sql.SQLException;
import java.util.ArrayList;

import Dominio.Endereco; 

public interface IEnderecoServico {
	public Endereco consultarPorId(long id);
	public ArrayList<Endereco> consultarPorCep(String cep);
}
