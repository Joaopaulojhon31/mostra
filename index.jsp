<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta charset="utf-8">
<title>Mostra Tecnológica Utramig</title>

<!-- Bootstrap -->
<link rel="shortcut icon" type="favicon.ico" href="componentes/imagens/ico.ico" />
<link rel="stylesheet" href="componentes/css/bootstrap.css">
<link rel="stylesheet" href="componentes/css/footer.css">
<link rel="stylesheet" href="componentes/dist/assets/owl.carousel.min.css">
<link rel="stylesheet" href="componentes/dist/assets/owl.theme.default.min.css">
<link rel="stylesheet" href="componentes/css/bootstrap-social.css">
<link rel="stylesheet" href="componentes/css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
<link rel="stylesheet" href="componentes/css/custom.css">  
<link rel="stylesheet" href="componentes/css/stilo.css"> 
</head>
<body>
    
    <!-- menu -->

	     <jsp:include page="menu.jsp"/>
  
  
   <!-- CAROUSEL --> 

   <br><br><br>
   
<div class="owl-carousel owl-theme">
	<div class="item"><img src="componentes/imagens/slide0.jpg" style="width: 100%;"></div>
    <div class="item"><img src="componentes/imagens/baner1.jpg" style="width: 100%;"></div>
	<div class="item"><img src="componentes/imagens/baner2.jpg" style="width: 100%;"></div>
	<div class="item"><img src="componentes/imagens/baner3.jpg" style="width: 100%;"></div>
  <div class="item"><img src="componentes/imagens/baner4.jpg" style="width: 100%;"></div>
	
</div>

  
    

   <!-- EVENTOS E NOTÍCIAS --> 


<h2 class="text-center">EVENTOS E NOTÍCIAS</h2>
<div class="container">
  <div class="row text-center">
    <div class="col-sm-4 col-md-4 col-lg-4 col-xs-6">
      <div class="thumbnail"> <img src="componentes/imagens/mostratecnologica.jpg" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>Sobre a Mostra</h3>
          <h5>1º Semestre 2017</h5>
          <p><center><a href="mostra.jsp" class="btn btn-primary" role="button"><i class="fa fa-book"></i>&nbsp;Continue Lendo...</center></a></p>
        </div>
      </div>
    </div>
    <div class="col-sm-4 col-md-4 col-lg-4 col-xs-6">
      <div class="thumbnail"> <img src="componentes/imagens/Analises/capa.jpg" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>Analises Clinicas</h3>
          <h5>1º Semestre 2017</h5>
          <p><center><a href="tabelaAnalises.jsp" class="btn btn-primary" role="button"><i class="fa fa-book"></i>&nbsp;Continue Lendo...</a> </p>
        </div>
      </div>
    </div>
    <div class="col-sm-4 col-md-4 col-lg-4 col-xs-6">
      <div class="thumbnail"> <img src="componentes/imagens/Eletronica/capa.jpg" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>Eletrônica</h3>
          <h5>1º Semestre 2017</h5>
          <p><center><a href="tabelaEletronica.jsp" class="btn btn-primary" role="button"><i class="fa fa-book"></i>&nbsp;Continue Lendo...</a> </p>
        </div>
      </div>
    </div>
  </div>
  <div class="row text-center hidden-xs">
    <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
      <div class="thumbnail"> <img src="componentes/imagens/Seguranca/capa.jpg" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>Segurança do Trabalho</h3>
          <h5>1º Semestre 2017</h5>
          <p><center><a href="tabelaSeguranca.jsp" class="btn btn-primary" role="button"><i class="fa fa-book"></i>&nbsp;Continue Lendo...</a> </p>
        </div>
      </div>
    </div>
    <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
      <div class="thumbnail"> <img src="componentes/imagens/Teleco/capa.jpg" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>Telecomunicação</h3>
          <h5>1º Semestre 2017</h5>
          <p><center><a href="tabelaTeleco.jsp" class="btn btn-primary" role="button"><i class="fa fa-book"></i>&nbsp;Continue Lendo...</a> </p>
        </div>
      </div>
    </div>
    <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
      <div class="thumbnail"> <img src="componentes/imagens/Informatica/capa.jpg" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>Informática</h3>
          <h5>1º Semestre 2017</h5>
          <p><center><a href="tabelaInformatica.jsp" class="btn btn-primary" role="button"><i class="fa fa-book"></i>&nbsp;Continue Lendo...</a> </p>
        </div>
      </div>
    </div>
  </div>
  <div class="row text-center hidden-xs">
    <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
      <div class="thumbnail"> <img src="componentes/imagens/MeioAmbiente/capa.jpg" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>Meio Ambiente</h3>
          <h5>1º Semestre 2017</h5>
          <p><center><a href="tabelaMeio.jsp" class="btn btn-primary" role="button"><i class="fa fa-book"></i>&nbsp;Continue Lendo...</a> </p>
        </div>
      </div>
    </div>
    <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
      <div class="thumbnail"> <img src="componentes/imagens/Enfermagem/capa.jpg" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>Enfermagem</h3>
          <h5>1º Semestre 2017</h5>
          <p><center><a href="tabelaEnfermagem.jsp" class="btn btn-primary" role="button"><i class="fa fa-book"></i>&nbsp;Continue Lendo...</a></p>
        </div>
      </div>
    </div>
  </div>
</div>



<!-- RODAPÉ -->  

<jsp:include page="rodape.jsp"/>
	
<!-- LINKS PARA CHAMAR OS JAVASCRIPTS --> 


<script src="componentes/js/jquery-1.11.3.min.js"></script>
<script src="componentes/js/bootstrap.js"></script>
<script src="componentes/dist/owl.carousel.min.js"></script>
<script>
   $('.owl-carousel').owlCarousel({
    loop:true,
    margin:10,
    nav:true,
	dots: true,
	autoplay:true,
    autoplayTimeout:5000,
	responsive:{
        0:{
            items:1
        },
        600:{
            items:1
        },
        1000:{
            items:1
        }
    }
})
</script>
</center>
</body>
</html>