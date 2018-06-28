<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" type="favicon.ico" href="componentes/imagens/ico.ico" />
    <title>Retonar Grupo</title>

    <jsp:include page="menuUsuario.jsp" />
    
      
            <div class="clearfix"></div>
            <div class="row">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Lista de<small>Grupos deletados</small></h2>
                    
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <p class="text-muted font-13 m-b-30">
                     Lista De Grupos
                    </p>

 	<jsp:useBean id="dao" class="dao.RetornarGrupoDao"/>
	<table id="datatable-responsive" class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
                      <thead>
                        <tr>
                          <th>Código Grupo</th>
                          <th>Código Mostra</th>
                          <th>Descriçao</th>
                          <th>Lider Do projeto</th>
                         <th>Codigo Do Aluno</th>
                          <th>Data De Cadastro</th>
                            <th>Retornar</th>
                        
                        </tr>
                      </thead>
					<tbody>
				
					<c:forEach var="item" items="${dao.lista}">
                        <tr>
							<c:url value="retornarGrupo.jsp" var="urlRetornar">
							<c:param name="codgrupo" value="${item.codgrupo}" />
							<c:param name="codAluno" value="${item.codAluno.codAluno}" />
							<c:param name="codmostra" value="${item.codmostra}" />
							<c:param name="desc" value="${item.desc}" />
							<c:param name="liderProjeto" value="${item.liderProjeto}" />
							<c:param name="dataAltCadas" value="${item.dataAltCadas}" />
							
							
							<%-- <c:param name="Data_alt_cadas_direttor" value="${item.Data_alt_cadas_direttor}" /> --%>				
						</c:url>
						<td><c:out value="${item.codgrupo}"></c:out></th>
						<td><c:out value="${item.codmostra.codMostra}"></c:out></th>						
						<td><c:out value="${item.desc}"></c:out></th>
						<td><c:out value="${item.liderProjeto}"></c:out></th>
						<td><c:out value="${item.codAluno.codAluno}"></c:out></th>
						<td><c:out value="${item.dataAltCadas}"></c:out></th>
					
					
													<td><a href="${urlRetornar}"><img src ="data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxIQDw8NDxANDQ0NDQ8NDQ0NDw8PDQ0NFREWFhURFRUYHSggGBomHRUVITEhJjUrLi4vFx8zODMsNygtLisBCgoKDg0OGxAQGisiICYtLzAuLS0vMS8rLS0tLSstListLS0tLS8rLS0tKy0wLS0tLS0rKy0rLS0tLS0tLS0tLf/AABEIAK8BIAMBEQACEQEDEQH/xAAbAAEAAQUBAAAAAAAAAAAAAAAABQECAwQGB//EAD8QAAIBAwEFBQQGCAYDAAAAAAABAgMEEQUSITFBUQYTYXGBIjJSkSNCgqGxwTM0YnODkrPRBxQVU3LwQ2Ph/8QAGwEBAAIDAQEAAAAAAAAAAAAAAAEFAgMEBgf/xAA5EQEAAQMBBQUGBAYBBQAAAAAAAQIDEQQFEiExQRMyUXGRYYGhsdHwFDNC4RUiNFKywXIGI0NTYv/aAAwDAQACEQMRAD8A9xAAAAEVresxt47KxKs/dhyXiyt1+0KNNTiONXSPq32bM3J9jLoFeVS2p1JtynJ1G2/3kjZs27Xd01Ndc5mc/OUX6YprmI++CQO5pAAACjWSJjIqSAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABFa7q6t4YWJVpr2I/Cvifh+JW7R2hTpacRxqnlH+5++LfYszcn2OFq1ZTk5yblKTy2+LZ42u5VXVNVU5mVnEREYh3XZj9UpfxP6kj2WyP6Oj3/5SrNT+bP30SpZNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABp6pfxoU3UlvfCMecpdDl1eqp01ua6vd7ZbLdua6sQ8/uriVWcqk3mUnl+HgvA8PevVXq5rr5ytaaYpjEMJrZO97L/qlH+J/Uke02R/R0e//AClV6n82fvolSyaAAAAAAAAAAAAcbrWo3NCvOCqvYft08xj7j5cOW9HmdbqtVp7007/DnHCOXp7l1prFi7bird49WtDtHc/FF+cEcsbW1UdY9G2dDZ8GxHtNcf8Aqf2X/cy/jep/+fT92udn2fayx7T1ucKb+aM427f60wxnZ1vxlkXaqfOlB/af9jZG36/7I9f2Y/w2n+5fHtW+dH5SM42/PWj4sZ2bHSplj2qjzpT9JI2Rt+31on4MZ2bV0qheu1NPnTqL5Gcbes/2z8GM7Or8YZI9pqPNVF9nJsp25pp55j3MJ2fd9jIu0VDrNecGZxtrSeM+jH8Be9jJHXqD+vjzTM42vpJ/UxnRXvBlWsUP92H3m3+JaT/2Qx/C3v7ZXx1Oi+FWHzM41+mnlXDGdPdj9Mskbym+FSn/ADRNsamzPKuPVjNquP0yvVxD44P7SMu2tz+qPVjuVeEr1JPg0/JmcVRPKUTEwqSgAAAKN4WXuS3t+BEzjjI4DXdSdxVbT+jhmNNeHxep4naOsnU3cx3Y5fVa2LW5T7UacDcAd72X/VKP8T+pI9psj+jo9/8AlKr1P5s/fRKlk0AAAAAAAAAABRgQHaq07yltr36W9eMXxX/ehU7X03aWd+OdPy6u7QXty5uzylyUInkZldyzRia5ljleoGO8jKvdkbxlXuiN4yr3Q3zJ3RG+jKvdDfMq9yRvmTuhvmVrpE7xlR0yd5OVHAnMGVriZRKVqznCby9y3s201VTOImScRxl2WmYpUo085aWZNvOZPie70djsLNNE8+vm87fudpXNTfhVydLUypgVAgO1t/3dJUYv2q3vdVTXH58PmUu2tV2drsqedXy/d1aW3vVb09HGHk1iAAO97L/qlH+J/Uke02R/R0e//KVXqfzZ++iVLJoAAAAAAAAAACkgI6+4MiYzGJInDja1LZm48s5XkeE1+n/D3po6dPJ6Kxd7S3FS6CK+ZbJZYxMJlivUDGZRlcomOTKuyMoV2SMhsjIrgZFMDIo4k5FjiZRKcrGjLKWOSM4lLXqXUacot4zxS/Mvdiabtb3aTyp+fT0+jj117do3Y5z8kjZ6rnmevUyfsrjIEpSYGUDzzXLvvbic/qp7Ef8Aitx4baN/ttRVV0jhHuW1mjdoiGgcTaAAPQez1JwtaMZLEsSljwlJyX3NHt9l26rekopq5/WZlVX5ibkzCRO9pAAAAAAAAAACjA07yGUwOT1KniWSj25pu0s9rHOn5fs7tBd3a9yevzYYRPGzK3lmijXMsWRIxQEAAAAAAACjRMDFI2QyYaskk23hJNt9EbKYmZxCc4ee3etOtXnNP2c7MF+yuB9A0GljTWIo68581BqLvaXJqT+jV28HY0u90l7kB0NBbgMWq1+7oVZ81B483uObWXeysVV+ENlqneriHnB4JbgACU7O2HfV1lZp0/bn0fSPq/wLHZel/EX4zyjjP+oab9zco9rvj2qqAAAAAAAAAAAAA0dRvadNe3JbXKK3yfoceq19jTR/3KuPh19G61Yrud2HMXlx3j3R2Y+O9nmNbty5eiaLcbtM+qxtaKmic1TmWOMSgmXZlkSMUBAAAAAAAAAGSMMzZDKHI9vtW7mgqEH9LcZW7jGmvef4L1L7Yek7W92lXKn5uPW3dyjdjnLidMpttHslM9A7P2r3BL0HSqGEgJumgIftdUxbNfFOK+/JUbarxppjxmHTpYzccQeQWQAA7rstZ93QUmvaqvbflyR7LZGn7LTxM86uKs1Ne9XjwTBaOcAAAAAAAAAANO+1OlR9+S2uUFvk/Q5NTrrOnj+erj4dW+1p7lzuw5+81+pUzGmu6h14zfryPNavbd25/Lb/AJY+P7LK1oaKONXGfgj4wy8vLb3tve2yhrrmZzLr5cIZYxNUyxXYMQAAAAAAAAAAKSJga9aaScm0kk22+CS4s20RMziGXJ49rWoO7up1t+xnYpLpTXD58fU+h6DSxprEW+vXzUF+72lc1JnQ7PLW47Gp6RoNnhLcB2NpSwkBuICA7Z/oIfvV+DKPb35FP/L/AFLr0nfnycaeVWABltKPeVIU19eaj82bbFvtLlNHjLGqrdpmXpdOCilFcIpJeSPoFNMUxEQp5nPFcSgAAAAAAAA0L/WKNHdKW1L4Ie1L/wCepxanaFixwqnM+Ec/vzdFrS3LvKOHi5u+7Q1auYw+hh+zvqNeMuXoed1O2b1zhR/LHs5+v0WlrQ26ONXGfgjYQy8vLb4t72ymrrzOZdeWzTgc9VTCZZkjXMsVSAAAAAAAAAAAAFs2ZQQ47/ELVe6t/wDLxf0ly9l44qive+fD1Z6DYWk7W/2k8qfn09Ofo5Nbd3aN2Oc/Jw2mW+Wj2and/wBnrHhuCXoWlW2EgJynHAGQCH7T0FOilKWx7a2ZP3drkn0XiVe17VNyxiZxx4T0z7XTpc7/AAjLia9GUJOE04yXJ9Oq6o8hct1W6t2qMSsYmJjMMZglL9lqW1dQfKEZT+7C+9lnseje1UeyJlo1M4ty7s9mqwAAAAAKSkkstpJcW3hIiqqKYzM4TETPCERe9oaVPdHNWXSHu/MqtRtixa4U/wA0+z6uy1oblfPggL3Wq1XKz3UPhhufzKHU7Wv3uGd2PZ9Vja0dq3xxmfaj40irmt05ZoUjXNaJlmjA1zUxyypGuZYqkAAAAAAAAAAAADZMDBWmkm28JJtvojZTTMziEvHtd1F3d1Or9RPYpLpTXB+vE+h7P0saaxFHXnPmotRd7SuZS+h2eWtx2tL0jQbPCW4DsbSlhIDcQFQI/XaO3b1Y81HaXmt5w7Stdppq49mfR0aWvdu0y46jc+yqdSKq01wjLdKH/CXGPlw8Dx1GpmKdyuN6nwnp5T0+XsXVyzFU5jhP3zWVLGMt9Kef2KnszXrwZl2Vqv8AKq91XCfXlLnmK6e9HoluyNvKFeo5xccUsLK3ZclzLfYlmui/VvRjh/tyaqqJojHi63J6ZwKgAMdStGPvSjHzaRrru0UcapiGVNFVXKGhca7Rhwk5vpBZ+/gV97bGlt/q3vL7w6aNFdq6Y80Xc9o6j3UoKC+KftS+XAqL/wD1BcnhapiPbPGfp83Xb2fRHfnKJuKtSq81Jyn4N+yvJcEUt7V3b05uVTP34codtFFFHdjCyNE55rZZXqkYzWjK9UzGakZXqJjlGV2CAIAAAAAAAAAAAAALJsziEw5D/EDVu6t+4g8VbnMd3GNJe8/wXqX+w9H2t7tKuVPz6OTW3dyjdjnLhNMt8tHs1M7/ALP2PDcEvQtKtsJATtKOAMgADDX4NPg00/IiYzGJTE4nLgq1LYnKHwya9D59qLU2rlVE9Jekt179EVeKsUcspZ6U5R92Uo+TZlRqLlvuVTHva6qaaucNmOoVlwqT9d51U7V1cf8AklqnTWp/SpPVK/8Auy9MGf8AFtVP65TGls/2sFS7rS96rUf2sGuvX6ivvVyzps2qeVMMPdt72234ts5a7s1cZnLZmI5MkaRqmtGWRUzHeRlVRIyjKuCMiuCAAAAAAAAAAAAAAAAAWyZlEDBWqJJttJJZbfBLqbaaZnhDJ4/reoO7uqlbfsZ2KKfKlHh8979T6FoNLGmsU0dec+f7clDqLva3Jq6dEvodnlrcdjQ9I0GywluCXY2dLCA3UBUABguOAHIa3SxV2/iWH5o8nt2xuXYuxyq+cLjZ9zNE0eDWpo87U7ZZ4xNUyxXbJGUKOJORTYJynK5RMcoVIAAAAAAAAAAAAAAAAAAAAKNkwMVSRsphlDku3mq91b9zF/SXHseKp/Wf5epe7F0na3t+eVPH39HJrbu5b3Y5y4XTLfLR7NSu/wCz1jw3BL0LSrbCQE7SjhAZAAADFWW4DnNao5T8N6OLaGl/E2Jojnzjzj68m/T3eyuRV6omkz59XExOJXrYiaZYqkAAAAAAAAAAAAAAAAAZJFrkTgwt2icJwqpEYF6ZCAgUbJGOcjOITENWtUxlvgt78jfRTlnDybXdQd1dTqLfTi9il02Fz9ePyPe7P0v4exFPXnPmoNTd7W5M9OiW0Ozy0drQ9I0GywluA7GzpYQG6gKgAAFs0BE6lRymBzEvZm4v0PI7c0G5X29EcJ5+yf3W2iv71O5POGeEjzcw7ZX5MEAAAAAAAAAAAAAMk4FrkTgwtcyYpThZKoZRSnDHKoZxSnC3vCd1OFyq4WW8JcW+CI3UTCttdwqJunOFRJ7LcJKST6ZRFyzXROKomPNhExPKWbbNeE4UlMmIMMFSZtphnEOT7c6r3VDuovFW4zBY4xpr3pfel6l5sbSdre355U8ff0cmuvblvdjnLitNt8tHsFG77s9Y8NwS9D0m2wkBO0o4AyAAAAABq3VPKA5TWbV8Vua3pmFy3TcpmiqMxKaappnMI61us7nukuK/M8NtHZ1Wlr8aZ5T/AK815p78Xqfa241CrmlvwuUzHdRhcpEYRhXaIwK5GAyAyMCm0MBtDBhTbJwYUcyd1OFrqE7phY6plFCcMcqpnFDLDG6plFCcNe4vIQWZzjBLfmTSNtuzVXOKYyiqaaeMzhz9/wBtbanlQcq8ulJez/M9xaWdi6ivvRux7fo5LmutU8uPk5697c3E8qjCnQXxP6Sfnv3L5MtrOwrFPG5M1fCPr8XHc2hcnuxEfFBXd5XrvNarVq+EpPYXlHgvQtLWms2fy6Yj3cfXm467tdfemZdH/h/fOjXlQk8U7hbuirLh81u9EVW3NJ2tntY50/L9nVobu7Xuzyn5vR1M8durjCkpkxCcMFWeE29yW9vwNtNKXlWuX7urqdX6kfo6S6U4v83l+p7rQab8PYinrznzef1N3tbkz06JfRLPLW47XO9H0GywluCXZWdLCQG6kBUAAAAALJxAidRtspgcVrFlKL245UlwaNd21RdpmiuMxLKmuaZzS07XWFnYq4pz4JvdCXryZ5TXbGrtZqtfzU/GPqt7Gtpr4V8J+CUVYpZod2F6rGO4jC9VjHcRhd3pG4YO+G4YU74bhhR1idwwtdYncTha6xO4YWusZRQnCx1jKKE4R19r1vRyqtenFr6m1tT/AJY5Z12dDfu9yiZ+XrPBqrv2qO9VCAve3dJZVGnUqv4p4hHz5t/cWlnYVyeNyqI+Ljr2jRHdjKAve1t1V3RlGjF8qa3/ADe8tLOx9Nb5xvebkua67Vy4eSIqKdR5nKc3xzJtllRRTRGKYw5Kqpq5yyUrJvkZMW7R01vkBI2+jvoEtyGkSjiSypRakmuKa3pkVUxVExPKSJmJzDsrS424Rk9za9pdJczwWr002L1VuenLy6PR2bna0RUyuZz7rbhznbTVO5t3Ti8VK+YLqofWf5epb7J0na3t6eVPH39HHrr3Z28RzlxWm2+Wj16id92fseG4JehaTbYSAnqUcIDIAAAAAAAwMFankCC1OxynuA4jWdJ47gOdVzXt3iEtqC+pPfFLw5o4dTs6xf41RifGHRZ1Vy1wieHg3KHa2HCrCdN83H24/wBymvbDuR+XMT8Fhb2jRPfjCToa9bz92tDPRvD+8rrmztRRzol1U6mzVyqhtwvYPhUpvynF/mc82K450z6NsVUzymF/+YXVfMx7OfBlwWyu4rjOC85JExZqnlEo3qY6tetq9GO+Vakvtxf4G2nSXquVE+jCb1uOdUNCv2stY/8AlU/3acjqo2Tqav0482mrW2I6oy47dU1lU6VWfRvEY/3Oy3sK5PeqiGiraVEd2JlFXXbS5n+jhSpJ+c5Lybwd1vYtinvTM/BzV7Ruz3YiERc6hcVv0larJPc4qWzBrxjHCZYWtJYtdyiI+/GXJXfuV96qWvTtPA6GptUrBvkBvUNLb5BKSttGb5AS1roXgBL2ug+AEvbaIugG1PR1jgBF3Fq6bfTiUm2tNv0RdjnHPy/ZZbOvYqmievzYHM81urnDznX7t3FzKfGEPYp9Nlc/V/kez0Gm7CzFM854y85qr3a3Jnp0SOiWeWjtc70jQbPCW4DsrOlhIDdQFQAAAAAAAKNAa1ajkCF1DTs53Acpqmi5zuA5a/0XjuAg7nSX0CGjPT2uGV5bhPFLHK1n1l82Y7seBmWOVpJ8cvzyyYiIMqKwfQlDJGwfQDNDTX0A2aWlPoEt2jo76ASNvob6ASltoPgBLW2g+AEtbaKugEnb6UlyA36OnpcgNunaJAXVLdYAgdXs9zMa6IrpmmeUppqmmYmHEaupRpziuL9lPonxfy/E83otDP4qaauVHHz8Pr7lzqtXHYRNPOr7lyEbH2uB6ZSOr0Cw4bgl6FpNthICepRwgMgAAAAAAAAABRoDDUpZAj7mxT5AQt5pCedwELdaF4ARlfQPADTnoHgBj/0HwArHQfADPT0DwA2qWgeAG9R0HwAkKGiLoBIUNIXQDfo6YlyA3KVilyA2YWyQGaNJAXqIFQKSQEdfUcpgcfq+n5zuIxAg46X7XAkdHo9hjG4DrbOlhIDdSAqAAAAAAAAAAAAFriBhnQTA1qlknyA1qmnLoBhlpa6AWf6WugFVpa6AZI6YugGaGnroBnhYroBmhaoDLGigL1AC7AFQAAAAAw1oZAiruzzyA0I6dv4ASVpa4AlKUcIDIAAAAAAAAAAAAAAAApgBsgU2EBTu0A7tAV2UBXAFQAAAAAAAAAABSSAxSp5As7kDJGmBkQFQAAAAAAAP/9k=" height="20px" width="20px"></a></td>
			
						</tr>
				</c:forEach>
		</table>
		 </div>
			  </div>
			</div>
		</div>
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
    
    <!-- iCheck -->
    <script src="componentes/vendors/iCheck/icheck.min.js"></script>
    <!-- Datatables -->
    <script src="componentes/vendors/datatables.net/js/jquery.dataTables.min.js"></script>
    <script src="componentes/vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
    <script src="componentes/vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
    <script src="componentes/vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
    <script src="componentes/vendors/datatables.net-buttons/js/buttons.flash.min.js"></script>
    <script src="componentes/vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
    <script src="componentes/vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
    <script src="componentes/vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
    <script src="componentes/vendors/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
    <script src="componentes/vendors/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
    <script src="componentes/vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
    <script src="componentes/vendors/datatables.net-scroller/js/dataTables.scroller.min.js"></script>
    <script src="componentes/vendors/jszip/dist/jszip.min.js"></script>
    <script src="componentes/vendors/pdfmake/build/pdfmake.min.js"></script>
    <script src="componentes/vendors/pdfmake/build/vfs_fonts.js"></script>
    

  </body>
</html>