package controladores;

import java.sql.SQLException;
import java.text.ParseException;

import br.com.unifaco.urnaeletronica.Dominio.Eleitor;
import br.com.unifaco.urnaeletronica.Dominio.Partido;
import br.com.unifaco.urnaeletronica.interfaces.servicos.IBaseServico;
import br.com.unifaco.urnaeletronica.interfaces.servicos.IEleitorServico;
import br.com.unifaco.urnaeletronica.interfaces.servicos.IPartidoServico;
import br.com.unifaco.urnaeletronica.repositorios.EleitorRepositorio;
import br.com.unifaco.urnaeletronica.repositorios.PartidoRepositorio;
import br.com.unifaco.urnaeletronica.servicos.EleitorServico;
import br.com.unifaco.urnaeletronica.servicos.PartidoServico;
 

public class PartidoControlador {
	public IPartidoServico  partidoServico=null;
	public IBaseServico<Partido>  baseServico=null;
 
	
	
	  public PartidoControlador(PartidoRepositorio partidoRepositorio ) {
		 
		this.partidoServico = new PartidoServico(partidoRepositorio);
		this.baseServico = new PartidoServico(partidoRepositorio);
	}


	public  void cadastrar(Partido partido ) throws Exception{	    	 
		this.baseServico.cadastrar(partido); 
	    	  
	    	
    }
	public  void imprimirPartidos() throws Exception{	    	 
		partidoServico.imprimirTodos(); 	        
	}
	
	 

}
