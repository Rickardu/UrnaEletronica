package servicos;

import java.text.ParseException;
import java.util.ArrayList;

import Dominio.Partido;
import Dominio.enum_.PartidoEnum;
import interfaces.servicos.IBaseServico;
import interfaces.servicos.IPartidoServico;
import repositorios.EleitorRepositorio;
import repositorios.PartidoRepositorio;
import util.DatetimeExtensions;

public class PartidoServico implements IBaseServico<Partido>,IPartidoServico{

	private PartidoRepositorio partidoRepositorio;
	
	
	public PartidoServico(PartidoRepositorio partidoRepositorio) {
		this.partidoRepositorio=partidoRepositorio;
	}

	
	@Override
	public void cadastrar(Partido e) {
		this.partidoRepositorio.salvar(e);
		
	}

	@Override
	public void alterar(Partido e) {
		this.partidoRepositorio.alterar(e);
		
	}

	@Override
	public void remover(Partido e) {
		
		for (Partido partido : this.partidoRepositorio.listarTodos()) {
			if(partido.getRegistro()==e.getRegistro()) {
				this.partidoRepositorio.remover(e);
				break;
			}
			
		}
		
		
	}

	@Override
	public ArrayList<Partido> buscarTodos() {
		// TODO Auto-generated method stub
		return this.partidoRepositorio.listarTodos();
	}

	@Override
	public Partido listarPorRegistro(Partido partido) {
		 
		return this.partidoRepositorio.listarPorRegistro(partido);
	}

	@Override
	public ArrayList<Partido> listarPorEstado(String estado) {
	 
		return this.partidoRepositorio.listarPorEstado(estado);
	}

	@Override
	public ArrayList<Partido> listarPorSituacao(PartidoEnum situacao) {
		 
		return this.partidoRepositorio.listarPorSituacao(situacao);
	}


	@Override
	public void imprimirTodos() throws ParseException {
		for (Partido partido : this.partidoRepositorio.listarTodos()) {
			System.out.println(">>>>>>>>>>>>>>>>>>---***** PARTIDO *****---<<<<<<<<<<<<<<<<<<<<<<");
			 
			System.out.println(">>>Nome:"+partido.getNomeFantasia());
			System.out.println(">>>Sigla:"+partido.getSigla());
			System.out.println(">>>Registro:"+partido.getRegistro());
			System.out.println(">>>Data de Criacao:"+DatetimeExtensions.toString(partido.getDataCriacao()) );
			
		} 
		
	}

	 

}
