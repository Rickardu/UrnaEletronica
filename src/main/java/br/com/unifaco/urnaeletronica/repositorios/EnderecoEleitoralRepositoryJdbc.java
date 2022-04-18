package br.com.unifaco.urnaeletronica.repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.com.unifaco.urnaeletronica.Dominio.Eleitor;
import br.com.unifaco.urnaeletronica.Dominio.Endereco;
import br.com.unifaco.urnaeletronica.Dominio.EnderecoEleitoral;
import br.com.unifaco.urnaeletronica.Dominio.enum_.EleitorSituacaoEnum;
import br.com.unifaco.urnaeletronica.Dominio.enum_.EnderecoEleitoralEnum;
import br.com.unifaco.urnaeletronica.Dominio.enum_.SexoEnum;
import br.com.unifaco.urnaeletronica.interfaces.repositorios.IBaseRepositorio;
import br.com.unifaco.urnaeletronica.interfaces.repositorios.IEnderecoEleitoralRepositorio;
import br.com.unifaco.urnaeletronica.util.ConnectionFactory;
 

public class EnderecoEleitoralRepositoryJdbc implements IBaseRepositorio<EnderecoEleitoral>,IEnderecoEleitoralRepositorio {

	private Connection conn;
	private EnderecoRepositoryJdbc enderecoRepositoryJdbc;
	public EnderecoEleitoralRepositoryJdbc() throws SQLException {
		this.enderecoRepositoryJdbc=new EnderecoRepositoryJdbc();
		this.conn = ConnectionFactory.createConnection();
	}
	
	 
	public long salvar(EnderecoEleitoral e) throws SQLException {
		try {
			e.getEndereco().setId(this.enderecoRepositoryJdbc.salvar(e.getEndereco()));
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
	public ArrayList<EnderecoEleitoral> listarTodos() throws SQLException {
		String sql="SELECT idEnderecoEleitoral,zona,secao,situacao,idEndereco FROM urnaeletronica.enderecoeleitoral;";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();

		ArrayList<EnderecoEleitoral> enderecos=new ArrayList<EnderecoEleitoral>();
		while(rs.next()){
			EnderecoEleitoral e=new EnderecoEleitoral();
			e.setId(rs.getInt("idEnderecoEleitoral"));
			e.setZona(rs.getString("zona"));
			e.setSecao(rs.getString("secao"));
			e.setSituacao(EnderecoEleitoralEnum.getEnum(rs.getString("situacao")));
			e.setEndereco(this.enderecoRepositoryJdbc.consultarPorId(rs.getLong("idEndereco")));			 
			enderecos.add(e);			 
		}
		return enderecos;
	}
	@Override
	public EnderecoEleitoral consultarPorId(long id) throws SQLException {
		String sql="SELECT idEnderecoEleitoral,zona,secao,situacao,idEndereco  FROM urnaeletronica.enderecoeleitoral Where idEnderecoEleitoral=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setLong(1, id);
		ResultSet rs = ps.executeQuery();		 
		rs.next(); 
		EnderecoEleitoral e=new EnderecoEleitoral();
		e.setId(rs.getInt("idEnderecoEleitoral"));
		e.setZona(rs.getString("zona"));
		e.setSecao(rs.getString("secao"));
		e.setSituacao(EnderecoEleitoralEnum.getEnum(rs.getString("situacao")));
		e.setEndereco(this.enderecoRepositoryJdbc.consultarPorId(rs.getLong("idEndereco")));				 
		return e;
	}


	 


	@Override
	public void alterar(EnderecoEleitoral e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remover(EnderecoEleitoral e) {
		// TODO Auto-generated method stub
		
	}

}
