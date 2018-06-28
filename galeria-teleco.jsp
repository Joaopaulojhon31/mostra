<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta charset="utf-8">
<title>Galeria</title>

<!-- Bootstrap -->
<link rel="shortcut icon" type="favicon.ico" href="componentes/imagens/ico.ico" />
<link rel="stylesheet" href="componentes/css/bootstrap.css">
<link rel="stylesheet" href="componentes/css/footer.css">
<link rel="stylesheet" href="componentes/css/bootstrap-social.css">
<link rel="stylesheet" href="componentes/css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
<link rel="stylesheet" href="componentes/css/custom.css">  
<link rel="stylesheet" href="componentes/css/stilo.css"> 
<link rel='stylesheet' href='componentes/unitegallery/css/unite-gallery.css' type='text/css' />
<link rel='stylesheet' href='componentes/unitegallery/themes/default/ug-theme-default.css' type='text/css' />

</head>
<body>
    
	<!-- menu -->
	
	<jsp:include page="menu.jsp"/>
  <br><br><br>

	<center>
	<div id="gallery" style="display:none;">
	
		<img alt="Telecomunicações"
			 src="componentes/imagens/Teleco/big-tel1.jpg" height="11%" width="11%"
			 data-image="componentes/imagens/Teleco/big-tel1.jpg"
			 data-description="Telecomunicações">
		<img alt="Telecomunicações"
			 src="componentes/imagens/Teleco/01.jpg" height="11%" width="11%"
			 data-image="componentes/imagens/Teleco/01.jpg"
			 data-description="Telecomunicações">
		<img alt="Telecomunicações"
			 src="componentes/imagens/Teleco/02.jpg" height="11%" width="11%"
			 data-image="componentes/imagens/Teleco/02.jpg"
			 data-description="Telecomunicações">
		<img alt="Telecomunicações"
			 src="componentes/imagens/Teleco/03.jpg" height="11%" width="11%"
			 data-image="componentes/imagens/Teleco/03.jpg"
			 data-description="Telecomunicações">
		<img alt="Telecomunicações"
			 src="componentes/imagens/Teleco/04.jpg" height="11%" width="11%"
			 data-image="componentes/imagens/Teleco/04.jpg"
			 data-description="Telecomunicações">
					 
	</div>
</center>
<br><br>
<center>
<a href="galeria.jsp" class="btn btn-lg btn-default"><span class="glyphicon glyphicon-chevron-left"></span> Voltar</a>
</center>
<br><br>

<!-- RODAPÉ -->  

<jsp:include page="rodape.jsp"/>
	
<!-- LINKS PARA CHAMAR OS JAVASCRIPTS --> 


<script src="componentes/js/jquery-1.11.3.min.js"></script>
<script src="componentes/js/bootstrap.js"></script>
<script type='text/javascript' src='componentes/unitegallery/js/ug-common-libraries.js'></script>	
	<script type='text/javascript' src='componentes/unitegallery/js/ug-functions.js'></script>
	<script type='text/javascript' src='componentes/unitegallery/js/ug-thumbsgeneral.js'></script>
	<script type='text/javascript' src='componentes/unitegallery/js/ug-thumbsstrip.js'></script>
	<script type='text/javascript' src='componentes/unitegallery/js/ug-touchthumbs.js'></script>
	<script type='text/javascript' src='componentes/unitegallery/js/ug-panelsbase.js'></script>
	<script type='text/javascript' src='componentes/unitegallery/js/ug-strippanel.js'></script>
	<script type='text/javascript' src='componentes/unitegallery/js/ug-gridpanel.js'></script>
	<script type='text/javascript' src='componentes/unitegallery/js/ug-thumbsgrid.js'></script>
	<script type='text/javascript' src='componentes/unitegallery/js/ug-tiles.js'></script>
	<script type='text/javascript' src='componentes/unitegallery/js/ug-tiledesign.js'></script>
	<script type='text/javascript' src='componentes/unitegallery/js/ug-avia.js'></script>
	<script type='text/javascript' src='componentes/unitegallery/js/ug-slider.js'></script>
	<script type='text/javascript' src='componentes/unitegallery/js/ug-sliderassets.js'></script>
	<script type='text/javascript' src='componentes/unitegallery/js/ug-touchslider.js'></script>
	<script type='text/javascript' src='componentes/unitegallery/js/ug-zoomslider.js'></script>	
	<script type='text/javascript' src='componentes/unitegallery/js/ug-video.js'></script>
	<script type='text/javascript' src='componentes/unitegallery/js/ug-gallery.js'></script>
	<script type='text/javascript' src='componentes/unitegallery/js/ug-lightbox.js'></script>
	<script type='text/javascript' src='componentes/unitegallery/js/ug-carousel.js'></script>
	<script type='text/javascript' src='componentes/unitegallery/js/ug-api.js'></script>
	
	<script type='text/javascript' src='componentes/unitegallery/themes/default/ug-theme-default.js'></script>
	
	
<script type="text/javascript">

		jQuery(document).ready(function(){

			jQuery("#gallery").unitegallery();

		});
		
	</script>


</body>
</html>