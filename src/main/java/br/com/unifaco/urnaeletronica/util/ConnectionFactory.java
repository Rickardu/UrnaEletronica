package br.com.unifaco.urnaeletronica.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory  {
	public static Connection createConnection()   {
		Connection conexao = null;
		try {
			
		
		String url = "jdbc:mysql://localhost:3306/urnaeletronica"; //Nome da base de dados
		String user = "root"; //nome do usu�rio do MySQL
		String password = "root"; //senha do MySQL

		
		conexao = DriverManager.getConnection(url, user, password);

		
		} catch (SQLException e) {
			System.out.printf("Erro ao conectar ao Banco de Dados %s",e.getMessage());
		}
		finally {
			return conexao;
		}
		  
	}

}
