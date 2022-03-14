package interfaces.repositorios;

import java.sql.SQLException;
import java.util.ArrayList;

import Dominio.Eleitor;

public interface IBaseRepositorio<Entidade> {

	public long salvar(Entidade e) throws SQLException;
	public void alterar(Entidade e);
	public void remover(Entidade e);	 
	public ArrayList<Entidade> listarTodos() throws SQLException;
	 
}
