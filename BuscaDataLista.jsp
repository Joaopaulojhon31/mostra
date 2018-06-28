<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="model.Projeto"%>
<%@page import="dao.BuscarDataDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Listar projetos por data</title>
		  
		  <!-- Bootstrap -->
			<link rel="shortcut icon" type="favicon.ico" href="componentes/imagens/ico.ico" />
			<link rel="stylesheet" href="componentes/css/bootstrap.css" />
			<link rel="stylesheet" href="componentes/css/footer.css" />
			<link rel="stylesheet" href="componentes/css/bootstrap-social.css" />
			<link rel="stylesheet" href="componentes/css/font-awesome.min.css" />
			<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet" />
			<link rel="stylesheet" href="componentes/css/custom.css" />  
			<link rel="stylesheet" href="componentes/css/stilo.css" />
	</head>

<body>

  <jsp:include page="menu.jsp" />

<br /><br /><br /><br />
    <div class="clearfix"></div>
           
     <div class="row">
        <div class="x_panel">
          <div class="x_title">
          

  
                    
                    <h2>Listagem<small>Projetos</small></h2>
                     <div class="clearfix"></div>
          
			        	<div class="x_content">
						<p class="text-muted font-13 m-b-30">Lista De Projetos </p>
			
						<table id="datatable-responsive" class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
				                    
				         <jsp:useBean id="dao" class="dao.BuscarDataDao"/>
						 <%
						 out.print("");
						 
						 %>
				            
				                    <thead>
				                        <tr>
				                          
				                          <th>Nome</th>
				                          <th>Coordenador</th>
				                          <th>Ano Projeto</th>
				                         <th>Semestre</th>
				                        </tr>
				                    </thead>
				                      
									<tbody>
										<c:forEach var="item" items="${dao.lista}"> 
										<td><c:out value="${item.descricao}"></c:out></td>
										<td><c:out value="${item.coordenador}"></c:out></td>						
										<td><c:out value="${item.nome}"></c:out></td>
										<td><c:out value="${item.semestre}"></c:out></td>
									</tbody>
							</c:forEach>   
			
						</table>
		
		  </div>
		</div>
	</div>
	</div>
		
 		<!-- footer content -->
        <footer>
          <div class="pull-right">
            Copyright © Painel de Controle Mostra Tecnológica Utramig 2018 - <a href="http://utramig.mg.gov.br/" target="_blank">UTRAMIG</a>
          </div>
          <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->

</body>
</html>