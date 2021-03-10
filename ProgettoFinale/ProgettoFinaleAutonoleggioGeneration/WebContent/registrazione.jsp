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
<title>Registrazione</title>
<style>
.title {
	color: blue;
}
</style>
</head>

<body style="text-align: center">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">Menu</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarText" aria-controls="navbarText"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarText">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Parco
						Auto <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Chi Siamo</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Contatti</a>
				</li>
			</ul>
			<a href="login.jsp"
				class="btn btn-success"> Login</a>
		</div>
	</nav>
	
	<h2 class="title">Registrazione Utente</h2>
	
	<%if(request.getAttribute("msg")!=null){
		out.println(request.getAttribute("msg"));
	} %>
	<div class="container">
		<div class="col-6" style="margin: auto">
		<form action="/ProgettoFinaleAutonoleggioGeneration/servletregistrazione" method="post">
				<div class="form-group">
					<label for="nome">Nome</label> <input name="nome" type="text"
						class="form-control" id="nome" placeholder="Inserisci Nome"
						style="text-align: center">
				</div>
				<div class="form-group">
					<label for="cognome">Cognome</label> <input name="cognome"
						type="text" class="form-control" id="cognome"
						placeholder="Inserisci Cognome" style="text-align: center">
				</div>

				 <div class="form-row">
    <div class="form-group col-md-5">
      <label for="codiceFiscale">Codice Fiscale</label>
      <input type="text" class="form-control input" id="codiceFiscale" name="codiceFiscale" maxlength="16" style="font-family: Verdana; font-size: 2 pt;" margin-style="200" onchange="this.value = this.value.toUpperCase( );">
    </div>
					<div class="form-group col-md-4">
      <label for="numeroPatente">Patente</label>
      <input type="text" class="form-control input" id="numeroPatente" name="numeroPatente" maxlength="10" style="font-family: Verdana; font-size: 6 pt" onchange="this.value = this.value.toUpperCase( );">
       </div>
					<div class="form-group col-md-3">
      <label >Data di Nascita     
      <input type="date" class="input" name="data" min="1900-12-31" max="2002-12-31" style="height:37px; text-align: center; bottom:-8px; position:relative; ">
      </label>
      </div>
					<div class="form-group col-md-12">
						<label for="mail">Email</label> <input type="email"
							class="form-control" id="mail" placeholder="Inserisci Email"
							name="email" style="text-align: center">
					</div>

					<div class="form-group col-md-6">
						<label for="password">Password</label> <input type="password"
							class="form-control" id="password"
							placeholder="Inserisci Password" name="password">
					</div>
				</div>
		</div>
		<div class="form-group">
			<div class="form-check"></div>
		</div>
		<button type="submit" class="btn btn-primary">Registrati</button>
		</form>
	</div>
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