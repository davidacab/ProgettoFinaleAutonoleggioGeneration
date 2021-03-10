package it.autonoleggio.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.autonoleggio.database.Database;
import it.autonoleggio.model.Noleggio;


@WebServlet("/UltimiDieciNoleggi")
public class UltimiDieciNoleggi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UltimiDieciNoleggi() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Noleggio> listaNoleggi = (ArrayList<Noleggio>) Database.getInstance().getNoleggioAll();
		request.setAttribute("listaNoleggi", listaNoleggi);
		request.getRequestDispatcher("WebContent/jsp/UltimiDieciNoleggi.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
