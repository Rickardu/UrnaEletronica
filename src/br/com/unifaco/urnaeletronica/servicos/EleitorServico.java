package servicos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import Dominio.Eleitor;
import Dominio.Endereco;
import Dominio.EnderecoEleitoral;
import Dominio.Secao;
import Dominio.Zona;
import Dominio.Exceptions.EleitorException;
import Dominio.enum_.EleitorExceptionEnum;
import Dominio.enum_.EleitorSituacaoEnum;
import Dominio.enum_.PessoaFisicaException;
import Dominio.enum_.SexoEnum;
import interfaces.servicos.IBaseServico;
import interfaces.servicos.IEleitorServico;
import repositorios.EleitorRepositorio;
import repositorios.EleitorRepositoryJdbc;

public class EleitorServico implements IBaseServico<Eleitor>, IEleitorServico {
	private EleitorRepositoryJdbc eleitorRepositorio;

	public EleitorServico() throws SQLException {

		this.eleitorRepositorio = new EleitorRepositoryJdbc();
	}

	@Override
	public void cadastrar(Eleitor e) throws SQLException, Exception {
		try {
			if (e != null)
				throw new EleitorException(EleitorExceptionEnum.EleitorInvalido.toString());

			if (e.getCpf() == null || e.getCpf().isBlank() || e.getCpf().isEmpty() || e.getCpf().length() != 11)
				throw new EleitorException(PessoaFisicaException.CpfInvalido.toString());

			if (e.getTitulo().isBlank() || e.getTitulo().isEmpty() || e.getTitulo() == null
					|| e.getTitulo().length() > 5)
				throw new EleitorException(EleitorExceptionEnum.TituloInvalido.toString());

			this.eleitorRepositorio.salvar(e);

		} catch (EleitorException ex) {
			throw new Exception(ex);
		}

	}

	@Override
	public void alterar(Eleitor e) throws SQLException, Exception {
		try {
			if (e != null)
				throw new EleitorException(EleitorExceptionEnum.EleitorInvalido.toString());

			if (e.getCpf() == null || e.getCpf().isBlank() || e.getCpf().isEmpty() || e.getCpf().length() != 11)
				throw new EleitorException(PessoaFisicaException.CpfInvalido.toString());

			if (e.getTitulo().isBlank() || e.getTitulo().isEmpty() || e.getTitulo() == null
					|| e.getTitulo().length() > 5)
				throw new EleitorException(EleitorExceptionEnum.TituloInvalido.toString());

			this.eleitorRepositorio.alterar(e);

		} catch (EleitorException ex) {
			throw new Exception(ex);
		}

	}

	@Override
	public void remover(Eleitor e) throws SQLException, Exception {
		try {
			Eleitor eleitorResultado = this.eleitorRepositorio.listarPorCpf(e.getCpf());
			if (eleitorResultado != null)
				throw new EleitorException(EleitorExceptionEnum.EleitorInvalido.toString());

			eleitorRepositorio.remover(eleitorResultado);
		} catch (EleitorException ex) {
			throw new Exception(ex);
		}

	}

	@Override
	public ArrayList<Eleitor> buscarTodos() throws SQLException, Exception {
		try {
			return this.eleitorRepositorio.listarTodos();
		} catch (Exception ex) {
			throw new Exception(ex);
		}
	}

	@Override
	public void imprimirEleitores() throws SQLException, Exception {
		for (Eleitor eleitor : buscarTodos()) {
			System.out.println(">>>>>>>>>>>>>>>-------------------------------<<<<<<<<<<<<<");
			System.out.println(">>>Nome:" + eleitor.getNome());
			System.out.println(">>>Cpf:" + eleitor.getCpf());
			System.out.println(">>>Titulo:" + eleitor.getTitulo());
			System.out.println(">>>Situacao:" + eleitor.getSituacao().getDescricao());
			System.out.println(">>>Estado:" + eleitor.getEleitoral().getEndereco().getEstado());
			System.out.println(">>>Cidade:" + eleitor.getEleitoral().getEndereco().getCidade());
			System.out.println(">>>Zona:" + eleitor.getEleitoral().getZona());
			System.out.println(">>>Secao:" + eleitor.getEleitoral().getSecao());
			System.out.println(">>>>>>>>>>>>>>>-------------------------------<<<<<<<<<<<<<");

		}

	}

	public void metodoPrivado() {
		System.out.println("METODO FORA DA INTEFACE DE SERVICO");
	}

	@Override
	public void cadastrar(String nome, Date dataNascimento, Endereco endereco, String cpf, String rg, SexoEnum sexo,
			String numReservista, String titulo, EleitorSituacaoEnum situacao, EnderecoEleitoral eleitoral,
			Date dataCadastro) throws SQLException, Exception {
		try {

			if (nome == null || nome.isBlank() || nome.isEmpty() || nome.length() < 8)
				throw new EleitorException(PessoaFisicaException.NomeInvalido.toString());

			if (cpf == null || cpf.isBlank() || cpf.isEmpty() || cpf.length() != 11)
				throw new EleitorException(PessoaFisicaException.CpfInvalido.toString());

			if (titulo.isBlank() || titulo.isEmpty() || titulo == null || titulo.length() > 5)
				throw new EleitorException(EleitorExceptionEnum.TituloInvalido.toString());
			Eleitor e = new Eleitor(0, nome, dataNascimento, endereco, cpf, rg, sexo, numReservista, titulo, situacao,
					eleitoral, dataCadastro);

			this.eleitorRepositorio.salvar(e);

		} catch (EleitorException ex) {
			throw new Exception(ex);
		}

	}

	@Override
	public void alterar(Eleitor eleitorAtual, String nome, Date dataNascimento, Endereco endereco, String cpf,
			String rg, SexoEnum sexo, String numReservista, String titulo, EleitorSituacaoEnum situacao,
			EnderecoEleitoral eleitoral) throws SQLException, Exception {

		try {

			if (nome == null || nome.isBlank() || nome.isEmpty() || nome.length() < 8)
				throw new EleitorException(PessoaFisicaException.NomeInvalido.toString());

			if (cpf == null || cpf.isBlank() || cpf.isEmpty() || cpf.length() != 11)
				throw new EleitorException(PessoaFisicaException.CpfInvalido.toString());

			if (titulo.isBlank() || titulo.isEmpty() || titulo == null || titulo.length() > 5)
				throw new EleitorException(EleitorExceptionEnum.TituloInvalido.toString());

			Eleitor eleitorResultado = eleitorRepositorio.listarPorCpf(cpf);
			if (eleitorResultado != null) {
				eleitorResultado.setDataNascimento(dataNascimento);
				eleitorResultado.setEndereco(endereco);
				eleitorResultado.setEnderecoEleitoral(eleitoral);
				eleitorResultado.setNome(nome);
				eleitorResultado.setNumReservista(numReservista);
				eleitorResultado.setRg(rg);
				eleitorResultado.setSexo(sexo);
				eleitorResultado.setSituacao(situacao);
				eleitorRepositorio.alterar(eleitorResultado);
			}

		} catch (EleitorException ex) {
			throw new Exception(ex);
		}
	}

	@Override
	public Eleitor pesquisarPorCpf(String cpf) throws SQLException, Exception {

		try {

			if (cpf == null || cpf.isBlank() || cpf.isEmpty() || cpf.length() != 11)
				throw new EleitorException(PessoaFisicaException.CpfInvalido.toString());
			
			Eleitor eleitorResultado = eleitorRepositorio.listarPorCpf(cpf);
			return eleitorResultado;

		} catch (EleitorException ex) {
			throw new Exception(ex);
		}
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
