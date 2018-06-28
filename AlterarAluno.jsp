d<?xml version="1.0" encoding="ISO-8859-1" ?>
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
    <title>Alterar Aluno</title>

 </head>  
                    
            <jsp:include page="menuUsuario.jsp" />
                    
                    <form  action="AlterarAluno"  id="demo-form2" data-parsley-validate class="form-horizontal form-label-left" method="post">
				
					 <!-- NOME ALUNO -->
					<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Nome <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" name="nome"  value="${param.nome}" class="form-control col-md-7 col-xs-12" />
						  
                        </div>
                     </div>
                    
                     <!-- MATRICULA ALUNO -->
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="first-name">Matrícula <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" name="matricula"  value="${param.matricula}" readonly="readonly" class="form-control col-md-7 col-xs-12" />
						    
					 	</div>
                      </div>
                      
                      
                       <!-- EMAIL ALUNO -->
					  	<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">E-mail <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input  type="text" name="email"  value="${param.email}" class="form-control col-md-7 col-xs-12"  />
						  
                        </div>
                      </div> 
                       
                        <!-- TURMA ALUNO -->
					 <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Turma <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input  type="text" name="turma"  value="${param.codTurma}" class="form-control col-md-7 col-xs-12"  />
                        </div>
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
						 <a href="listarAluno.jsp"> <button class="btn btn-primary" type="reset">Cancelar</button></a>
                          <button  type="submit" class="btn btn-success">Alterar</button>
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