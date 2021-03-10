package it.autonoleggio.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.autonoleggio.database.Database;
import it.autonoleggio.model.Tipologia;

@WebServlet("/ModificaTipologia")
public class ModificaTipologia extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;
       
   
    public ModificaTipologia() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session=request.getSession();
		if ((Boolean) session.getAttribute("admin"))
		{		request.getRequestDispatcher("/autonoleggio/JSP/ModificaTipologia.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("/autonoleggio/JSP/Login.jsp").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session=request.getSession();	
		int i= Integer.parseInt(request.getParameter("id"));
		
		Tipologia t= new Tipologia();
		t=Database.getInstance().getTipologia(i);
		t.setPrezzo(Double.parseDouble(request.getParameter("prezzo")));
	}

}
