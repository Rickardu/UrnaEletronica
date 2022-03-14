package repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Dominio.Eleitor;
import Dominio.Endereco;
import Dominio.EnderecoEleitoral;
import Dominio.enum_.EleitorSituacaoEnum;
import Dominio.enum_.SexoEnum;
import interfaces.repositorios.IBaseRepositorio;
import interfaces.repositorios.IEleitorRespositorio;
import util.ConnectionFactory;

public class EleitorRepositoryJdbc implements IBaseRepositorio<Eleitor>,IEleitorRespositorio {

	private Connection conn;
	private EnderecoRepositoryJdbc enderecoRepositoryJdbc;
	private EnderecoEleitoralRepositoryJdbc enderecoEleitoralRepositoryJdbc;

	public EleitorRepositoryJdbc(EnderecoRepositoryJdbc enderecoRepositoryJdbc,EnderecoEleitoralRepositoryJdbc enderecoEleitoralRepositoryJdbc) throws SQLException {

		this.conn = ConnectionFactory.createConnection();
		this.enderecoRepositoryJdbc=enderecoRepositoryJdbc;
		this.enderecoEleitoralRepositoryJdbc=enderecoEleitoralRepositoryJdbc;
	}
	
	private long salvarEndereco(Endereco e) throws SQLException {
		try {
			
			String sqlEndereco = "INSERT INTO  urnaeletronica.endereco(logradouro,numero,bairro,municipio,estado,pais,cep,pontoReferencia)"
					+ "VALUES(?,?,?,?,?,?,?,?);";

			PreparedStatement ps = conn.prepareStatement(sqlEndereco, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, e.getLogradouro());
			ps.setString(2, e.getNumero());
			ps.setString(3, e.getBairro());
			ps.setString(4, e.getCidade());
			ps.setString(5, e.getEstado());
			ps.setString(6, e.getPais());
			ps.setString(7, e.getCep());
			ps.setString(8, e.getPontoReferencia());
			System.out.println("AQUIsalvarEndereco1");
			int retornoEndereco = ps.executeUpdate();
			System.out.println("AQUIsalvarEndereco2");
			if (retornoEndereco == 0) {
				throw new SQLException("Persistencia do Endereço falhou , ID do endereço não foi gerado.");
			}

			try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
				if (generatedKeys.next()) {
					e.setId(generatedKeys.getLong(1));
					
				} else {
					throw new SQLException("Persistencia do Endereço falhou , ID do endereço não foi gerado.");
				}
			}
			
			return e.getId(); 
		} catch (SQLException e2) {
			System.out.printf("Erro:%s",e2.getMessage());
			throw new SQLException("Persistencia do Endereço falhou.");
		}
	}
	
	private long salvarEnderecoEleitoral(EnderecoEleitoral e) throws SQLException {
		try {
			e.getEndereco().setId(salvarEndereco(e.getEndereco()));
			String sqlEnderecoEleitoral = "INSERT INTO  urnaeletronica.enderecoeleitoral(zona,secao,situacao,idEndereco)"
					+ "VALUES(?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(sqlEnderecoEleitoral, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, e.getZona());
			ps.setString(2, e.getSecao());
			ps.setString(3, e.getSituacao().getDescricao());
			ps.setLong(4, e.getEndereco().getId());
			 
			System.out.println("AQUIsalvarEnderecoEleitoral1");
			int retornoEndereco = ps.executeUpdate();
			System.out.println("AQUIsalvarEnderecoEleitoral2");
			if (retornoEndereco == 0) {
				throw new SQLException("Persistencia do Endereço Eleitoral falhou , ID do endereço Eleitoral não foi gerado.");
			}

			try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
				if (generatedKeys.next()) {
					e.setId(generatedKeys.getLong(1));
					
				} else {
					throw new SQLException("Persistencia do Endereço Eleitoral falhou , ID do endereço Eleitoral não foi gerado.");
				}
			}
			
			return e.getId(); 
		} catch (SQLException e2) {
			System.out.printf("Erro:%s",e2.getMessage());
			throw new SQLException("Persistencia do Endereço falhou.");
		}
	}

	@Override
	public long salvar(Eleitor e) throws SQLException   {

		try {			 
			e.getEndereco().setId(this.enderecoRepositoryJdbc.salvar(e.getEndereco()));
			e.getEleitoral().setId(this.enderecoEleitoralRepositoryJdbc.salvar(e.getEleitoral()));	
			
			String sqlEleitor = "INSERT INTO urnaeletronica.eleitor"
					+ "(titulo,nome,cpf,dataNascimento,rg,sexo,reservista,situacao,idEndereco,idEnderecoEleitoral,dataCadastro)"
					+ "VALUES(?,?,?,?,?,?,?,?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(sqlEleitor, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, e.getTitulo());
			ps.setString(2, e.getNome());
			ps.setString(3, e.getCpf());
			ps.setDate(4, new java.sql.Date(e.getDataNascimento().getTime()));
			ps.setString(5, e.getRg());
			ps.setString(6, e.getSexo().getDescricao());
			ps.setString(7, e.getNumReservista());
			ps.setString(8, e.getSituacao().getDescricao());
			ps.setLong(9, e.getEndereco().getId());
			ps.setLong(10, e.getEleitoral().getId());
			ps.setDate(11, new java.sql.Date(e.getDataCadastro().getTime()));

			// Executa a instrução
			System.out.println("AQUIsalvar1");
			int retornoEleitor = ps.executeUpdate();
			System.out.println("AQUIsalvar2");
			if (retornoEleitor == 0) {
				throw new SQLException("Persistencia do Eleitor falhou , ID do Eleitor não foi gerado.");
			}

			try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
				if (generatedKeys.next()) {
					return generatedKeys.getLong(1);
					
				} else {
					throw new SQLException("Persistencia do Endereço Eleitoral falhou , ID do endereço Eleitoral não foi gerado.");
				}
			}
			
		} catch (SQLException e2) {
			System.out.printf("Erro:%s",e2.getMessage());
			throw new SQLException("Persistencia do Eleitor falhou.");
		}

	}

	@Override
	public void alterar(Eleitor e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remover(Eleitor e) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Eleitor> listarTodos() throws SQLException {
		String sql="SELECT titulo,nome,cpf,dataNascimento,rg,sexo,reservista,situacao,idEndereco,idEnderecoEleitoral,dataCadastro FROM urnaeletronica.eleitor;";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();

		ArrayList<Eleitor> eleitores=new ArrayList<Eleitor>();
		while(rs.next()){
			Eleitor e=new Eleitor();
			
			e.setTitulo(rs.getString("titulo"));
			e.setNome(rs.getString("nome"));
			e.setCpf(rs.getString("cpf"));
			e.setDataNascimento(rs.getDate("dataNascimento"));
			e.setSexo(SexoEnum.getEnum(rs.getString("sexo")));
			e.setNumReservista(rs.getString("reservista"));
			e.setSituacao(EleitorSituacaoEnum.getEnum(rs.getString("situacao")));
			e.setDataCadastro(rs.getDate("dataCadastro"));
			e.setEndereco(this.enderecoRepositoryJdbc.consultarPorId(rs.getLong("idEndereco")));
			e.setEnderecoEleitoral(this.enderecoEleitoralRepositoryJdbc.consultarPorId(rs.getLong("idEnderecoEleitoral")));
			
		 
			eleitores.add(e);
			
			 
		}
		return eleitores;
	}

	@Override
	public Eleitor listarPorCpf(String cpf) throws SQLException {
		String sql="SELECT titulo,nome,cpf,dataNascimento,rg,sexo,reservista,situacao,idEndereco,idEnderecoEleitoral,dataCadastro FROM urnaeletronica.eleitor Where cpf=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, cpf);
		ResultSet rs = ps.executeQuery();
		rs.next(); 
		 
		Eleitor e=new Eleitor();
		e.setTitulo(rs.getString("titulo"));
		e.setNome(rs.getString("nome"));
		e.setCpf(rs.getString("cpf"));
		e.setDataNascimento(rs.getDate("dataNascimento"));
		e.setSexo(SexoEnum.getEnum(rs.getString("sexo")));
		e.setNumReservista(rs.getString("reservista"));
		e.setSituacao(EleitorSituacaoEnum.getEnum(rs.getString("situacao")));
		e.setDataCadastro(rs.getDate("dataCadastro"));
		e.setEndereco(this.enderecoRepositoryJdbc.consultarPorId(rs.getLong("idEndereco")));
		e.setEnderecoEleitoral(this.enderecoEleitoralRepositoryJdbc.consultarPorId(rs.getLong("idEnderecoEleitoral")));
			 
			 
		return e;
	}

	@Override
	public Eleitor listarPorTitulo(String titulo) throws SQLException {
		String sql="SELECT titulo,nome,cpf,dataNascimento,rg,sexo,reservista,situacao,idEndereco,idEnderecoEleitoral,dataCadastro FROM urnaeletronica.eleitor Where titulo=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, titulo);
		ResultSet rs = ps.executeQuery();
		rs.next(); 
		Eleitor e=new Eleitor();
		e.setTitulo(rs.getString("titulo"));
		e.setNome(rs.getString("nome"));
		e.setCpf(rs.getString("cpf"));
		e.setDataNascimento(rs.getDate("dataNascimento"));
		e.setSexo(SexoEnum.getEnum(rs.getString("sexo")));
		e.setNumReservista(rs.getString("reservista"));
		e.setSituacao(EleitorSituacaoEnum.getEnum(rs.getString("situacao")));
		e.setDataCadastro(rs.getDate("dataCadastro"));
		e.setEndereco(this.enderecoRepositoryJdbc.consultarPorId(rs.getLong("idEndereco")));
		e.setEnderecoEleitoral(this.enderecoEleitoralRepositoryJdbc.consultarPorId(rs.getLong("idEnderecoEleitoral")));	 
			 
		return e;
	}

}
