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
    
    <title>Deletar Turma</title>

 
    <jsp:include page="menuUsuario.jsp" />
    
        <!-- page content -->
        
        
                    <h2>Deletar <small>TURMA</small></h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    <form action="ExcluirTurma"   id="demo-form2" data-parsley-validate class="form-horizontal form-label-left" method="post">
				
				
				
				



					<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Código da Turma <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                        <input type="text" name="cod" value="${param.cod}" readonly="readonly" id="first-name" required="required" class="form-control col-md-7 col-xs-12" /><br>
						  
                        </div>
                      </div>
					  <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Nome da Turma <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                         <input type="text" name="nomeTurma"  value="${param.nomeTurma}" readonly="readonly" id="first-name" required="required" class="form-control col-md-7 col-xs-12" /><br />
				
                      
              
							<center>
							<br />
						<a herf="listarTurma.jsp"><button class="btn btn-primary" type="reset">Cancelar</button></a>  
                          <button type="submit" class="btn btn-danger">Deletar</button>
						  
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
	

	





</form>
</body>
</html>