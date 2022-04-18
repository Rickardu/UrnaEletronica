package br.com.unifaco.urnaeletronica.interfaces.servicos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import br.com.unifaco.urnaeletronica.Dominio.Candidato;
import br.com.unifaco.urnaeletronica.Dominio.Eleitor;
import br.com.unifaco.urnaeletronica.Dominio.Endereco;
import br.com.unifaco.urnaeletronica.Dominio.EnderecoEleitoral;
import br.com.unifaco.urnaeletronica.Dominio.Secao;
import br.com.unifaco.urnaeletronica.Dominio.Zona;
import br.com.unifaco.urnaeletronica.Dominio.enum_.EleitorSituacaoEnum;
import br.com.unifaco.urnaeletronica.Dominio.enum_.SexoEnum;

public interface IEleitorServico {
	
	public void cadastrar(String nome, Date dataNascimento, Endereco endereco, String cpf, String rg, SexoEnum sexo,
			String numReservista, String titulo, EleitorSituacaoEnum situacao,
			EnderecoEleitoral eleitoral,Date dataCadastro) throws SQLException, Exception;
	 

	public void alterar(Eleitor eleitorAtual, String nome, 
			Date dataNascimento, Endereco endereco, String cpf,
			String rg, SexoEnum sexo, String numReservista, String titulo, 
			EleitorSituacaoEnum situacao,
			EnderecoEleitoral eleitoral) throws SQLException, Exception;

	public Eleitor pesquisarPorCpf(String cpf) throws SQLException, Exception ;

	public Eleitor pesquisaPorRg(String rg);

	public ArrayList<Eleitor> pesquisarPorZonaSecao(String zona, String secao);

	public void suspender(String numTitulo);
	public void imprimirEleitores() throws SQLException, Exception;


	 

}
