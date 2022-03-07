package interfaces.servicos;

import java.util.ArrayList;
import java.util.Date;

import Dominio.Candidato;
import Dominio.Eleitor;
import Dominio.Endereco;
import Dominio.EnderecoEleitoral;
import Dominio.Secao;
import Dominio.Zona;
import Dominio.enum_.SexoEnum;

public interface IEleitorServico {
	public void cadastrar(String nome, Date dataNascimento, Endereco endereco, String cpf, String rg, SexoEnum sexo,
			String numReservista, String titulo, boolean situacao, Zona zona, Secao secao,
			EnderecoEleitoral eleitoral);
	public void alterar(Eleitor eleitorAtual, String nome, Date dataNascimento, Endereco endereco, String cpf, String rg, SexoEnum sexo,
			String numReservista, String titulo, boolean situacao, Zona zona, Secao secao,
			EnderecoEleitoral eleitoral);
	
	public Eleitor pesquisarPorCpf(String cpf);
	public Eleitor pesquisaPorRg(String rg);
	public ArrayList<Eleitor> pesquisarPorZonaSecao(String zona, String secao);
	public void suspender(String numTitulo);
	
 
	
	

}
