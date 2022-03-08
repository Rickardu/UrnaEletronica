package interfaces.repositorios;

import java.util.ArrayList;

import Dominio.Candidato;
import Dominio.Partido;

public interface ICandidatoRepositorio {
	
	public void removerColigacao(Candidato candidato, ArrayList<Partido> partido );

}
