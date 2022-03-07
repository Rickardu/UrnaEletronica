package interfaces.servicos;

import java.util.ArrayList;

public interface IBaseServico<Entidade> {
	public void cadastrar(Entidade e);
	public void alterar(Entidade e);
	public void remover(Entidade e);
	public ArrayList<Entidade> buscarTodos();

}
