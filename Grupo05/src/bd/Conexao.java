package bd;


import java.sql.Connection;

import java.sql.DriverManager;

public class Conexao {

	//conexao
	public static Connection conectar() {
		
		Connection conexao = null; 
		
		try {
			
			String url = "jdbc:mysql://localhost/dbgrupo05";
			String user = "root";
			String password = "";
			
			Class.forName("com.mysql.jdbc.Driver");
			conexao = DriverManager.getConnection(url, user, password);
			
			System.out.println("Conectado");
			
		} catch (Exception e) {
			System.out.println("Falha: "+e.getMessage());
		}
		
		return conexao;
	}
}