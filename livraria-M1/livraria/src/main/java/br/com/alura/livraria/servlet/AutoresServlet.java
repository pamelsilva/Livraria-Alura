package br.com.alura.livraria.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.alura.livraria.dao.AutoresDao;
import br.com.alura.livraria.modelo.Autores;
import br.com.alura.livraria.factory.ConnectionFactory;


@SuppressWarnings("serial")
@WebServlet("/cadastros")
public class AutoresServlet extends HttpServlet {
	
	private AutoresDao dao;

	public AutoresServlet() {
		Connection conexao = new ConnectionFactory().getConnection();
		this.dao = new AutoresDao(conexao);
			}

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	
		req.setAttribute("cadastros", dao.listar());
		req.getRequestDispatcher("cadastros.jsp").forward(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nome = req.getParameter("nome");
	    String email = req.getParameter("email");
	    String curriculo = req.getParameter("curriculo");
	    LocalDate data = LocalDate.parse(req.getParameter("data"),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
	Autores novo = new Autores (nome,email,curriculo,data);
	dao.salvar(novo);
	resp.sendRedirect("cadastros");
}

}
