<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>


  <nav class="navbar navbar-dark bg-light">
  
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
   <a href="servletregistrazione" class="btn btn-primary" style="margin-right: 2px"> Registrati</a>
    <a href="login.jsp" class="btn btn-success"> Login</a>
  </div>
  </nav>
  
  <form action="/ProgettoFinaleAutonoleggioGeneration/ServletLogin" method="post">
  
<span class="d-block p-2  bg-danger text-white">EFFETTUA LOGIN</span>
<div class="container">
  <div class="row">
    <div class="col-6">
<br>
<%if(request.getAttribute("errore")!=null){
	out.print(request.getAttribute("errore"));}
%>
  <div class="form-group " >
    <label for="input" class="font-weight-bold">Email</label>
    <input type="email" class="form-control" id="email" placeholder="inserisci email" name="em">
  </div>

  <div class="form-group ">
    <label for="input" class="font-weight-bold">Password</label>
    <input type="password" class="form-control" id="password" placeholder="inserisci password" name="passw">
  </div>
  <div class="form-group">
 <button type="submit" class="btn btn-dark">ACCEDI</button>
  </div>

<div>
<img src="https://cdn.pixabay.com/photo/2016/01/12/09/15/mercedes-1135046_960_720.png" width="200x200">
</div>

</div>
</div>
</div>
  </form>
  



<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>