package controladores;

import java.text.ParseException;

import Dominio.Eleitor;
import Dominio.Partido;
import interfaces.servicos.IBaseServico;
import interfaces.servicos.IEleitorServico;
import interfaces.servicos.IPartidoServico;
import repositorios.EleitorRepositorio;
import repositorios.PartidoRepositorio;
import servicos.EleitorServico;
import servicos.PartidoServico;

public class PartidoControlador {
	public IPartidoServico  partidoServico=null;
	public IBaseServico<Partido>  baseServico=null;
 
	
	
	  public PartidoControlador(PartidoRepositorio partidoRepositorio ) {
		 
		this.partidoServico = new PartidoServico(partidoRepositorio);
		this.baseServico = new PartidoServico(partidoRepositorio);
	}


	public  void cadastrar(Partido partido ){	    	 
		this.baseServico.cadastrar(partido); 
	    	  
	    	
    }
	public  void imprimirPartidos() throws ParseException{	    	 
		partidoServico.imprimirTodos(); 	        
	}
	
	 

}
