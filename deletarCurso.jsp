<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<meta http-equiv="Content-Type" content="text/html" />
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
	<link rel="shortcut icon" type="favicon.ico" href="componentes/imagens/ico.ico" />
	<title>Deletar Curso</title>
	<jsp:include page="menuUsuario.jsp" />
	
</head>
<body>
	<div class="clearfix"></div>
    	<div class="row">
        	<div class="x_panel">
			
				<div class="x_title">
					<!-- TITULO DA PAGINA DESTACADO -->
		            <h2>Deletar 
		            <small>GRUPO</small></h2>
		            <div class="clearfix"></div>
		        </div>
		        
		        <form action="ExcluirCurso" id="demo-form2" class="form-horizontal form-label-left" method="post">
						        
					 <!-- cod curso -->
					<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="cnpj">Codigo<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input readonly="readonly" name="codigo" value="${param.codigo}" required="required" class="form-control col-md-7 col-xs-12" />
                        </div>
                      </div>
                                    
                     <!-- cnpj -->
					<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="cnpj">Cnpj<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input readonly="readonly" name="cnpj" value="${param.cnpj}" required="required" class="form-control col-md-7 col-xs-12" />
                        </div>
                      </div>
                      
                    <!-- nome -->
					<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nome">Nome do curso<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input readonly="readonly" name="nome" value="${param.nome}" required="required" class="form-control col-md-7 col-xs-12" />
                        </div>
                      </div>
                      
                    <!-- descricao -->   					
					<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nome">Descrição <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
							<textarea class="form-control rounded-0" rows="10" readonly="readonly" name="desc" value="${param.desc}" required="required">${param.desc}</textarea>
                        </div>
                      </div>
                                            
                      <!-- BOTOES -->
                      <div class="form-group">
                        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
							<center>
							<br />
						<a herf="listarCurso.jsp"><button class="btn btn-primary" type="reset">Cancelar</button></a>
	                          <button  type="submit" class="btn btn-danger">Deletar</button>
	                        </center>
                        </div>
                      </div>
                      
                  </form>
                  
               </div><!-- END <div class="x_panel"> -->
		 </div><!-- END <div class="row"> -->
              
	
</body>
</html>