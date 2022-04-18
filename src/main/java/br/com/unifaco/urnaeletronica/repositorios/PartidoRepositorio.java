package br.com.unifaco.urnaeletronica.repositorios;

import java.util.ArrayList;

import br.com.unifaco.urnaeletronica.Dominio.Eleitor;
import br.com.unifaco.urnaeletronica.Dominio.Partido;
import br.com.unifaco.urnaeletronica.Dominio.enum_.PartidoEnum;
import br.com.unifaco.urnaeletronica.interfaces.repositorios.IPartidoRepositorio;

public class PartidoRepositorio extends BaseRepositorio<Partido> implements IPartidoRepositorio{
	 
 

	public PartidoRepositorio(ArrayList<Partido> bdE) {
		super(bdE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Partido listarPorRegistro(Partido partido) {
		for (Partido partidob : bdE) {
			if(partido.getRegistro().equals(partidob.getRegistro())) {
				return partidob;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Partido> listarPorEstado(String estado) {
		ArrayList<Partido> partidos=new ArrayList<Partido>();
		for (Partido partidob : bdE) {
			if(partidob.getEndereco().getEstado().equals(estado)) {
				partidos.add(partidob);
			}
		}
		return partidos;
	}

	@Override
	public ArrayList<Partido> listarPorSituacao(PartidoEnum situacao) {		 
		ArrayList<Partido> partidos=new ArrayList<Partido>();
		for (Partido partidob : bdE) {
			if(partidob.getStatus()==situacao) {
				partidos.add(partidob);
			}
		}
		return partidos;
	}
}
