<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta charset="utf-8">
<title>Fale Conosco</title>

<!-- Bootstrap -->
<link rel="shortcut icon" type="favicon.ico" href="componentes/imagens/ico.ico" />
<link rel="stylesheet" href="componentes/css/bootstrap.css">
<link rel="stylesheet" href="componentes/css/footer.css">
<link rel="stylesheet" href="componentes/css/bootstrap-social.css">
<link rel="stylesheet" href="componentes/css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
<link rel="stylesheet" href="componentes/css/custom.css">  
<link rel="stylesheet" href="componentes/css/stilo.css"> 
</head>
<body>
     
<!-- menu -->

	<jsp:include page="menu.jsp"/>
 
 <!-- CONTEUDO -->
 <br/><br/>
 
<div class="container">
<br><br>
<center>
<form class="form-horizontal">
<fieldset>

<!-- Form Name -->
<legend>Fale Conosco</legend>

<!-- Prepended text-->
<div class="form-group">
  <label class="col-md-4 control-label" for="prependedtext">Nome</label>
  <div class="col-md-5">
    <div class="input-group">
      <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
      <input id="prependedtext" name="prependedtext" class="form-control" placeholder="" type="text" required="">
    </div>
    
  </div>
</div>

<!-- Prepended text-->
<div class="form-group">
  <label class="col-md-4 control-label" for="Email">E-mail</label>
  <div class="col-md-5">
    <div class="input-group">
      <span class="input-group-addon"><span class="glyphicon glyphicon-envelope"></span></span>
      <input rows="10" id="Email" name="Email" class="form-control" placeholder="" type="text" required="">
    </div>
    
  </div>
</div>

<!-- Textarea -->
<div class="form-group">
  <label class="col-md-4 control-label" for="Comentário">Comentário</label>
  <div class="col-md-5">                     
    <textarea class="form-control" id="Comentário" name="Comentário"></textarea>
  </div>
</div>

<!-- Button (Double) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="botao1"></label>
  <div class="col-md-4">
    <button id="botao1" name="botao1" class="btn btn-default">Enviar</button>
    <button id="botao2" name="botao2" class="btn btn-default">Limpar</button>
  </div>
</div>

</fieldset>
</form>
</center>
<br><br>
</div>

<!-- RODAPÉ -->  


   <jsp:include page="rodape.jsp"/>
	
	
<!-- LINKS PARA CHAMAR OS JAVASCRIPTS --> 


<script src="componentes/js/jquery-1.11.3.min.js"></script>
<script src="componentes/js/bootstrap.js"></script>


</body>
</html>