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
import interfaces.repositorios.IEnderecoRepositorio;
import util.ConnectionFactory;

public class EnderecoRepositoryJdbc implements IBaseRepositorio<Endereco>, IEnderecoRepositorio {

	private Connection conn;

	public EnderecoRepositoryJdbc() throws SQLException {

		this.conn = ConnectionFactory.createConnection();
	}

	@Override
	public long salvar(Endereco e) throws SQLException {
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
			System.out.printf("Erro:%s", e2.getMessage());
			throw new SQLException("Persistencia do Endereço falhou.");
		}
	}

	@Override
	public void alterar(Endereco e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remover(Endereco e) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Endereco> listarTodos() throws SQLException {
		String sql = "SELECT idEndereco,logradouro,numero,bairro,municipio,estado,pais,cep,pontoReferencia FROM urnaeletronica.endereco;";
		PreparedStatement ps = conn.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
		while (rs.next()) {
			Endereco e = new Endereco();
			e.setId(rs.getInt("idEndereco"));
			e.setLogradouro(rs.getString("logradouro"));
			e.setNumero(rs.getString("numero"));
			e.setBairro(rs.getString("bairro"));
			e.setCidade(rs.getString("municipio"));
			e.setEstado(rs.getString("estado"));
			e.setPais(rs.getString("pais"));
			e.setCep(rs.getString("cep"));
			e.setPontoReferencia(rs.getString("pontoReferencia"));

			enderecos.add(e);

		}
		return enderecos;
	}

	@Override
	public Endereco consultarPorId(long id) throws SQLException {
		try {
			String sql = "SELECT idEndereco, logradouro,numero,bairro,municipio,estado,pais,cep,pontoReferencia FROM urnaeletronica.endereco Where idEndereco=?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			rs.next();

			Endereco e = new Endereco();
			
			e.setId(rs.getInt("idEndereco"));
			e.setLogradouro(rs.getString("logradouro"));
			e.setNumero(rs.getString("numero"));
			e.setBairro(rs.getString("bairro"));
			
			e.setCidade(rs.getString("municipio"));
			e.setEstado(rs.getString("estado"));
			e.setPais(rs.getString("pais"));
			e.setCep(rs.getString("cep"));			
			e.setPontoReferencia(rs.getString("pontoReferencia"));
			 
			return e;
		} catch (SQLException e2) {
			System.out.printf("Erro:%s", e2.getMessage());
			throw new SQLException("consulta Por Id do Endereço falhou.");
		}
	}

	@Override
	public ArrayList<Endereco> consultarPorCep(String cep) throws SQLException {
		String sql = "SELECT idEndereco,logradouro,numero,bairro,municipio,estado,pais,cep,pontoReferencia FROM urnaeletronica.endereco Where cep=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, cep);
		ResultSet rs = ps.executeQuery();

		ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
		while (rs.next()) {
			Endereco e = new Endereco();
			e.setId(rs.getInt("idEndereco"));
			e.setLogradouro(rs.getString("logradouro"));
			e.setNumero(rs.getString("numero"));
			e.setBairro(rs.getString("bairro"));
			e.setCidade(rs.getString("municipio"));
			e.setEstado(rs.getString("estado"));
			e.setPais(rs.getString("pais"));
			e.setCep(rs.getString("cep"));
			e.setPontoReferencia(rs.getString("pontoReferencia"));
			enderecos.add(e);
		}
		return enderecos;
	}

}
