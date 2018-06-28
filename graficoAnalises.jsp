<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    <title>Gráfico das Votações</title>

    <!-- Bootstrap -->
    <link href="componentes/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet" />
    <!-- Fontes -->
    <link href="componentes/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet"  />
    <!-- NProgress -->
    <link href="componentes/vendors/nprogress/nprogress.css" rel="stylesheet" />
    <!-- jQuery custom content scroller -->
    <link href="componentes/vendors/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.min.css" rel="stylesheet"/>
	<script src="componentes/js/Chart.js"></script>
	<script src="componentes/js/jquery.min.js"></script>


    <!-- Custom Theme Style -->
    <link href="../build/css/custom.min.css" rel="stylesheet">
  </head>
  <jsp:include page="menu.jsp"/>


        <!-- page content -->
        <div class="right_col" role="main">
          <div class="">
            <div class="page-title">
              <div class="title_right">
                <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                  <div class="input-group">    
                 </div>
                </div>
              </div>
            </div>
            <div class="clearfix"></div>
            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12" >
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Votaçao Dos projetos</h2>

                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content" >
                    <div class="chart-container" style="position: relative; height:90vh; width:80vw">
					<canvas id="Chart"></canvas>
                            <script>
                                var ctx = document.getElementById("Chart").getContext('2d');
                                var myChart = new Chart(ctx, {
                                    type: 'pie',
                                    data: {
                                        labels: ["Coleta de Sangue", "Lavar Mãos", "Conscientização", "Teste da Saliva", "Microoscópio", "Documentação Clínica", "Documentação Clínica", "Consulta Online", "Experimentos"],
                                        datasets: [{
                                            label: 'Número de votos',
                                            data: [12, 19, 3, 5, 2, 3, 6, 8, 32],
                                            backgroundColor: [
                                                'rgba(255, 99, 132, 0.2)',
                                                'rgba(54, 162, 235, 0.2)',
                                                'rgba(255, 206, 86, 0.2)',
                                                'rgba(75, 192, 192, 0.2)',
                                                'rgba(153, 102, 255, 0.2)',
                                                'rgba(255, 159, 64, 0.2)',
                                                'rgba(102, 0, 255, 0.2)',
                                                'rgba(0, 77, 0, 0.2)',
                                                'rgba(179, 0, 71, 0.2)',
                                                'rgba(204, 51, 0, 0.2)'
                                            ],
                                            borderColor: [
                                                'rgba(255,99,132,1)',
                                                'rgba(54, 162, 235, 1)',
                                                'rgba(255, 206, 86, 1)',
                                                'rgba(75, 192, 192, 1)',
                                                'rgba(153, 102, 255, 1)',
                                                'rgba(255, 159, 64, 1)',
                                                'rgba(102, 0, 255, 1)',
                                                'rgba(0, 77, 0, 1)',
                                                'rgba(179, 0, 71, 1)',
                                                'rgba(204, 51, 0, 1)'
                                            ],
                                            borderWidth: 1
                                        }]
                                    },
                                    });
                        </script>

                      </div>
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
    
	<jsp:include page="rodape.jsp"/>
	
    <!-- jQuery -->
    <script src="componetes/js/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="componetes/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="componetes/vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="componetes/vendors/nprogress/nprogress.js"></script>
    <!-- jQuery custom content scroller -->
    <script src="componetes/vendors/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js"></script>
    <!-- Custom Theme Scripts -->
    <script src="componetes/vendors/js/custom.min.js"></script>
  </body>
</html>
