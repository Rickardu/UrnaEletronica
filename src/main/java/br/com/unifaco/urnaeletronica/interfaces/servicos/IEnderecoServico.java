package br.com.unifaco.urnaeletronica.interfaces.servicos;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.unifaco.urnaeletronica.Dominio.Endereco; 

public interface IEnderecoServico {
	public Endereco consultarPorId(long id);
	public ArrayList<Endereco> consultarPorCep(String cep);
}
