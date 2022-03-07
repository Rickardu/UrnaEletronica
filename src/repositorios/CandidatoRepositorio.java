package repositorios;

import java.util.ArrayList;

import interfaces.repositorios.IBaseRepositorio;
import Dominio.Candidato;
import Dominio.Eleitor;
public class CandidatoRepositorio extends BaseRepositorio<Candidato>    {
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
			if(bdCandidatos.get(0).getCpf().equals(e.getCpf()))
				bdCandidatos.set(i, e);
				break;
		}
		
	}

	@Override
	public void remover(Candidato e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Candidato> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
