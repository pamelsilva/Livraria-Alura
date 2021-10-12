package br.com.alura.livraria.factory;
import java.sql.Connection;

import java.sql.DriverManager;

public class ConnectionFactory {
	public Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/livraria";
		String username = "root";
		String password = "root";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
