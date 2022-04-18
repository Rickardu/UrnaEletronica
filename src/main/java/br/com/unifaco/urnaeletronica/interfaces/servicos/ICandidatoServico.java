package br.com.unifaco.urnaeletronica.interfaces.servicos;

import java.util.ArrayList;

import br.com.unifaco.urnaeletronica.Dominio.Candidato;
import br.com.unifaco.urnaeletronica.Dominio.Partido;

public interface ICandidatoServico {
	/*public void cadastrar(Candidato candidato);
	public void alterar(Candidato candidato);
	public void remover(Candidato candidato);
	public ArrayList<Candidato> listarTodos();*/
	public void filiarPartido(Candidato candidato);
	public void coligar(Candidato candidato, ArrayList<Partido> partidosColigados);
	public void imprimirCanditados();
 
}
