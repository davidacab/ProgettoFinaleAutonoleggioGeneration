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


@WebServlet("/AggiungiTipologia")
public class AggiungiTipologia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       HttpSession session;
    
    public AggiungiTipologia() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		session=request.getSession();
		if ((Boolean) session.getAttribute("admin"))
		{		request.getRequestDispatcher("/autonoleggio/JSP/AggiungiTipologia.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("/autonoleggio/JSP/Login.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String prez=request.getParameter("prezzo");
		String descrizione=request.getParameter("descrizione");
		double prezzo=0;
		
		 try
		 {
			 prezzo=Double.parseDouble(prez);
		 }
		 catch (NumberFormatException e)
		 {
			 e.printStackTrace();
		 }
		
		Tipologia t=new Tipologia();
		t.setPrezzo(prezzo);
		t.setDescrizione(descrizione);
		
		if (Database.getInstance().insertTipologia(t))
		{
			//request.getRequestDispatcher("/Autonoleggio/inserimentoriuscito").forward(request, response);
			response.sendRedirect("/autonoleggio/operazioneriuscita");
		}
		else
		{
			//request.getRequestDispatcher("/Autonoleggio/inserimentofallito").forward(request, response);
			response.sendRedirect("/autonoleggio/operazionefallita");
		}
	}

}
