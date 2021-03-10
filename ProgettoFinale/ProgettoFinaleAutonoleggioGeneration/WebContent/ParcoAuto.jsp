<%@page import="it.autonoleggio.model.Auto"%>
<%@page import="java.util.List"%>
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
<title>ParcoAuto</title>

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

nav a:hover {
	background: aqua;
	color:black;
}

.container{
max-width: 1200px; 
margin: auto;
background: #f2f2f2;
overflow:auto;

}

.gallery{
margin: 5px;
border: 1px solid #ccc;
float: left;
width: 390px;
}

.gallery img {
width: 100%;
height: auto;
}

.desc{
padding: 15px;
text-align: center;
}
</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-warning">
		<a class="navbar-brand" href="ServletHome"><img
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
					href="parcoauto.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="chisiamo.jsp">Chi
						Siamo</a></li>
				<li class="nav-item"><a class="nav-link" href="contatti.jsp">
						Contatti</a></li>
			</ul>
			<a href="/ProgettoFinaleAutonoleggioGeneration/servletesci" class="btn btn-danger"style="margin-right: 2px"> Logout</a> 
		</div>
	</nav>
	
	<div class="container">


    <table border="2">
     <thead>
    <tr>
      <th>ID</th>
      <th>MARCA</th>
      <th>MODELLO</th>
      <th>CILINDRATA</th>
      <th>ALIMENTAZIONE</th>
      <th>DISPONIBILE</th>
    </tr>
  </thead>
  <tbody>
  
  	<%
	  List<Auto> listaAuto=(List<Auto>)request.getAttribute("listaAuto");
	   for(Auto a:listaAuto){
      out.print("<tr>");
      out.print("<td>"+"<a href='/ProgettoFinaleAutonoleggioGeneration/ServletAuto?id="+a.getIdAuto()+"'>"+a.getIdAuto()+"</a>"+"</td>");
      out.print("<td>"+a.getMarca()+"</td>");
      out.print("<td>"+a.getModello()+"</td>");
      out.print("<td>"+a.getCilindrata()+"</td>");
      out.print("<td>"+a.getAlimentazione()+"</td>");
      out.print("<td>"+a.getDisponibile()+"</td>");
      out.print("</tr>");
	   }
	%>
  </tbody>
    </table>
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