package interfaces.repositorios;

import java.util.ArrayList;

import Dominio.Candidato;
import Dominio.Partido;
import Dominio.enum_.PartidoEnum;

public interface IPartidoRepositorio {
	public Partido listarPorRegistro(Partido partido);
	public ArrayList<Partido> listarPorEstado(String estado);
	public ArrayList<Partido> listarPorSituacao(PartidoEnum situacao);
 

}
