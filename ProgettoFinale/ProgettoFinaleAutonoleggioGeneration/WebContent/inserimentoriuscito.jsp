<%@page import="it.autonoleggio.model.Auto"%>
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
<title>Noleggio Efettuato</title>
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
					href="ParcoAuto.jsp">Parco Auto</a></li>
				<li class="nav-item"><a class="nav-link" href="chisiamo.jsp">Chi
						Siamo</a></li>
				<li class="nav-item"><a class="nav-link" href="contatti.jsp">
						Contatti</a></li>
			</ul>
		</div>
	</nav>
	
	
	<div class="card" style="width: 18rem;align-self: center;">
  <img src="https://media.autoexpress.co.uk/image/private/s--CG0GDBCe--/v1600784515/autoexpress/2020/09/New%202021%20BMW%20M3%20Competition-2.jpg" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Noleggio efettuato con successo</h5>
    <p class="card-text">Ora puoi prenderti del tempo per pagare</p>
    <a href="#" class="btn btn-primary">vai al pagamento</a>
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
