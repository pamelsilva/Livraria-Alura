package br.com.alura.livraria.teste;

//import java.time.LocalDate;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.time.LocalDate;
//import java.sql.Date;
import java.util.List;
//import com.mysql.jdbc.PreparedStatement;
import br.com.alura.livraria.dao.AutoresDao;
import br.com.alura.livraria.modelo.Autores;


public class TesteselectCadastro {

	public static void main(String[] args) {
		try {
		String url ="jdbc:mysql://localhost:3306/livraria";
		String usuario = "root";
		String senha = "root";
				
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		AutoresDao dao = new AutoresDao(conexao);

		List<Autores> cadastros = dao.listar();
		for (Autores autores : cadastros) {
			System.out.println(autores);
		}
	} catch (Exception e) {
		System.out.println("Ocorreu um erro!");
	}
}

}


