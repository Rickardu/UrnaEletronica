package controladores;

import java.text.ParseException;

import Dominio.Eleitor;
import interfaces.servicos.IEleitorServico;
import repositorios.EleitorRepositorio;
import servicos.EleitorServico;

public class EleitorControlador {
	public IEleitorServico  eleitorServico=null;
	public EleitorServico  eleitorServico2=null;
	
	
	  public EleitorControlador(EleitorRepositorio eleitorRepositorio ) {
		 
		this.eleitorServico = new EleitorServico(eleitorRepositorio);
	}


	public  void cadastrar(Eleitor eleitor ){	    	 
	    	eleitorServico.cadastrar(eleitor); 
	    	  
	    	
    }
	public  void imprimirEleitores(){	    	 
    	eleitorServico.imprimirEleitores(); 	        
	}
	
	/*public  void metodoPrivado(){	    	 
    	//eleitorServico.metodoPrivado(); 	
    	//eleitorServico2.metodoPrivado();
	}*/

}
