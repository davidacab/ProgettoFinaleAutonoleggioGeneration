package it.autonoleggio.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.autonoleggio.database.Database;
import it.autonoleggio.model.Marca;

@WebServlet("/aggiungimarca")
public class AggiungiMarca extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public AggiungiMarca() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Database db=new Database();
		String descrizione=request.getParameter("descrizione");
		 
		 	Marca m =new Marca();
		 	m.setDescrizione(descrizione);
		 	
		 	if(Database.getInstance().insertMarca(m)) {
		 		response.sendRedirect("/operazioneriuscita");
		 	}
		 	else {
		 		response.sendRedirect("/operazionefallita");
		 	}
		 	
		 	
		 	
		 	
	}

}
