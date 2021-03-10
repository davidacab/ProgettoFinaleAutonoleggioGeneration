<%@page import="it.autonoleggio.model.Cliente"%>
<%@page import="it.autonoleggio.model.Noleggio"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<br>
<table class="table">
		<thead>
			<tr>
				<th scope="col">ID Noleggio</th>
				<th scope="col">Data di inizio noleggio</th>
				<th scope="col">Data di fine noleggio</th>
				<th scope="col">Auto</th>

			</tr>
		</thead>
		<tbody>
		
		<%
				ArrayList<Noleggio> listaNoleggi = (ArrayList<Noleggio>) request.getAttribute("listaNoleggi");
				Cliente c = (Cliente) request.getSession().getAttribute("cliente");
				int count = 0;
				for(int i=listaNoleggi.size()-1;i>=0;i--){
					if(count<10){
						if(listaNoleggi.get(i).getClienteBean().getIdCliente()==c.getIdCliente()){
							count++;
		%>
		
		<tr>
				<th scope="row"><%= listaNoleggi.get(i).getIdNoleggio() %></th>
				<th scope="row"><%= listaNoleggi.get(i).getDataInizio() %></th>
				<th scope="row"><%= listaNoleggi.get(i).getDataFine() %></th>
				<th scope="row"><%= listaNoleggi.get(i).getAutoBean()%></th>
				

			</tr>

		</tbody>
		
		<%}}} %>
		
	</table>
	<br>
	<br>
	<a href="/autonoleggio/WebContent/jsp/Cliente.jsp" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Indietro</a>


<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>
</body>
</html>