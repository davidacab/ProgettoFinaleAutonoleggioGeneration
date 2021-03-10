package it.autonoleggio.servlet;
import it.autonoleggio.database.Database;
import it.autonoleggio.model.*;
import it.autonoleggio.utility.MyException;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.helpers.ParseConversionEventImpl;




@WebServlet("/servletregistrazione")
public class ServletRegistrazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Cliente> listaClienti;
	HttpSession session;


	public ServletRegistrazione() {
		super();


	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/registrazione.jsp").forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome,cognome,cf,patente,email,password;
		
		String data=request.getParameter("data");
		nome=request.getParameter("nome");
		cognome=request.getParameter("cognome");
		cf=request.getParameter("codiceFiscale");
		patente=request.getParameter("numeroPatente");
		email=request.getParameter("email");
		password=request.getParameter("password");
		
		
		Cliente c = new Cliente ();
		c.setNome(nome);
		c.setCognome(cognome);
		c.setCf(cf);
		c.setNPatente(patente);
	    c.setMail(email);
	    c.setPassword(password);
	    c.setDataNascita(data);
	    c.setAttivo(0);
	    
	    try 
	    {
	    	Database.getInstance().insertCliente(c);
	    	request.setAttribute("nome", c.getNome());
	    	request.getRequestDispatcher("login.jsp").forward(request, response);
	    	
	    }
	    catch(MyException e)
	    {
	    	e.printStackTrace();
	    	request.setAttribute("msg", "Errore nell'inserimento dell'utente");
	    	request.getRequestDispatcher("registrazione.jsp").forward(request, response);;
	    	
	    }

	}

}
