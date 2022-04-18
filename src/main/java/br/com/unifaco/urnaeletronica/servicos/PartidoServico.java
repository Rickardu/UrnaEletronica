package br.com.unifaco.urnaeletronica.servicos;

import java.text.ParseException;
import java.util.ArrayList;

import br.com.unifaco.urnaeletronica.Dominio.Partido;
import br.com.unifaco.urnaeletronica.Dominio.enum_.PartidoEnum;
import br.com.unifaco.urnaeletronica.interfaces.servicos.IBaseServico;
import br.com.unifaco.urnaeletronica.interfaces.servicos.IPartidoServico;
import br.com.unifaco.urnaeletronica.repositorios.EleitorRepositorio;
import br.com.unifaco.urnaeletronica.repositorios.PartidoRepositorio;
import br.com.unifaco.urnaeletronica.util.DatetimeExtensions;
 

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
	public void imprimirTodos() throws Exception {
		for (Partido partido : this.partidoRepositorio.listarTodos())
			try {
				{
					System.out.println(">>>>>>>>>>>>>>>>>>---***** PARTIDO *****---<<<<<<<<<<<<<<<<<<<<<<");
					 
					System.out.println(">>>Nome:"+partido.getNomeFantasia());
					System.out.println(">>>Sigla:"+partido.getSigla());
					System.out.println(">>>Registro:"+partido.getRegistro());
					System.out.println(">>>Data de Criacao:"+DatetimeExtensions.toString(partido.getDataCriacao()) );
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
	}

	 

}
