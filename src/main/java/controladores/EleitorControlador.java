package controladores;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

import br.com.unifaco.urnaeletronica.Dominio.Eleitor;
import br.com.unifaco.urnaeletronica.Dominio.Endereco;
import br.com.unifaco.urnaeletronica.Dominio.EnderecoEleitoral;
import br.com.unifaco.urnaeletronica.Dominio.enum_.EleitorSituacaoEnum;
import br.com.unifaco.urnaeletronica.Dominio.enum_.SexoEnum;
import br.com.unifaco.urnaeletronica.interfaces.servicos.IBaseServico;
import br.com.unifaco.urnaeletronica.interfaces.servicos.IEleitorServico;
import br.com.unifaco.urnaeletronica.repositorios.EleitorRepositorio;
import br.com.unifaco.urnaeletronica.repositorios.EleitorRepositoryJdbc;
import br.com.unifaco.urnaeletronica.servicos.EleitorServico;
 

public class EleitorControlador {
	public IEleitorServico eleitorServico = null;

	public IBaseServico<Eleitor> eleitorServico1 = null;
	public EleitorServico eleitorServico2 = null;

	public EleitorControlador() {

	}

	public void cadastrar(Eleitor eleitor) throws Exception {
		eleitorServico1.cadastrar(eleitor);

	}

	public void cadastrar(String nome, Date dataNascimento, Endereco endereco, String cpf, String rg, SexoEnum sexo,
			String numReservista, String titulo, EleitorSituacaoEnum situacao, EnderecoEleitoral eleitoral)
			throws Exception {
		Eleitor eleitor = new Eleitor(0, nome, dataNascimento, endereco, cpf, rg, sexo, numReservista, titulo, situacao,
				eleitoral, null);
		eleitorServico1.cadastrar(eleitor);

	}

	public  void imprimirEleitores() throws Exception{	    	 
    	eleitorServico.imprimirEleitores(); 	        
	}

	public void remover(String cpf) throws SQLException, Exception {
		Eleitor e =new Eleitor();
		eleitorServico2.remover(e);
	}
	
	public void buscarPorCpf(String cpf) throws SQLException, Exception {
		 
		eleitorServico2.pesquisarPorCpf(cpf);
	}
	 

}
