package it.autonoleggio.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.autonoleggio.database.Database;
import it.autonoleggio.model.Auto;

@WebServlet("/ParcoAutoServlet")
public class ParcoAutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParcoAutoServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  List<Auto> listaAuto=Database.getInstance().getAutoAll();
		  request.setAttribute("listaAuto", listaAuto);
          request.getRequestDispatcher("ParcoAuto.jsp").forward(request, response);
          
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
