package it.autonoleggio.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.autonoleggio.database.Database;
import it.autonoleggio.model.Cliente;

@WebServlet("/accettaregistrazione")
public class accettaRegistrazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List <Cliente> listaClienti;
     HttpSession session;


	public accettaRegistrazione() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int i = Integer.parseInt(request.getParameter("id"));
		
		Cliente c = Database.getInstance().getCliente(i);
		c.setAttivo(1);
		Database.getInstance().editCliente(c);
		response.sendRedirect("GestioneReg");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int i = Integer.parseInt(request.getParameter("id"));
		session=request.getSession();
		Cliente c = (Cliente) session.getAttribute("cc");
		listaClienti=(List<Cliente>) session.getAttribute("lista");
		c.setAttivo(1);
		Database.getInstance().editCliente(c);
		listaClienti.set(i,c);
		session.setAttribute("lista", listaClienti);
		request.getRequestDispatcher("/jsp/gestisciRegistrazione.jsp").forward(request, response);
	}

}
