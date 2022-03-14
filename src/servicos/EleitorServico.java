package servicos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import Dominio.Eleitor;
import Dominio.Endereco;
import Dominio.EnderecoEleitoral;
import Dominio.Secao;
import Dominio.Zona;
import Dominio.enum_.EleitorSituacaoEnum;
import Dominio.enum_.SexoEnum;
import interfaces.servicos.IBaseServico;
import interfaces.servicos.IEleitorServico;
import repositorios.EleitorRepositorio;
import repositorios.EleitorRepositoryJdbc;

public class EleitorServico implements IBaseServico<Eleitor>,IEleitorServico {
	private EleitorRepositoryJdbc eleitorRepositorio;	
	

	public EleitorServico(EleitorRepositoryJdbc eleitorRepositorio) {
		 
		this.eleitorRepositorio = eleitorRepositorio;
	}

	@Override
	public void cadastrar(Eleitor e) throws SQLException  {
		this.eleitorRepositorio.salvar(e);		
	}

	@Override
	public void alterar(Eleitor e) {
		this.eleitorRepositorio.alterar(e);			
	}

	@Override
	public void remover(Eleitor e) {
		this.eleitorRepositorio.remover(e);		
	}

	@Override
	public ArrayList<Eleitor> buscarTodos() throws SQLException {
		return this.eleitorRepositorio.listarTodos();
		
	}

	@Override
	public void imprimirEleitores() throws SQLException {
		 for (Eleitor eleitor : buscarTodos()) {
			 System.out.println(">>>>>>>>>>>>>>>-------------------------------<<<<<<<<<<<<<" );
			 System.out.println(">>>Nome:"+eleitor.getNome());
			 System.out.println(">>>Cpf:"+eleitor.getCpf());
			 System.out.println(">>>Titulo:"+eleitor.getTitulo());
			 System.out.println(">>>Situacao:"+eleitor.getSituacao().getDescricao());
			 System.out.println(">>>Estado:"+eleitor.getEleitoral().getEndereco().getEstado());
			 System.out.println(">>>Cidade:"+eleitor.getEleitoral().getEndereco().getCidade());
			 System.out.println(">>>Zona:"+eleitor.getEleitoral().getZona());
			 System.out.println(">>>Secao:"+eleitor.getEleitoral().getSecao());			 
			 System.out.println(">>>>>>>>>>>>>>>-------------------------------<<<<<<<<<<<<<" );
			
		}
		
	}
	public void metodoPrivado(){
		System.out.println("METODO FORA DA INTEFACE DE SERVICO"); 
	}

	@Override
	public void cadastrar(String nome, Date dataNascimento, Endereco endereco, String cpf, String rg, SexoEnum sexo,
			String numReservista, String titulo, EleitorSituacaoEnum situacao, EnderecoEleitoral eleitoral) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Eleitor eleitorAtual, String nome, Date dataNascimento, Endereco endereco, String cpf,
			String rg, SexoEnum sexo, String numReservista, String titulo, EleitorSituacaoEnum situacao,
			EnderecoEleitoral eleitoral) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Eleitor pesquisarPorCpf(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Eleitor pesquisaPorRg(String rg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Eleitor> pesquisarPorZonaSecao(String zona, String secao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void suspender(String numTitulo) {
		// TODO Auto-generated method stub
		
	}
	
	 

}
