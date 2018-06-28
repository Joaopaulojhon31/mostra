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
<link rel="shortcut icon" type="favicon.ico" href="componentes/imagens/ico.ico" />

	<title>Cadastro curso</title>
	<jsp:include page="menuUsuario.jsp" />
</head>

<body>
	<div class="clearfix"></div>
    	<div class="row">
        	<div class="x_panel">
			
				<div class="x_title">
					<!-- TITULO DA PAGINA DESTACADO -->
		            <h2>Cadastrar <small>Curso</small></h2>
		            <div class="clearfix"></div>
		        </div>
	        	
				<form action="CadastroCurso" id="demo-form2" class="form-horizontal form-label-left" method="post">
						                      
                    <!-- cnpj -->
					<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="cnpj">Cnpj<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="number" id="cnpj" name="cnpj" value="${item.cnpj}" required="required" class="form-control col-md-7 col-xs-12" />
                        </div>
                      </div>
                      
                    <!-- nome -->
					<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nome">Nome do curso<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="nome" name="nome" value="${item.nome}" required="required" class="form-control col-md-7 col-xs-12" />
                        </div>
                      </div>
                      
                    <!-- descricao -->
					<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nome">Descrição <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="descricao" name="descricao" value="${item.descricao}" required="required" class="form-control col-md-7 col-xs-12" />
                        </div>
                      </div>
                      
                      <!-- BOTOES -->
                      <div class="form-group">
                        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
							<center>
							<br />
						  <button class="btn btn-primary" type="reset">Resetar</button>
                          <button  type="submit" class="btn btn-success">Cadastrar</button>
                        </div>
                      </div>
                      
				</form>
				
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
</body>
</html>