package it.autonoleggio.servlet;

import java.io.IOException;
import java.time.LocalDate;

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


@WebServlet("/AggiungiNoleggio")
public class AggiungiNoleggio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       HttpSession session;
 
    public AggiungiNoleggio() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session=request.getSession();
		if ( (Boolean) session.getAttribute("c"))
		{		
			request.getRequestDispatcher("/autonoleggio/JSP/AggiungiNoleggio.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("/autonoleggio/JSP/Login.jsp").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String datai, dataf, auto,cliente;
		
		datai=request.getParameter("datainizio");
		dataf=request.getParameter("datafine");
		auto=request.getParameter("auto");
		cliente=request.getParameter("cliente");
		
		LocalDate dataInizio;
		LocalDate dataFine;
		int idAuto=0, idCliente=0;
		
		try {
			idAuto=Integer.parseInt(auto);
		}
		catch (NumberFormatException e)
		{
			
		}
		
		try {
			idCliente=Integer.parseInt(cliente);
		}
		catch (NumberFormatException e)
		{
			
		}
		
		/*try {
			dataInizio=LocalDate.parse(datai);
		}
		catch (NumberFormatException e)
		{
			
		}
		
		try {
			dataFine=LocalDate.parse(dataf);
		}
		catch (NumberFormatException e)
		{
			
		}*/
		Auto a=new Auto();
		a=Database.getInstance().getAuto(idAuto);
		
		Cliente c = new Cliente();
		c=Database.getInstance().getCliente(idCliente);
		
		Noleggio n=new Noleggio();
		n.setDataInizio(datai);
		n.setDataFine(dataf);
		n.setAutoBean(a);
		n.setClienteBean(c);
		
		if (Database.getInstance().insertNoleggio(n))
		{
			response.sendRedirect("/autonoleggio/operazioneriuscita");
		}
		else
		{
			response.sendRedirect("/autonoleggio/operazionefallita");
		}
	}

}
