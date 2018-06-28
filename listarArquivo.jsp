<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="shortcut icon" type="favicon.ico" href="componentes/imagens/ico.ico" />
<link rel="stylesheet" href="componentes/css/bootstrap.css">
<link rel="stylesheet" href="componentes/css/footer.css">
<link rel="stylesheet" href="componentes/css/bootstrap-social.css">
<link rel="stylesheet" href="componentes/css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
<link rel="stylesheet" href="componentes/css/custom.css">  
<link rel="stylesheet" href="componentes/css/stilo.css"> 
<link rel='stylesheet' href='componentes/unitegallery/css/unite-gallery.css' type='text/css' />
<link rel='stylesheet' href='componentes/unitegallery/themes/default/ug-theme-default.css' type='text/css' />
<link rel="shortcut icon" type="favicon.ico" href="componentes/imagens/ico.ico" />
<title>Listar Arquivos</title>
</head>
<body>
	<jsp:include page="menu.jsp"/>
	<br/><br/><br/><br/>
  	<br/><br/><br/><br/>
	<jsp:useBean id="dao" class="dao.ArquivoDao"></jsp:useBean>
   <center>
		<div class="container">
  <h2>Lista De Arquivos</h2>
  <p>Lista de Arquivos dos Projetos</p> 
		<table class="table">
    <thead>
  
      <tr>
 
	 <th>Nome Arquivo</th>
	 <th>Nome Do Projeto</th>
	  <th>Ano Do Projeto</th>
	  <th>BAIXAR</th>
      </tr>
    </thead>
     <tbody>
    
      	<c:forEach var="item" items="${dao.lista}">
					<tr>
						
						<td><c:out value="${item.nome}"></c:out></td>
						<td><c:out value="${item.projeto.nome}"></c:out></td>
						<td><c:out value="${item.projeto.ano}"></c:out></td>
						<td><a href="Guru_download?nome=${item.nome}">
						<img height="15%" width="20%" src="http://www.adautobulhoes.com.br/BAIXAR.png"/></a></td>
      </tr>

				</c:forEach>
		</table>
		</center>	
	<jsp:include page="rodape.jsp"/>
</body>
</html>