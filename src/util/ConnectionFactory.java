package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory  {
	public static Connection createConnection(String url,String user,String password)   {
		Connection conexao = null;
		try {			
		
		/*String url = "jdbc:mysql://192.168.0.240:3306/urnaeletronica"; //Nome da base de dados
		String user = "root"; //nome do usu�rio do MySQL
		String password = "root"; //senha do MySQL*/
		System.out.println("url"+url);
		System.out.println("user"+user);
		System.out.println("password"+password);
		conexao = DriverManager.getConnection(url, user, password);
		
		} catch (SQLException e) {
			System.out.printf("Erro ao conectar ao Banco de Dados %s",e.getMessage());
		}
		finally {
			return conexao;
		}
		  
	}
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
