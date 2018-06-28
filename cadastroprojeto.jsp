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
				<title>Cadastro Projeto</title> 
	
				<jsp:include page="menuUsuario.jsp" />
				<!-- page content -->
				
										<h2>
											Cadastrar <small>PROJETOS</small>
										</h2>
										<div class="clearfix"></div>
									</div>
									<div class="x_content">
										<br />
										<form action="CadastroProjeto"  id="demo-form2" data-parsley-validate
											class="form-horizontal form-label-left" method="post">

											<div class="form-group">
												<label class="control-label col-md-3 col-sm-3 col-xs-12">
													Nome Projeto <span class="required">*</span>
												</label>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<input type="text" id="first-name" name="nome"
														required="required"
														class="form-control col-md-7 col-xs-12"/>
												</div>
											</div>

										
											
											<div class="form-group">
												<label class="control-label col-md-3 col-sm-3 col-xs-12"
													for="last-name">Coordenador responsável <span
													class="required">*</span>
												</label>

												<div class="col-md-6 col-sm-6 col-xs-12">
													<input type="text" id="last-name" name="coordenador" name="last-name"
														 required="required"
														class="form-control col-md-7 col-xs-12"/>
												</div>
											</div>

											<div class="form-group">
												<label class="control-label col-md-3 col-sm-3 col-xs-12"
													for="last-name">Ano Do projeto<span class="required">*</span>
												</label>

												<div class="col-md-6 col-sm-6 col-xs-12">
													<input type="number" id="last-name" name="data" name="last-name"
														 required="required"
														class="form-control col-md-7 col-xs-12"/>
												</div>
											</div>
											<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
													for="last-name">Selecione o Semestre<span class="required">*</span>
												</label>
												<div class="col-md-6 col-sm-6 col-xs-12">
											<select class="form-control col-md-7 col-xs-12" name="semestre" >
													<option value="">Selecione...</option>
													<option value="1º Semestre">1º Semestre</option>
													<option value="2º Semestre">2º Semestre</option>
													</select>
												</div>
												</div>
											<div class="form-group">
												<label class="control-label col-md-3 col-sm-3 col-xs-12">Descrição
													do Projeto <span class="required">*</span>
												</label>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<textarea class="form-control" name="descricao" required="required" rows="3"></textarea>
												</div>
											</div>
										
											<div class="form-group">
												<div class="control-label col-md-3 col-sm-3 col-xs-12">
													Curso<span class="required">*</span>
												</div>
												
												<jsp:useBean id="dao" class="dao.CursoDao"/>
												<div class="col-md-6 col-sm-6 col-xs-12">
												<select class="form-control col-md-7 col-xs-12" name="codigoCurso" >
													<option value="">Selecione...</option>
													<c:forEach var="item" items="${dao.lista}">
													<option value="${item.cod}"><c:out value="${item.nome}"></c:out></option>
													</c:forEach>
												</select>
												</div>
												
											</div>
											
											

											<div class="form-group">
												<div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
													<center>
														<br />
														<button class="btn btn-primary" type="reset">Resetar</button>
														<button type="submit" class="btn btn-success">Cadastrar</button>
												</div>
											</div>
				<!-- footer content -->
				<footer>
				<div class="pull-right">
					Copyright © Painel de Controle Mostra Tecnológica Utramig 2018 - <a
						href="http://utramig.mg.gov.br/" target="_blank">UTRAMIG</a>
				</div>
				<div class="clearfix"></div>
				</footer>
				<!-- /footer content -->
										</form>
									</div>
								
				<!-- /page content -->






				
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
				<script
					src="componentes/vendors/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js"></script>
				<!-- validator -->
				<script src="componentes/vendors/validator/validator.js"></script>
				<!-- Dropzone.js -->
				<script src="componentes/vendors/dropzone/dist/min/dropzone.min.js"></script>

				<!-- Custom Theme Scripts -->
				<script src="componentes/vendors/js/custom.min.js"></script>
				</body>
</html>