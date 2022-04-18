package br.com.unifaco.urnaeletronica.interfaces.repositorios;

import java.util.ArrayList;

import br.com.unifaco.urnaeletronica.Dominio.Candidato;
import br.com.unifaco.urnaeletronica.Dominio.Partido;
import br.com.unifaco.urnaeletronica.Dominio.enum_.PartidoEnum;

public interface IPartidoRepositorio {
	public Partido listarPorRegistro(Partido partido);
	public ArrayList<Partido> listarPorEstado(String estado);
	public ArrayList<Partido> listarPorSituacao(PartidoEnum situacao);
 

}
