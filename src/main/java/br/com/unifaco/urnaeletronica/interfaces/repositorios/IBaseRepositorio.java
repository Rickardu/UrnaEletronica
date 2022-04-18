package br.com.unifaco.urnaeletronica.interfaces.repositorios;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.unifaco.urnaeletronica.Dominio.Eleitor;

public interface IBaseRepositorio<Entidade> {

	public long salvar(Entidade e) throws SQLException;
	public void alterar(Entidade e) throws SQLException;
	public void remover(Entidade e) throws SQLException;	 
	public ArrayList<Entidade> listarTodos() throws SQLException;
	 
}
