package it.autonoleggio.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.autonoleggio.database.Database;
import it.autonoleggio.model.Auto;
import it.autonoleggio.model.Cliente;
import it.autonoleggio.model.Noleggio;

/**
 * Servlet implementation class InserisciNoleggio
 */

public class InserisciNoleggio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserisciNoleggio() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String inizio,fine;
     inizio=request.getParameter("inizio");
     fine=request.getParameter("fine");
     int i=Integer.parseInt(request.getParameter("auto"));
     Auto a=Database.getInstance().getAuto(i);
     Noleggio n=new Noleggio();
     n.setDataInizio(inizio);
     n.setDataFine(fine);
     n.setAutoBean(a);
     HttpSession sessio=request.getSession();
     Cliente c=(Cliente)sessio.getAttribute("cliente");
     n.setClienteBean(c);
     Database.getInstance().insertNoleggio(n);
     request.getRequestDispatcher("/inserimentoriuscito").forward(request, response);;
     
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    SimpleDateFormat date= new SimpleDateFormat("dd/MM/yyyy");
//    date.format(request.getParameter("inizio"));
//    System.out.println(date);
    
	}

}
