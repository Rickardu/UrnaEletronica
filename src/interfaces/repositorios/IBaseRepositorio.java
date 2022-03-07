package interfaces.repositorios;

import java.util.ArrayList;

import Dominio.Eleitor;

public interface IBaseRepositorio<Entidade> {

	public void salvar(Entidade e);
	public void alterar(Entidade e);
	public void remover(Entidade e);	 
	public ArrayList<Entidade> listarTodos();
	 
}
