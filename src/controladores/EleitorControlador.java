package controladores;

import java.sql.SQLException;
import java.text.ParseException;

import Dominio.Eleitor;
import interfaces.servicos.IBaseServico;
import interfaces.servicos.IEleitorServico;
import repositorios.EleitorRepositorio;
import repositorios.EleitorRepositoryJdbc;
import servicos.EleitorServico;

public class EleitorControlador {
	public IEleitorServico  eleitorServico=null;
	
	public IBaseServico<Eleitor>  eleitorServico1=null;
	public EleitorServico  eleitorServico2=null;
	
	
	  public EleitorControlador(EleitorRepositoryJdbc eleitoresRepositorio) {
		 
		this.eleitorServico = new EleitorServico(eleitoresRepositorio);
		this.eleitorServico1= new EleitorServico(eleitoresRepositorio);
	}


	public  void cadastrar(Eleitor eleitor ) throws SQLException{	    	 
		eleitorServico1.cadastrar(eleitor); 
	    	  
	    	
    }
	public  void imprimirEleitores() throws SQLException{	    	 
    	eleitorServico.imprimirEleitores(); 	        
	}
	
	/*public  void metodoPrivado(){	    	 
    	//eleitorServico.metodoPrivado(); 	
    	//eleitorServico2.metodoPrivado();
	}*/

}
