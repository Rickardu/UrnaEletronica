package br.com.unifaco.urnaeletronica.interfaces.repositorios;

import java.sql.SQLException;

import br.com.unifaco.urnaeletronica.Dominio.EnderecoEleitoral;

public interface IEnderecoEleitoralRepositorio {
	public EnderecoEleitoral consultarPorId(long id) throws SQLException;
}
