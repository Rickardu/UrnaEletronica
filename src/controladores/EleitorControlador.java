package controladores;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

import Dominio.Eleitor;
import Dominio.Endereco;
import Dominio.EnderecoEleitoral;
import Dominio.enum_.EleitorSituacaoEnum;
import Dominio.enum_.SexoEnum;
import interfaces.servicos.IBaseServico;
import interfaces.servicos.IEleitorServico;
import repositorios.EleitorRepositorio;
import repositorios.EleitorRepositoryJdbc;
import servicos.EleitorServico;

public class EleitorControlador {
	public IEleitorServico eleitorServico = null;

	public IBaseServico<Eleitor> eleitorServico1 = null;
	public EleitorServico eleitorServico2 = null;

	public EleitorControlador() throws SQLException {
		eleitorServico2=new EleitorServico();
		eleitorServico1=new EleitorServico();
		eleitorServico = new EleitorServico();

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
		 
		Eleitor resultado = eleitorServico2.pesquisarPorCpf(cpf);
		eleitorServico2.imprimirEleitores(resultado);
	}
	 

}
