package it.autonoleggio.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.OutputDeviceAssigned;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;

import it.autonoleggio.database.Database;
import it.autonoleggio.model.Auto;
import it.autonoleggio.model.Cliente;


@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;

	public ServletLogin() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/login.jsp").forward(request, response);

	    
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		session=request.getSession();
		String password=request.getParameter("passw");
		String email=request.getParameter("em");
		
		List<Cliente> listaClienti = Database.getInstance().getClientiAttivi();
		
		
//		String adminMail= this.getServletContext().getInitParameter("admin_email");
//		String adminPsw= this.getServletContext().getInitParameter("admin_psw");

		if(email.equals("admin@email.com")&&password.equals("admin1234")){
			session.setAttribute("cli", "no");
			request.getRequestDispatcher("loginhome.jsp").forward(request, response);;
		}
		else
		{
			if (listaClienti!=null)
			{
		for(Cliente cliente: listaClienti) {
				
				if((cliente.getMail().equals(email)) && (cliente.getPassword().equals(password))){
					session.setAttribute("cli", "si");
					session.setAttribute("cliente", cliente);
					request.getRequestDispatcher("loginhome.jsp").forward(request, response);
				}else {
					request.setAttribute("errore", "Email o Password incorretti");
					request.getRequestDispatcher("login.jsp");
				}
				
				
		}
				}
			
			
			
			
		}

		}


	}