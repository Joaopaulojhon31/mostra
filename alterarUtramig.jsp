<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <link rel="shortcut icon" type="favicon.ico" href="componentes/imagens/ico.ico" />
</head>
    <title>Alterar Utramig</title>
 
    <jsp:include page="menuUsuario.jsp" />
        <!-- /top navigation -->

        <!-- page content -->
    
            <div class="clearfix"></div>
            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Alterar <small>Utramig</small></h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    <form action="AlterarUtramig" id="demo-form2" data-parsley-validate class="form-horizontal form-label-left" method="post">
					
					<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">CPNJ <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="number" id="first-name"  name="cnpj" value="${param.cnpj}"  readonly="readonly"  class="form-control col-md-7 col-xs-12"/>
                        </div>
                      </div>
					<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Nome <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="first-name" name="nome"  value="${param.nome}"  class="form-control col-md-7 col-xs-12" />
                        </div>
                      </div>
					  
                        <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Telefone <span class="required">*</span>
                        </label>
                        <div class="col-md-2 col-sm-6 col-xs-12">
                          <input type="number" id="first-name" name="telefone" value="${param.telefone}"   class="form-control col-md-7 col-xs-12" />
						  </div>
			
                      </div>
                        <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">E-Mail <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="email" id="first-name" name="email" value="${param.email}"  class="form-control col-md-7 col-xs-12" />
                        </div>
                      </div>
                      
                      
        
                      <div class="form-group">
                        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
							<center>
							<br />
						  <a href="listarUtramig.jsp"><button class="btn btn-primary" type="reset">Cancelar</button></a>
                          <button type="submit" class="btn btn-success">Alterar</button>
						  
                            </center>
                      </div>
					</div>
                    </form>
                  </div>
                </div>
              </div>
            </div>
         </div>
        </div>
        <!-- /page content -->

        <!-- footer content -->
        <footer>
          <div class="pull-right">
            Copyright © Painel de Controle Mostra Tecnológica Utramig 2018 - <a href="http://utramig.mg.gov.br/" target="_blank">UTRAMIG</a>
          </div>
          <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
      
	
	<script>
	
	
	</script>

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