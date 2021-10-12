package br.com.alura.livraria.dao;

import java.sql.Connection;
import java.sql.Date;
//import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import com.mysql.jdbc.PreparedStatement;
import br.com.alura.livraria.modelo.Autores;

public class AutoresDao {
	
	private Connection conexao;
	public AutoresDao(Connection conexao) {
		this.conexao = conexao;
	}


public void salvar (Autores autores) {
	try { 
       String Sql="insert into cadastros (nome,email,curriculo,data) values(?,?,?,?)";
	   PreparedStatement ps = (PreparedStatement) conexao.prepareStatement(Sql);
	   ps.setString(1,autores.getNome());
	   ps.setString(2,autores.getEmail());
	   ps.setString(3,autores.getCurriculo());			
	   ps.setDate(4,Date.valueOf(autores.getData()));

       ps.execute();
	} catch (Exception e) {
		throw new RuntimeException(e);
	}
}

public List<Autores>listar(){
	try {
		String sql = "select * from cadastros";
		java.sql.PreparedStatement ps = conexao.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<Autores> cadastros = new ArrayList<>();
		
		while (rs.next()) {
			Autores autores = new Autores(
					rs.getString("nome"), 
					rs.getString("email"),
					rs.getString("curriculo"),
					rs.getDate("data").toLocalDate());			
					cadastros.add(autores);
		}
		
		return cadastros;
	} catch (Exception e) {
		throw new RuntimeException(e);
	}
}

}


			
		
	