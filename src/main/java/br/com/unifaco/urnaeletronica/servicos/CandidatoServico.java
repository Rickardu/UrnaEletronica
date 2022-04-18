package br.com.unifaco.urnaeletronica.servicos;

import java.util.ArrayList;

import br.com.unifaco.urnaeletronica.Dominio.Candidato;
import br.com.unifaco.urnaeletronica.Dominio.Partido;
import br.com.unifaco.urnaeletronica.interfaces.servicos.IBaseServico;
import br.com.unifaco.urnaeletronica.interfaces.servicos.ICandidatoServico;
import br.com.unifaco.urnaeletronica.repositorios.CandidatoRepositorio;
import br.com.unifaco.urnaeletronica.repositorios.EleitorRepositorio;
 

public class CandidatoServico implements IBaseServico<Candidato>, ICandidatoServico {
	private CandidatoRepositorio candidatoRepositorio ;
	
	
	public CandidatoServico(CandidatoRepositorio candidatoRepositorio) {
		this.candidatoRepositorio=candidatoRepositorio;
	}

	@Override
	public void cadastrar(Candidato e) {
		this.candidatoRepositorio.salvar(e);
		
	}

	@Override
	public void alterar(Candidato e) {
		this.candidatoRepositorio.alterar(e);
		
	}

	@Override
	public void remover(Candidato e) {
		for (Candidato candidato : this.candidatoRepositorio.listarTodos()) {
			if(e.getRegistro().equals(candidato.getRegistro())) {
				this.candidatoRepositorio.remover(e);
				break;
			}
			
		}
		
	}

	@Override
	public ArrayList<Candidato> buscarTodos() {
		 
		return this.candidatoRepositorio.listarTodos();
	}

	@Override
	public void filiarPartido(Candidato candidato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void coligar(Candidato candidato, ArrayList<Partido> partidosColigados) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimirCanditados() {
		for (Candidato candidato : this.candidatoRepositorio.listarTodos()) {
			System.out.println("---------------------------------------");
			System.out.println("\tCanditado");
			System.out.println(">>>Nome:"+candidato.getEleitor().getNome());
			System.out.println(">>>Partido:"+candidato.getPartido().getNomeFantasia());
			System.out.println(">>>Registro:"+candidato.getRegistro());
			System.out.println("---------------------------------------");
			 
			
		}
		
	}

}
