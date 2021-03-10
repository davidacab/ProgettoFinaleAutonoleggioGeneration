<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<head>
<meta charset="ISO-8859-1">
<br>
<br>

<title>Riepilogo Noleggio</title>

</head>

 <%// Auto a =new Auto(); %>
 
 
<body background="https://img.pixers.pics/pho_wat(s3:700/FO/41/17/41/39/700_FO41174139_5eb1b4b00adf8ac8f957b4d096c84501.jpg,700,495,cms:2018/10/5bd1b6b8d04b8_220x50-watermark.png,over,480,445,jpg)/carte-da-parati-sfondo-grigio-chiaro-desi.jpg.jpg"; style="background-size: cover;">
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Menu</a>
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
    <a href="jsp/login.jsp" class="btn btn-success"> Login</a>
  </div>
</nav>
  <div class="container" >
  <div style="display:block; width:30%;float:left">
     <h1>Riepilogo Noleggio</h1>
    <label name="modelloauto"  style="color:red; width:30%;" >Modello Auto</label>
    <input name="modelloauto" type="text" class="form-control" id="modelloauto" style="text-align: center;  width:70%" readonly="readonly" value="<%// a.getModello() %>">
    
    <form name="costonoleggio" style="color:red; width:50%;">Costo Noleggio</form>
    <input name="costonoleggio" type="text" class="form-control" id="costonoleggio"  style="text-align: center; width:70%" readonly="readonly" value="<%// a.getPrezzotipologia() %>">
   
   
   <label name="nome" style="color:red; width:50%;"> Nome</label>
    <input name="nome" type="text" class="form-control" id="nome"  style="text-align: center; width:70%" readonly="readonly" value="<%// a.getNome() %>">
    <form name="cognome" style="color:red; width:20%;">Cognome</form>
    <input name="cognome" type="text" class="form-control" id="cognome"  style="text-align: center; width:70%;" readonly="readonly" value="<%// a.getCognome() %>">
  <form name="patente" style="color:red; width:20%;">Patente</form>
    <input name="patente" type="text" class="form-control" id="patente"  style="text-align: center; width:70%" readonly="readonly" value="<%// a.getPatente() %>">
    <br>
       </div>
       
    <div class="container" style="display:block; width:60%;float:right">
    <h3 style="color:red; width:60%;">Seleziona il metodo di pagamento</h3>
     <select class="metodopagamento" name="metodopagamento" id="metodopagamento">
            <option class="metodopagamento" value="visa">VISA</option>
            <option class="metodopagamento" value="postepay">POSTE-PAY</option>
            <option class="metodopagamento" value="mastercard">MASTER-CARD</option>
             <option class="metodopagamento" value="paypal">PAY-PAL</option>
        </select>
      
    <form>Inserisci il numero della carta di credito</form>
    <input type="text" name="cartadicredito"  id="inseriscicarta"class="form-control"  style="width:70%">
      <a href="javascript:controllaCifre();">Controllo Carta</a>
    
    <form name="nomecarta">Inserisci il nome del propietario della carta di credito</form>
    <input type="text" name="nomecarta" class="form-control"  style="width:70%">
      <form name="codicesicurezza">Codice di sicurezza</form>
    <input name="codicesicurezza" type="password" class="form-control" id="codicesicurezza"  style="text-align: center; width:70%"> 
   
      <a href="javascript:controllaCodice();">Controllo Codice</a>
      
      <br>

 
   
    <button class="btn btn-primary" style="margin-right: 2px">Procedi con il pagamento</button>
    <br>
    <br>
    
    <img src="https://www.track-vr.it/uploads/images/pagamenti.jpg"width="460" height="140">
    
    
    </div>
     </div>
    
  
   


 </div>



<script type="text/javascript">
function controllaCifre(){
	var inseriti=$("#inseriscicarta").val();
    if(inseriti.length==16){
        alert("valori corretti");
    }else{
    	alert("valori  non corretti");
    }
}


	
	


function controllaCodice(){
	var inseriti=$("#codicesicurezza").val();
	if(inseriti.length==3){
        alert("valori corretti");
    }else{
    	alert("valori  non corretti");
    }


}

</script>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>