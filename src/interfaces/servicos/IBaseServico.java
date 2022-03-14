package interfaces.servicos;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IBaseServico<Entidade> {
	public void cadastrar(Entidade e) throws SQLException;
	public void alterar(Entidade e);
	public void remover(Entidade e);
	public ArrayList<Entidade> buscarTodos() throws SQLException;

}
