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
	<title>Cadastro curso Votacão</title>
	
</head>
<jsp:include page="menuUsuario.jsp" />

					<!-- TITULO DA PAGINA DESTACADO -->
		            <h2>Cadastrar <small>Curso</small></h2>
		            <div class="clearfix"></div>
		        </div>
	        	
				<form action="CadastroCursoVotacao" id="demo-form2" class="form-horizontal form-label-left" method="post">
						                      
                   
                    <!-- nome -->
					<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nome">Nome do curso<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="nome" name="nome" value="${item.nome}" required="required" class="form-control col-md-7 col-xs-12" />
                        </div>
                      </div>
                      
                  
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