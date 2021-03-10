package it.autonoleggio.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.autonoleggio.database.Database;
import it.autonoleggio.model.Cliente;


@WebServlet("/ModificaCliente")
public class ModificaCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
       
    
    public ModificaCliente() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//ArrayList<Cliente> listaClienti = (ArrayList<Cliente>) Database.getInstance().getClientiAll();
//		Cliente c= (Cliente) request.getSession().getAttribute("cliente");
		//for(Cliente cliente: listaClienti) {
			//if(cliente.equals(c)) {
//				request.setAttribute("cliente", c);
				request.getRequestDispatcher("/jsp/ModificaCliente.jsp").forward(request, response);
			//}
		//}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cliente c= (Cliente) request.getSession().getAttribute("cliente");
		c.setNome(request.getParameter("nome"));
		c.setCognome(request.getParameter("cognome"));
		c.setCf(request.getParameter("codiceFiscale"));
		c.setNPatente(request.getParameter("numeroPatente"));
		c.setDataNascita(request.getParameter("dataDiNascita"));
		c.setMail(request.getParameter("mail"));
		c.setPassword(request.getParameter("password"));
		c.setAttivo(Byte.parseByte(request.getParameter("attivo")));
		// Controllare che id ti ritorna System.out.println(c.getIdCliente());
		int cf=0;
		int pat=0;
		ArrayList<Cliente> listaClienti = (ArrayList<Cliente>) Database.getInstance().getClienteAll();
		
		for(Cliente cliente: listaClienti) {
//			if(!cliente.getCodiceFiscale().equals(c.getCodiceFiscale()) && !cliente.getNumeroPatente().equals(c.getNumeroPatente())) {
//				
//			}else {
			if(!(cliente.getIdCliente()==c.getIdCliente())) {
				if(cliente.getCf().equals(c.getCf())) {
					cf++;
				}
				if(cliente.getNPatente().equals(c.getNPatente())) {
					pat++;
				}
				
			}
		}
//	}
		if(cf==0 && pat==0) {
			Database.getInstance().editCliente(c);
			response.sendRedirect("/autonoleggio/jsp/home.jsp");
		}else {
			request.setAttribute("cf", cf);
			request.setAttribute("pat", pat);
			request.getRequestDispatcher("/jsp/ModificaCliente.jsp").forward(request, response);
		}
		
	}

}
