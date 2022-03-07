package repositorios;

import java.util.ArrayList;

import Dominio.Candidato;
import interfaces.repositorios.IBaseRepositorio;

public class BaseRepositorio<E> implements  IBaseRepositorio<E> {
	private ArrayList<E> bdE;
	@Override
	public void salvar(E e) {
		// TODO Auto-generated method stub
		if(this.bdE!=null)
			this.bdE.add(e);	
	}

	@Override
	public void alterar(E e) {
		// TODO Auto-generated method stub
		 
	}

	@Override
	public void remover(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<E> listarTodos() {
		// TODO Auto-generated method stub
		return this.bdE;
	}

}
