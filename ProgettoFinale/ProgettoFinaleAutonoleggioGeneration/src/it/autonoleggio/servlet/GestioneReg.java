package it.autonoleggio.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.autonoleggio.database.Database;
import it.autonoleggio.model.Cliente;

/**
 * Servlet implementation class GestioneReg
 */
@WebServlet("/GestioneReg")
public class GestioneReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       List <Cliente> listaCli;
       HttpSession session;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestioneReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session=request.getSession();
		listaCli = Database.getInstance().getClientiNonAttivi();
		//request.setAttribute("lista", listaCli);
		session.setAttribute("lista", listaCli);
		request.getRequestDispatcher("/gestisciRegistrazione.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
