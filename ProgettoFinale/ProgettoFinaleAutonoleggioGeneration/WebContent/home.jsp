<%@page import="java.util.List"%>
<%@page import="it.autonoleggio.model.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<head>
<meta charset="ISO-8859-1">
<title></title>
<style>
* {
	box-sizing: border-box;
}

ul {
	list-style-type: none;
}

body {
	font-family: Verdana, sans-serif;
}

.month {
	padding: 70px 25px;
	width: 100%;
	background: #1abc9c;
	text-align: center;
}

.month ul {
	margin: 0;
	padding: 0;
}

.month ul li {
	color: white;
	font-size: 20px;
	text-transform: uppercase;
	letter-spacing: 3px;
}

.month .prev {
	float: left;
	padding-top: 10px;
}

.month .next {
	float: right;
	padding-top: 10px;
}

.weekdays {
	margin: 0;
	padding: 10px 0;
	background-color: #ddd;
}

.weekdays li {
	display: inline-block;
	width: 13.6%;
	color: #666;
	text-align: center;
}

.days {
	padding: 10px 0;
	background: #eee;
	margin: 0;
}

.days li {
	list-style-type: none;
	display: inline-block;
	width: 13.6%;
	text-align: center;
	margin-bottom: 5px;
	font-size: 12px;
	color: #777;
}

.days li .active {
	padding: 5px;
	background: #1abc9c;
	color: white !important
}

/* Add media queries for smaller screens */
@media screen and (max-width:720px) {
	.weekdays li, .days li {
		width: 13.1%;
	}
}

@media screen and (max-width: 420px) {
	.weekdays li, .days li {
		width: 12.5%;
	}
	.days li .active {
		padding: 2px;
	}
}

@media screen and (max-width: 290px) {
	.weekdays li, .days li {
		width: 12.2%;
	}
}

<
style>* {
	box-sizing: border-box;
}

ul {
	list-style-type: none;
}

body {
	font-family: Verdana, sans-serif;
}

.month {
	padding: 70px 25px;
	width: 100%;
	background: #1abc9c;
	text-align: center;
}

.month ul {
	margin: 0;
	padding: 0;
}

.month ul li {
	color: white;
	font-size: 20px;
	text-transform: uppercase;
	letter-spacing: 3px;
}

.month .prev {
	float: left;
	padding-top: 10px;
}

.month .next {
	float: right;
	padding-top: 10px;
}

.weekdays {
	margin: 0;
	padding: 10px 0;
	background-color: #ddd;
}

.weekdays li {
	display: inline-block;
	width: 13.6%;
	color: #666;
	text-align: center;
}

.days {
	padding: 10px 0;
	background: #eee;
	margin: 0;
}

.days li {
	list-style-type: none;
	display: inline-block;
	width: 13.6%;
	text-align: center;
	margin-bottom: 5px;
	font-size: 12px;
	color: #777;
}

.days li .active {
	padding: 5px;
	background: #1abc9c;
	color: white !important
}

/* Add media queries for smaller screens */
@media screen and (max-width:720px) {
	.weekdays li, .days li {
		width: 13.1%;
	}
}

@media screen and (max-width: 420px) {
	.weekdays li, .days li {
		width: 12.5%;
	}
	.days li .active {
		padding: 2px;
	}
}

@media screen and (max-width: 290px) {
	.weekdays li, .days li {
		width: 12.2%;
	}
}
</style>
</head>
<body
	background="https://img.pixers.pics/pho_wat(s3:700/FO/41/17/41/39/700_FO41174139_5eb1b4b00adf8ac8f957b4d096c84501.jpg,700,495,cms:2018/10/5bd1b6b8d04b8_220x50-watermark.png,over,480,445,jpg)/carte-da-parati-sfondo-grigio-chiaro-desi.jpg.jpg"
	style="background-size: cover;">
<%
	HttpSession session2=request.getSession();
	String ad=(String) session2.getAttribute("admin");
	String cli=(String) session2.getAttribute("c");
	
	List <Cliente> listaClienti = (List<Cliente>) request.getAttribute("listaClienti");
	if (listaClienti!=null)
	{
	if (ad.equals(true) || cli.equals(true))
	{
		for (Cliente c:listaClienti)
		{
			int i=listaClienti.indexOf(c);
	%>
	<nav class="navbar navbar-expand-lg navbar-light bg-warning">
		<a class="navbar-brand" href="home.jsp"><img
			src="https://www.freepnglogos.com/uploads/cleveland-auto-show-car-logo-png-25.png"
			width="100x50"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarText" aria-controls="navbarText"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarText">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="parcoauto.jsp">Parco Auto</a></li>
				<li class="nav-item"><a class="nav-link" href="chisiamo.jsp">Chi
						Siamo</a></li>
				<li class="nav-item"><a class="nav-link" href="contatti.jsp">
						Contatti</a></li>
			</ul>
			<p> Benvenuto <%= c.getNome()%> </p>
		</div>
	</nav>
	<%
		}
		}
	}
	else
	{
	%>
	<nav class="navbar navbar-expand-lg navbar-light bg-warning">
		<a class="navbar-brand" href="home.jsp"><img
			src="https://www.freepnglogos.com/uploads/cleveland-auto-show-car-logo-png-25.png"
			width="100x50"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarText" aria-controls="navbarText"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarText">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="parcoauto.jsp">Parco Auto</a></li>
				<li class="nav-item"><a class="nav-link" href="chisiamo.jsp">Chi
						Siamo</a></li>
				<li class="nav-item"><a class="nav-link" href="contatti.jsp">
						Contatti</a></li>
			</ul>
			<a href="servletregistrazione" class="btn btn-danger"
				style="margin-right: 2px"> Registrati</a> 
				
				<a href="ServletLogin"
				class="btn btn-primary"> Login</a>
		</div>
	</nav>
	<%
	}
	%>
	<div class="card-body">
	<h1 style="color: black; text-align: center" font-style=bold>
		<b> AUTONOLEGGIO 
	</h1>

	<br>
	<br>
	<div align="center">
		<img
			src="https://cdnwp.dealerk.com/eed49ed7/uploads/sites/376/2019/02/parco_auto_moto_specialrent-1-768x264.png">
	</div>


	<table bgcolor="#2554C7" align="center">
		<tr>
		</tr>
		<tr>
		<td> Inizio </td>
			<td><input type="date" min="1900-12-31" max="2002-12-31"></td>
			</tr>
			<tr>		
			<td> Fine</td>	
			<td><input type="date" min="1900-12-31" max="2002-12-31"></td>
		</tr>
	</table>
	<div align="center">
		<input type="submit" name="invia" value="Noleggia">
		</div>
</div>
	<div class="card-footer">
		<footer class="blockquote-footer">
			<div class="footer-copyright text-center py-3">
				© 2020 Copyright: <a href="https://mdbootstrap.com/">
					MDBootstrap.com</a>
			</div>
		</footer>
	</div>

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