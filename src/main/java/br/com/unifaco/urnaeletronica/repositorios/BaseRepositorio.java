package br.com.unifaco.urnaeletronica.repositorios;

import java.util.ArrayList;

import br.com.unifaco.urnaeletronica.Dominio.Candidato;
import br.com.unifaco.urnaeletronica.interfaces.repositorios.IBaseRepositorio;
 

public class BaseRepositorio<E> implements  IBaseRepositorio<E> {
	public ArrayList<E> bdE;
	
	public BaseRepositorio(ArrayList<E> bdE){
		this.bdE=bdE;
	}
	@Override
	public long salvar(E e) {
		// TODO Auto-generated method stub
		if(this.bdE!=null)
			this.bdE.add(e);	
		return 0;
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
