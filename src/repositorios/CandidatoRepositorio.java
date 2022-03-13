package repositorios;

import java.util.ArrayList;

import interfaces.repositorios.IBaseRepositorio;
import Dominio.Candidato;
import Dominio.Eleitor;
public class CandidatoRepositorio extends BaseRepositorio<Candidato>    {
	
	public CandidatoRepositorio(ArrayList<Candidato> bdE) {
		super(bdE);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Candidato> bdCandidatos;
	@Override
	public void salvar(Candidato e) {
		// TODO Auto-generated method stub
		
		this.bdCandidatos.add(e);	
	}

	@Override
	public void alterar(Candidato e) {
		// TODO Auto-generated method stub
		for(int i =0; i<bdCandidatos.size();i++) {
			if(bdCandidatos.get(0).getRegistro().equals(e.getRegistro()))
				bdCandidatos.set(i, e);
				break;
		}
		
	}

	@Override
	public void remover(Candidato e) {
		bdCandidatos.remove(e);
		
	}

	@Override
	public ArrayList<Candidato> listarTodos() {		 
		return bdCandidatos;
	}

}
