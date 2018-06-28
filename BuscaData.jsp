<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<html lang="en">
<head>
  <title>Busca por datas de projetos</title>
  
  <!-- Bootstrap -->
<link rel="shortcut icon" type="favicon.ico" href="componentes/imagens/ico.ico" />
<link rel="stylesheet" href="componentes/css/bootstrap.css" />
<link rel="stylesheet" href="componentes/css/footer.css" />
<link rel="stylesheet" href="componentes/css/bootstrap-social.css" />
<link rel="stylesheet" href="componentes/css/font-awesome.min.css" />
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet" />
<link rel="stylesheet" href="componentes/css/custom.css" />  
<link rel="stylesheet" href="componentes/css/stilo.css" />
</head>

<body>
<div>
<%-- 	<jsp:include page="menu.jsp"></jsp:include> --%>
	
		<div class="container">
		  <h2>Selecione as Datas:</h2>
		  <br />
		 
			  <form class="form-inline" action="BuscaData" method="post">
			    	<div class="form-group">
				     	<label for="email">Data 1:</label>
				      	<input type="number" class="form-control" id="data1"  name="data1"/>
				    </div>
				    <br /><br  />
				    <div class="form-group">
				      <label for="pwd">Data 2 :</label>
				      <input type="number" class="form-control" id="data2"  name="data2"/>
				    </div>
				    <br /><br />
				    <button type="submit" class="btn btn-default">Buscar</button>
			  </form>
			  
		</div>  

  </div>
  
   <br /><br /> <br /><br />
<jsp:include page="rodape.jsp"/>

</body>
</html>