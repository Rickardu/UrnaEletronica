package interfaces.servicos;

import java.text.ParseException;
import java.util.ArrayList;

import Dominio.Partido;
import Dominio.enum_.PartidoEnum;

public interface IPartidoServico {
	public Partido listarPorRegistro(Partido partido);
	public ArrayList<Partido> listarPorEstado(String estado);
	public ArrayList<Partido> listarPorSituacao(PartidoEnum situacao);
	public void imprimirTodos() throws ParseException;

}
