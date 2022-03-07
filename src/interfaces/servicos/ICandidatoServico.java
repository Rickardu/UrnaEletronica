package interfaces.servicos;

import java.util.ArrayList;

import Dominio.Candidato;
import Dominio.Partido;

public interface ICandidatoServico {
	/*public void cadastrar(Candidato candidato);
	public void alterar(Candidato candidato);
	public void remover(Candidato candidato);
	public ArrayList<Candidato> listarTodos();*/
	public void filiarPartido(Candidato candidato);
	public void coligar(Candidato candidato, ArrayList<Partido> partidosColigados);
 
}
