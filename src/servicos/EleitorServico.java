package servicos;

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

public class EleitorServico implements IBaseServico<Eleitor>,IEleitorServico {
	private EleitorRepositorio eleitorRepositorio;
	
	
	public EleitorServico(EleitorRepositorio eleitorRepositorio) {
		this.eleitorRepositorio=eleitorRepositorio;
	}

	@Override
	public void cadastrar(String nome, Date dataNascimento, Endereco endereco, String cpf, String rg, SexoEnum sexo,
			String numReservista, String titulo, EleitorSituacaoEnum situacao,EnderecoEleitoral eleitoral) {
		// TODO Auto-generated method stub+
		
		Eleitor eleitor=new Eleitor(nome, dataNascimento, endereco, cpf, rg, sexo, titulo, situacao,eleitoral);
		this.eleitorRepositorio.salvar(eleitor);		
	}
 
	@Override
	public void alterar(Eleitor eleitorAtual, String nome, Date dataNascimento, Endereco endereco, String cpf,
			String rg, SexoEnum sexo, String numReservista, String titulo, EleitorSituacaoEnum situacao,
			EnderecoEleitoral eleitoral) {
		Eleitor eleitor=new Eleitor(nome, dataNascimento, endereco, cpf, rg, sexo, titulo, situacao, eleitoral);
		this.eleitorRepositorio.alterar(eleitor);	
	}

	@Override
	public Eleitor pesquisarPorCpf(String cpf) { 		 
		return this.eleitorRepositorio.listarPorCpf(cpf);
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

	@Override
	public void cadastrar(Eleitor e) {
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
	public ArrayList<Eleitor> buscarTodos() {
		return this.eleitorRepositorio.listarTodos();
		
	}

	@Override
	public void imprimirEleitores() {
		 for (Eleitor eleitor : buscarTodos()) {
			 System.out.println(">>>>>>>>>>>>>>>-------------------------------<<<<<<<<<<<<<" );
			 System.out.println(">>>Nome:"+eleitor.getNome());
			 System.out.println(">>>Cpf:"+eleitor.getCpf());
			 System.out.println(">>>Titulo:"+eleitor.getTitulo());
			 System.out.println(">>>Situacao:"+eleitor.getSituacao().getDescricao());
			 System.out.println(">>>"+eleitor.getEleitoral().getEndereco().getEstado());
			 System.out.println(">>>"+eleitor.getEleitoral().getEndereco().getCidade());
			 System.out.println(">>>"+eleitor.getEleitoral().getZona());
			 System.out.println(">>>"+eleitor.getEleitoral().getSecao());			 
			 System.out.println(">>>>>>>>>>>>>>>-------------------------------<<<<<<<<<<<<<" );
			
		}
		
	}
	public void metodoPrivado(){
		System.out.println("METODO FORA DA INTEFACE DE SERVICO"); 
	}
	
	 

}
