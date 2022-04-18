package br.com.unifaco.urnaeletronica.repositorios;

import java.util.ArrayList;

import br.com.unifaco.urnaeletronica.Dominio.Eleitor;
import br.com.unifaco.urnaeletronica.interfaces.repositorios.IBaseRepositorio;
import br.com.unifaco.urnaeletronica.interfaces.repositorios.IEleitorRespositorio;
 

public class EleitorRepositorio implements IBaseRepositorio<Eleitor>,IEleitorRespositorio {
	private ArrayList<Eleitor> bdEleitores;
	
	public EleitorRepositorio(ArrayList<Eleitor> bdEleitores) {
		this.bdEleitores=bdEleitores;		
	}
	
	@Override
	public Eleitor listarPorCpf(String cpf) {
		// TODO Auto-generated method stub
		Eleitor eleitorResult=null;
		for(int i =0; i<bdEleitores.size();i++) {
			if(bdEleitores.get(0).getCpf().equals(cpf))
				return bdEleitores.get(0);				 
		}
		return null;
	}
	 
	@Override
	public Eleitor listarPorTitulo(String titulo) {
		Eleitor eleitorResult=null;
		for(int i =0; i<bdEleitores.size();i++) {
			if(bdEleitores.get(0).getTitulo().equals(titulo))
				return bdEleitores.get(0);				 
		}
		return null;
	}
	@Override
	public long salvar(Eleitor e) {
		// TODO Auto-generated method stub
		this.bdEleitores.add(e);
		return 0;
		
	}
	@Override
	public void alterar(Eleitor e) {
		// TODO Auto-generated method stub		 
		for(int i =0; i<bdEleitores.size();i++) {
			if(bdEleitores.get(0).getTitulo().equals(e.getTitulo()))
				bdEleitores.set(i, e);
				break;
		}
			
		
	}
	@Override
	public void remover(Eleitor e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayList<Eleitor> listarTodos() {
		// TODO Auto-generated method stub
		return bdEleitores;
	}
	
	 

}
