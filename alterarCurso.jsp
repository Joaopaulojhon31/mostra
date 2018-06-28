<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />

			
	<!-- Bootstrap -->
	<link rel="shortcut icon" type="favicon.ico" href="componentes/imagens/ico.ico" />
	<link rel="stylesheet" href="componentes/css/bootstrap.css" />
	<link rel="stylesheet" href="componentes/css/footer.css" />
	<link rel="stylesheet" href="componentes/css/bootstrap-social.css" />
	<link rel="stylesheet" href="componentes/css/font-awesome.min.css" />
	<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet" />
	<link rel="stylesheet" href="componentes/css/custom.css" />  
	<link rel="stylesheet" href="componentes/css/stilo.css" />
	<link rel="shortcut icon" type="favicon.ico" href="componentes/imagens/ico.ico" />
	<title>Alterar curso</title>

</head>
	<jsp:include page="menuUsuario.jsp"/>	
<body>
		
	<div class="clearfix"></div>
        
	<div class="row">
		<div class="x_panel">
			<div class="x_title">
				<!-- TITULO DA PAGINA DESTACADO -->
	            <h2>ALTERAR<small>Curso</small></h2>
	            <div class="clearfix"></div>
	        </div>
	            
	            <div class="x_content">
				
				  <!-- TITULO DA PAGINA -->
	              <p class="text-muted font-13 m-b-30">Alteração de curso</p>
	            	
	            	<form action="AlterarCurso" id="demo-form2" data-parsley-validate class="form-horizontal form-label-left" method="post">
						
						<jsp:useBean id="dao" class="dao.CursoDao"/>
											
						<!-- Codigo -->	
						  <div class="item form-group">
		                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="codigo">Código <span class="required">*</span></label>
		                      <div class="col-md-6 col-sm-6 col-xs-12">
		                      	<input name="codigo" class="form-control col-md-7 col-xs-12" value="${param.codigo}" readonly="readonly" />
		                      </div>
	                      </div>
	                      
	                      <!-- Nome -->	
						  <div class="item form-group">
		                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nome">Nome <span class="required">*</span></label>
		                      <div class="col-md-6 col-sm-6 col-xs-12">
		                      	<input name="nome" value="${param.nome}" class="form-control col-md-7 col-xs-12" required="required" type="text" />
		                      </div>
	                      </div>
	                      
	                      <!-- descricao -->   					
							<div class="form-group">
		                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nome">Descrição <span class="required">*</span>
		                        </label>
		                        <div class="col-md-6 col-sm-6 col-xs-12">
									<textarea class="form-control rounded-0" rows="10" name="desc" value="${param.desc}" required="required">${param.desc}</textarea>
		                        </div>
		                      </div>
	                      
	                      <!-- cnpj -->
						 <div class="form-group">
	                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="cnpj">Cnpj<span class="required">*</span>
	                        </label>
	                        <div class="col-md-6 col-sm-6 col-xs-12">
	                          <input name="cnpj" value="${param.cnpj}" readonly="readonly" required="required" class="form-control col-md-7 col-xs-12" />
	                        </div>
	                      </div>
	                      
	                      <!-- BOTAO -->
	                      <div class="ln_solid"></div>
			                <div class="form-group"> 
			                   <div class="col-md-6 col-md-offset-3">
			                   		<a href="listarCurso.jsp"> <button type="reset"  class="btn btn-primary">Cancel</button></a>
			                   		<button type="submit" class="btn btn-info">Atualizar</button>
			                    </div>
							</div>
							
							<!-- INFORMAÇÕES DO ALUNO ENVIANDO PARA VARIAVEL E REDIRECIONAMENTO -->
							<c:url value="alterarCurso.jsp" var="urlAlterar">
									<!-- PUXANDO VALORES DO BANCO -->
									<c:param name="codigo" value="${item.codigo}" />
									<c:param name="nome" value="${item.nome}" />
									<c:param name="desc" value="${item.desc}" />
									<c:param name="cnpj" value="${item.cnpj}" />			
							</c:url>  
							 
	               	</form>
	              </div>
		</div><!-- END <div class="x_panel"> -->
	</div><!--END <div class="row">  -->
		
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

</body>
</html>