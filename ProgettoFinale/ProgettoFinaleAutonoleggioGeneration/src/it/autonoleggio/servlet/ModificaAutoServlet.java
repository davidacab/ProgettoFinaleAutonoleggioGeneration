package it.autonoleggio.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.autonoleggio.database.Database;
import it.autonoleggio.model.*;

@WebServlet("/ModificaAutoServlet")
public class ModificaAutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ModificaAutoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String targa, alimentazione, modello, marca, tipologia, cilindrata, disponibile;
		
		targa=request.getParameter("targa");
		alimentazione=request.getParameter("alimentazione");
		modello=request.getParameter("modello");
		marca=request.getParameter("marca");
		tipologia=request.getParameter("tipologia");
		cilindrata=request.getParameter("cilindrata");
		disponibile=request.getParameter("disponibile");
		
		int idmarca=0, idtipologia=0;
		byte cil=0, dis=0;
		try {
			cil=Byte.parseByte(cilindrata);
			dis=Byte.parseByte(disponibile);
		}catch (NumberFormatException e) {
		}
		try {
			dis=Byte.parseByte(disponibile);
		}catch (NumberFormatException e) {
		}
		try {
			idmarca=Integer.parseInt(marca);
		}catch (NumberFormatException e) {
		}
		try {
			idtipologia=Integer.parseInt(marca);
		}catch (NumberFormatException e) {
		}
		Marca m=Database.getInstance().getMarca(idmarca);
		Tipologia t=Database.getInstance().getTipologia(idtipologia);
		Auto a=new Auto ();
		a.setMarca(m);
		a.setTipologia(t);
		a.setTarga(targa);
		a.setAlimentazione(alimentazione);
		a.setModello(modello);
		a.setCilindrata(cil);
		a.setDisponibile(dis);
		
		if (Database.getInstance().editAuto(a))
		{
			response.sendRedirect("/autonoleggio/operazioneriuscita");
		}
		else
		{
			response.sendRedirect("/autonoleggio/operazionefallita");
		}
	}

}
