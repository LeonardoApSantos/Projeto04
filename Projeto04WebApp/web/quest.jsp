<%-- 
    Document   : test
    Created on : 09/11/2018, 10:24:09
    Author     : Leona
--%>

<%@page import="java.util.Calendar"%>
<%@page import="br.com.projeto4.Test"%>
<%@page import="br.com.projeto4.Db"%>
<%@page import="br.com.projeto4.Question"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
        <%@include file="WEB-INF/jspf/bootstrapHead.jspf"%>
        <title>Gamer Quiz | Quiz</title>
    </head>
    <body>
        <!--***********Declaração de Variáveis e Checagem de Sessão***********-->
        <%
        double resultado = 0;
        int contadorQuest = 1;
        if(session.getAttribute("usuario")==null){
            response.sendRedirect("home.jsp");
        }
        %>
        <!--***********Banner do Site***********-->
        <div class="imagem">
            <img src="imgs/BannerGames.png" class="img-responsive"/>
        </div>
        <!--***********Navegador do Site***********-->
        <nav id="cabecalho" class="navbar">
            <div class="container">
                <div class="text-center">
                    <h1 class="text-muted text-center">Quiz</h1>
                </div>
            </div>
        </nav>
        
        <!--<h4><a href="home.jsp">Voltar</a></h4>-->
        <%if(request.getParameter("enviar_test")!=null){
            int sum=0;
            for(Question q: Db.getTest()){
                String userAnswer = request.getParameter(q.getQuestion());
                if(userAnswer.equals(q.getAnswer())){
                    sum++;
                }
            }
            resultado = 10*((double)(sum)/10);
            Db.getTestes().add(new Test(session.getAttribute("usuario").toString(), sum, Calendar.getInstance()));
            %>
            
            <div class="container">
                <div class="row">
                    <div class="col-sm-4"></div>
                    <div class="col-sm-4 borda">
                        <h3 class="text-center">Teste realizado com sucesso!</h3>
                        <h1 class="text-center">Nota: <%=resultado%></h1>
                        <a href="home.jsp" role="button" class="btn botao" id="btnVoltar">Voltar</a>
                    </div>
                    <div class="col-sm-4"></div>
                </div>
            </div>
        <%}else{%>
        <div class="container">
            <div class="row">
                <div class="col-sm-12 borda">
                    <form class="form-group">
                        <%for(Question q: Db.getTest()){%>
                        <h3>Questão <%=contadorQuest%>: <%=q.getQuestion()%></h3>
                            <%for(int i=0; i<q.getAlternatives().length; i++){%>
                            <div id="alternativas">
                                <input 
                                    type="radio" required
                                    name="<%=q.getQuestion()%>" value="<%=q.getAlternatives()[i]%>"
                                    /><%=q.getAlternatives()[i]%>
                            </div>
                            <%}
                            contadorQuest++; 
                            %>
                            <hr>
                        <%}%>
                        
                        <div class="col-sm-2"></div>
                        <div class="col-sm-4">
                            <input type="submit" value="Enviar" name="enviar_test" class="btn botao" id="btnEnviar">
                        </div>
                        <div class="col-sm-4">
                            <a href="home.jsp" role="button" class="btn botao" id="btnVoltar">Voltar</a>
                        </div>
                        <div class="col-sm-2"></div>
                    </form>
                </div>
            </div>
        </div>
        <%}%>
    </body>
</html>
