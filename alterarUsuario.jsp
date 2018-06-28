<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="shortcut icon" type="favicon.ico" href="componentes/imagens/ico.ico" />
<title>Alterar Usuario</title>
</head>
<body>
<jsp:include page="menuUsuario.jsp" />
        <!-- /top navigation -->

        <!-- page content -->
    
           
                    <h2>Alterar <small>Usuario</small></h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    <form action="AlterarUsuario" id="demo-form2" data-parsley-validate class="form-horizontal form-label-left" method="post">
					
					<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">ID <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="first-name" name="id"  value="${param.id}"  readonly="readonly" required="required" class="form-control col-md-7 col-xs-12"/>
                        </div>
					
					<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Login <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="first-name" name="login"  value="${param.login}"  required="required" class="form-control col-md-7 col-xs-12"/>
                        </div>
                      </div>
                  
					<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Digite a nova Senha <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="password" id="first-name" name="senha" required="required" class="form-control col-md-7 col-xs-12" >
                        </div>
                      </div>
					  
                        <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Nivel <span class="required">*</span>
                        </label>
                        <div class="col-md-3 col-sm-6 col-xs-12">
                          <select class="form-control" required name="nivel">
							<option value="">Selecione...</option>
                            <option value="1">1 Administrador</option>
                            <option value="2">2 Usuário</option>
                            
                          </select>
						  </div>
							<center>
							<br />
						 <a href="listarAluno.jsp"><button class="btn btn-primary" type="reset">Cadastrar</button></a>
                          <button type="submit" class="btn btn-success">Atualizar</button>
						  
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
      </div>
    </div>
	
	<script>
	function duplicarCampos(){
	var clone = document.getElementById('origem').cloneNode(true);
	var destino = document.getElementById('destino');
	destino.appendChild (clone);
	var camposClonados = clone.getElementsByTagName('input');
	for(i=0; i<camposClonados.length;i++){
		camposClonados[i].value = '';
	}
	}
	function removerCampos(id){
	var node1 = document.getElementById('destino');
	node1.removeChild(node1.childNodes[0]);
	}
	
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