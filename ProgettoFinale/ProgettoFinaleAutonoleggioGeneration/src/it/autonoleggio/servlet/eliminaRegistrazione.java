package it.autonoleggio.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.autonoleggio.database.Database;
import it.autonoleggio.model.Cliente;

/**
 * Servlet implementation class eliminaRegistrazione
 */
@WebServlet("/eliminaRegistrazione")
public class eliminaRegistrazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
    public eliminaRegistrazione() {
        super();
        
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int i = Integer.parseInt(request.getParameter("id"));
		
		Cliente c = Database.getInstance().getCliente(i);
		c.setAttivo(2);
		Database.getInstance().editCliente(c);
		response.sendRedirect("GestioneReg");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
