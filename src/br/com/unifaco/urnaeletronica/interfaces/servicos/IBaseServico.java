package interfaces.servicos;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IBaseServico<Entidade> {
	public void cadastrar(Entidade e) throws SQLException, Exception;
	public void alterar(Entidade e) throws SQLException, Exception;
	public void remover(Entidade e) throws SQLException, Exception;
	public ArrayList<Entidade> buscarTodos() throws SQLException, Exception;

}
