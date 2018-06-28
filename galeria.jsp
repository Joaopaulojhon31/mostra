<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta charset="utf-8">
<title>Galeria</title>

<!-- Bootstrap -->
<link rel="shortcut icon" type="favicon.ico" href="componentes/imagens/ico.ico" />
<link rel="stylesheet" href="componentes/css/bootstrap.css">
<link rel="stylesheet" href="componentes/css/footer.css">
<link rel="stylesheet" href="componentes/dist/assets/owl.carousel.min.css">
<link rel="stylesheet" href="componentes/dist/assets/owl.theme.default.min.css">
<link rel="stylesheet" href="componentes/css/bootstrap-social.css">
<link rel="stylesheet" href="componentes/css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
<link rel="stylesheet" href="componentes/css/custom.css">  
<link rel="stylesheet" href="componentes/css/stilo.css">  
</head>
<body>
    
 <!-- menu -->

	<<jsp:include page="menu.jsp"/>
  <br><br><br><br>
  <!-- CONTEÚDO -->
  
  
<div class="container">
<center>
<h1>GALERIA</h1>
</center>

<div class="row">
  <div class="col-md-4">
    <div class="thumbnail">
      <a href="galeria-analisesclinicas.jsp">
        <img src="componentes/imagens/Analises/big-ac1.jpg" alt="Lights" style="width:100%">
      </a>
    </div>
  </div>
    <div class="col-md-4">
    <div class="thumbnail">
      <a href="galeria-eletronica.jsp">
        <img src="componentes/imagens/Eletronica/big-el1.jpg" alt="Lights" style="width:100%">
      </a>
    </div>
  </div>
    <div class="col-md-4">
    <div class="thumbnail">
      <a href="galeria-enfermagem.jsp">
        <img src="componentes/imagens/Enfermagem/big-en1.jpg" alt="Lights" style="width:100%">
      </a>
    </div>
  </div>
</div>
<div class="row">
  <div class="col-md-4">
    <div class="thumbnail">
      <a href="galeria-informatica.jsp">
        <img src="componentes/imagens/Informatica/big-info1.jpg" alt="Lights" style="width:100%">
      </a>
    </div>
  </div>
    <div class="col-md-4">
    <div class="thumbnail">
      <a href="galeria-meioambiente.jsp">
        <img src="componentes/imagens/MeioAmbiente/big-ma1.jpg" alt="Lights" style="width:100%">
      </a>
    </div>
  </div>
    <div class="col-md-4">
    <div class="thumbnail">
      <a href="galeria-seguranca.jsp">
        <img src="componentes/imagens/Seguranca/big-seg1.jpg" alt="Lights" style="width:100%">
      </a>
    </div>
  </div>
</div>
<center>
<div class="row">
  <div class="col-md-4">
    <div class="thumbnail">
      <a href="galeria-teleco.jsp">
        <img src="componentes/imagens/Teleco/big-tel1.jpg" alt="Lights" style="width:100%">
      </a>
    </div>
  </div>
</div>
</center>
</div>


<!-- RODAPÉ -->  

<jsp:include page="rodape.jsp"/>
	
<!-- LINKS PARA CHAMAR OS JAVASCRIPTS --> 


<script src="componentes/js/jquery-1.11.3.min.js"></script>
<script src="componentes/js/bootstrap.js"></script>
<script src="componentes/dist/owl.carousel.min.js"></script>



</body>
</html>