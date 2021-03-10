<%@page import="java.util.ArrayList"%>
<%@page import="it.autonoleggio.database.Database"%>
<%@page import="it.autonoleggio.model.Cliente"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="loginhome.jsp">Menu</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarText">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Parco Auto <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Chi Siamo</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Contatti</a>
      </li>
    </ul>
    <a href="registrazione.jsp" class="btn btn-primary" style="margin-right: 2px"> Registrati</a>
    <a href="login.jsp" class="btn btn-success"> Login</a>
  </div>
</nav>

<form method="post">

<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">NOME</th>
      <th scope="col">COGNOME</th>
      <th scope="col">EMAIL</th>
      <th scope="col">CODICE FISCALE</th>
    </tr>
    <%
    HttpSession session2=request.getSession();
List <Cliente> listaClienti = (List<Cliente>) session.getAttribute("lista");

if (listaClienti!=null)
{
	for (Cliente c:listaClienti)
	{		
		int i=listaClienti.indexOf(c)+1;
		if (c.getAttivo()==0)
		{
			
    out.println ("<tr>");
      out.println ("<th scope=\"row\">"+i+"</th>");
      out.println ("<td>" + c.getNome() + "</td>");
      out.println ("<td>" + c.getCognome() + "</td>");
      out.println ("<td>" + c.getMail() + "</td>");
      out.println ("<td>" + c.getCf() + "</td>");
      out.println ("<td> <a button type=\"submit\" class=\"btn btn-primary\" href=\"/ProgettoFinaleAutonoleggioGeneration/accettaregistrazione?id="+c.getIdCliente()+"\">Accetta</button></a>");
      out.println ("<td> <a button type=\"submit\" class=\"btn btn-primary\" href=\"/ProgettoFinaleAutonoleggioGeneration/eliminaRegistrazione?id="+c.getIdCliente()+"\">Elimina</button></a>");
      out.println ("</tr>");
		}
	}
}
    %>
  </tbody>
</table>
</form>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

</body>
</html>