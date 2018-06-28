<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<!-- TITULO DA BORDA -->
    <title>Deletar aluno</title>
	
	<!-- MENU USUARIO FIXO NA PAGINA -->
    <jsp:include page="menuUsuario.jsp" />

</head>
<body>

         <div class="clearfix"></div>
         	<div class="row">
         		<div class="x_panel">
         			<div class="x_title">
         				<!-- TITULO DA PAGINA DESTACADO -->
        				<h2>Deleção <small>de aluno</small></h2>
        			<div class="clearfix"></div>
        		</div>
                  

				<!-- CONTEUDO DA PAGINA -->
				<form action="ExcluirAluno" method="post" id="demo-form2" class="form-horizontal form-label-left" >
				<div >
				
					<div class="item form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12" for="matricula">Matricula  </label>
			              <div class="col-md-6 col-sm-6 col-xs-12">
			              	<input name="matricula" value="${param.matricula}" readonly="readonly" class="form-control col-md-7 col-xs-12" required="required"/>
			              </div>
		              </div>
					
					<div class="item form-group">
			          <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nome">Nome  </label>
			            <div class="col-md-6 col-sm-6 col-xs-12">
			          	<input name="nome" value="${param.nome}" readonly="readonly" class="form-control col-md-7 col-xs-12" required="required" />
		              </div>
		             </div>
						
					<div class="ln_solid"></div>
					
					<div class="form-group"> 
			        	<div class="col-md-6 col-md-offset-3">
							<button type="submit"  name="Excluir" value="Deletar"  class="btn btn-danger"">Deletar</button>
							<a href="listarAluno.jsp"><button type="reset" class="btn btn-primary">Cancelar</button></a>
						</div>
					</div>	
					 	
				</div>
				</form>
				<!-- END CONTEUDO DA PAGINA -->
				
				<!-- footer content -->
				        <footer>
				          <div class="pull-right">
				            Copyright © Painel de Controle Mostra Tecnológica Utramig 2018 - <a href="http://utramig.mg.gov.br/" target="_blank">UTRAMIG</a>
				          </div>
				          <div class="clearfix"></div>
				        </footer>
				<!-- /footer content -->

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