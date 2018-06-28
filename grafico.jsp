<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="model.Votacao"%>
<%@page import="dao.VotacaoDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
  <meta charset="utf-8">
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
<jsp:include page="menu.jsp"/>
<br></br><br></br>

<div class="container">
  <h2>Barra de  Votação</h2>
  <p>Barra de Votação Dos Cursos</p>
  <%
   VotacaoDao voto = new VotacaoDao();
  
   for(Votacao voto1 : voto.getLista()){
	   String resultado = String.format("%.2f", voto1.getTotal());
   %>
 
 <div class="container">
   <font size="3" color="black"> <%out.print(resultado+"%"); %></font>
  <%int i = (int) voto1.getTotal();%>
   <div class="progress">
     <div class="progress-bar" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: <%out.print(i+"%"); %>" >
   <font size="3" color="black">  <%out.print(voto1.getNome().getNome()); %></font>
</div>
</div>
</div>
<%}; %>

</div>

 <jsp:include page="rodape.jsp"/>
</body>
</html>