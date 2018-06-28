<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Listar Turma</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" type="favicon.ico" href="componentes/imagens/ico.ico" />
    <title>Lista Turma</title>

    <jsp:include page="menuUsuario.jsp" />
    
      
            <div class="clearfix"></div>
            <div class="row">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Listagem<small>Turma</small></h2>
                    
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <p class="text-muted font-13 m-b-30">
                     Lista Da Turma
                    </p>

 	<jsp:useBean id="dao" class="dao.ArquivoDao"></jsp:useBean>
	<table id="datatable-responsive" class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
                      <thead>
                        <tr>
                        <th>ID</th>
					<th>NOME</th>
					<th>BAIXAR</th>
                        </tr>
                      </thead>
					<tbody>
				
					
                       
			<c:forEach var="item" items="${dao.lista}">
									
						<td><c:out value="${item.idProjeto}"></c:out></th>
						<td><c:out value="${item.nome}"></c:out></th>
						
			
	
						
					</tr>
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
      </div>
    </div>


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