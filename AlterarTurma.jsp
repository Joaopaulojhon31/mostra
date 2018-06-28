<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" type="favicon.ico" href="componentes/imagens/ico.ico" />
    <title>Alterar Turma</title>

 
    <jsp:include page="menuUsuario.jsp" />
    
        <!-- page content -->
        
        
                    <h2>Alterar <small>TURMA</small></h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    <form action="AlterarTurma"   id="demo-form2" data-parsley-validate class="form-horizontal form-label-left" method="post">
					
					<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Nome da Turma <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                         <input type="text" name=nomeTurma  value="${param.nomeTurma}" id="first-name" required="required" class="form-control col-md-7 col-xs-12" /><br />
						  
                        </div>
                      </div>
					  <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Código da Turma <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" name=cod  value="${param.cod}" readonly="readonly" id="first-name" required="required" class="form-control col-md-7 col-xs-12" /><br />
						  
                        </div>
                      </div>                      
					  <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Sala Da Turma <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                         <input type="text" name=salaTurma  value="${param.salaTurma}" id="first-name" required="required" class="form-control col-md-7 col-xs-12" /><br />
						  
                        </div>
                      </div>
                          
                        
                     
					  	<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Curso <span class="required">*</span>
                        </label>
                        
                        <jsp:useBean id="dao" class="dao.CursoDao"/>
                        
						<div class="col-md-3 col-sm-6 col-xs-12">
							<select class="form-control" required name="codCurso">
							<option value="">Selecione...</option>
								<c:forEach var="item" items="${dao.lista}">
								<option value="${item.cod}"><c:out value="${item.nome}"></c:out></option>
						
								</c:forEach>
							</select>
						</div>
                        	
                     
						 
						  <label class="control-label col-md-1 col-sm-3 col-xs-12" for="first-name">Sala <span class="required">*</span>
                        </label>
                        <div class="col-md-2 col-sm-6 col-xs-12">
                          <input type="text" id="first-name" name="sala" required="required" class="form-control col-md-7 col-xs-12" />
                        </div>
                      </div>  
					 
					 <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Etapa <span class="required">*</span></label>
                        <div class="col-md-2 col-sm-12 col-xs-12 form-group">
                          <select class="form-control" required name="etapaTurma">
						<option value="">Selecione...</option>
								<%-- <option  value="${item.cod==param.etapaTurma}"><c:out value="${item.etapaTurma}"></c:out></option> --%>
                            <option value="1º Etapa">1º Etapa</option>
                            <option value="2º Etapa">2º Etapa</option>
                            <option value="3º Etapa">3º Etapa</option>
                    
                          
                          </select>
                        </div>	
                        <label class="control-label col-md-2 col-sm-3 col-xs-12">Turno <span class="required">*</span></label>
                        <div class="col-md-2 col-sm-12 col-xs-12 form-group">
                          <select class="form-control" required name="turnoTurma">
                          	<option value="">Selecione...</option> 	
							<c:forEach var="item" items="${dao.lista}">
							<%-- <option  value="${item.turnoTurma==param.turnoTurma}"><c:out value="${item.turnoTurma}"></c:out></option> --%>
                            </c:forEach>
                            <option value="Manhã">Manhã</option>
                            <option value="Tarde">Tarde</option>
							<option value="Noite">Noite</option>
							<c:if test="${item.turnoTurma==param.turnoTurma}">Selected==selected</c:if>
                          </select>
                      </div> 
					  </div>
			                       
                      <div class="form-group">
                        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
							<center>
							<br />
						<a href="listarTurma.jsp"><button class="btn btn-primary" type="reset">Cancelar</button></a>
                          <button type="submit" class="btn btn-success">Atualizar</button>
						  
                        </div>
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