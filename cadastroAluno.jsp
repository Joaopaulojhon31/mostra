<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="dao.TurmaDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <title>Cadastro Aluno</title>

 </head>  
                    
            <jsp:include page="menuUsuario.jsp" />
                    
                    <form  action="CadastroAluno"  id="demo-form2" data-parsley-validate class="form-horizontal form-label-left" method="post">
					
					 <!-- NOME ALUNO -->
					<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Nome <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" name="nome"   class="form-control col-md-7 col-xs-12" />
						  
                        </div>
                     </div>
                    
                     <!-- MATRICULA ALUNO -->
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="first-name">Matrícula <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" name="matricula"  class="form-control col-md-7 col-xs-12" />
						    
					 	</div>
                      </div>
                      
                      
                       <!-- EMAIL ALUNO -->
					  	<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">E-mail <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input  type="text" name="email"   class="form-control col-md-7 col-xs-12"  />
						  
                        </div>
                      </div> 
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Selecione Uma Turma <span class="required">*</span>
                          </label>
                        <jsp:useBean id="dao2" class="dao.TurmaDao"/>
                    
                        
						<div class="col-md-3 col-sm-6 col-xs-12">
							<select class="form-control" required name="turma">
							<option value="">Selecione...</option>
								<c:forEach var="item" items="${dao2.lista}">
								<option value="${item.cod}"><c:out value="${item.nomeTurma}"></c:out></option>
						
								</c:forEach>
							</select>
						</div>
                  
                   
                     
                     
                     <div class="form-group">
                      <jsp:useBean id="dao" class="dao.SexoDao"/>
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Sexo <span class="required">*</span></label>
                    
                        <div class="col-md-2 col-sm-6 col-xs-12 form-group">
                          <select class="form-control" required name="sexo">
							<option value="">Selecione...</option>
							<c:forEach var="item" items="${dao.lista}">
	                        <option value="${item.codigo}"><c:out value="${item.descricao}"></c:out></option>
                            </c:forEach>
                          </select>
                      	</div> 
                      	</div>
					  
			                       
                      <div class="form-group">
                        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
							<center>
							<br />
						  <button class="btn btn-primary" type="reset">Resetar</button>
                          <button  type="submit" class="btn btn-success">Cadastrar</button>
                        </div>
                      </div>
                      
					
                    </form>
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