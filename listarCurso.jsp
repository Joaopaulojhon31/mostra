<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="shortcut icon" type="favicon.ico" href="componentes/imagens/ico.ico" />
	<title>Listar curso</title>
	
	<!-- MENU USUARIO FIXO NA PAGINA -->
	<jsp:include page="menuUsuario.jsp" />
</head>
<body>
	
		<div class="clearfix"></div>
		
            <div class="row">
                <div class="x_panel">
                  <div class="x_title">
                  	<!-- TITULO DA PAGINA DESTACADO -->
                    <h2>Listagem <small>Alunos</small></h2>
                    <div class="clearfix"></div>
                  </div>
                  
                  <jsp:useBean id="dao" class="dao.CursoDao"/>
                  
          			<table id="datatable-responsive" class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
          				<thead>
          					<tr>
          					 <td>Codigo</td>
          					 <td>Cnpj da escola</td>
                          	 <td>Nome</td>
                          	 <td>Descrição</td>
                          	 <td>Data de Alteração</td>
	                          
	                          <!-- BOTOES REDIRECIONA  -->
	                          <td>Incluir</td>
	                          <td>Alterar</td>
	                          <td>Deletar</td>
	                         </tr>
          				</thead>
          				<tbody>
								<c:forEach var="item" items="${dao.lista}" >
									<tr>
									
										<c:url value="/alterarCurso.jsp" var="urlAlterar">
					                    	<c:param name="codigo" 		value="${item.cod}"/>
					                    	<c:param name="cnpj" 		value="${item.cnpj.cnpj}"/>
					                    	<c:param name="nome" 		value="${item.nome}"/>
					                    	<c:param name="desc"		value="${item.descCurso }"/>
					                    	<c:param name="data"		value="${item.dataAltCadas }" />
					                    </c:url>
					                    
					                    <c:url value="/deletarCurso.jsp" var="urlExcluir">
					                    	<c:param name="codigo" 		value="${item.cod }"/>
					                    	<c:param name="cnpj" 		value="${item.cnpj.cnpj}"/>
					                    	<c:param name="nome" 		value="${item.nome}"/>
					                    	<c:param name="desc"		value="${item.descCurso }"/>
					                    	<c:param name="data"		value="${item.dataAltCadas }" />
					                    </c:url>
										
										<!-- FAZENDO A LEITURA DOS VALORES -->
										<td><c:out value="${item.cod}"></c:out></td>
										<td><c:out value="${item.cnpj.cnpj}"></c:out></td>
										<td><c:out value="${item.nome}"></c:out></td>
										<td><c:out value="${item.descCurso}"></c:out></td>
										<td><c:out value="${item.dataAltCadas}"></c:out></td>
										
										<!-- BOTOES -->
										<td><a href="cadastroCurso.jsp"><img src ="https://image.freepik.com/vetores-gratis/design-do-lapis-da-escrita_1095-187.jpg" height="20px" width="20px" /></a></td>
	
										<td><a href="${urlAlterar}"><img src ="data:image/png;base64,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" height="20px" width="20px" />
										</a></td>
	
										<td><a href="${urlExcluir}"><img src ="http://www.cursosdeinformaticabasica.com.br/wp-content/uploads/2014/04/lixeira.jpg" height="20px" width="20px" /></a></td>			
												
									</tr>
								</c:forEach>
          				</tbody>
          			</table>        

               </div><!-- END <div class="x_panel"> -->
            </div><!-- END <div class="row"> -->
                  
	<!-- jQuery -->
    <script src="componentes/vendors/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="componentes/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="componentes/vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="componentes/vendors/nprogress/nprogress.js"></script>
    <!-- jQuery custom content scroller -->
    <script src="componentes/vendors/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js"></script>
	<!-- validator -->
    <script src="componentes/vendors/validator/validator.js"></script>
	 <!-- Dropzone.js -->
    <script src="componentes/vendors/dropzone/dist/min/dropzone.min.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="componentes/vendors/js/custom.min.js"></script>
    
    <!-- iCheck -->
    <script src="componentes/vendors/iCheck/icheck.min.js"></script>
    <!-- Datatables -->
    <script src="componentes/vendors/datatables.net/js/jquery.dataTables.min.js"></script>
    <script src="componentes/vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
    <script src="componentes/vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
    <script src="componentes/vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
    <script src="componentes/vendors/datatables.net-buttons/js/buttons.flash.min.js"></script>
    <script src="componentes/vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
    <script src="componentes/vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
    <script src="componentes/vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
    <script src="componentes/vendors/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
    <script src="componentes/vendors/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
    <script src="componentes/vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
    <script src="componentes/vendors/datatables.net-scroller/js/dataTables.scroller.min.js"></script>
    <script src="componentes/vendors/jszip/dist/jszip.min.js"></script>
    <script src="componentes/vendors/pdfmake/build/pdfmake.min.js"></script>
    <script src="componentes/vendors/pdfmake/build/vfs_fonts.js"></script>

</body>
</html>