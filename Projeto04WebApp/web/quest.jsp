<%-- 
    Document   : teste_exibicao_provisorio
    Created on : 03/11/2018, 13:04:09
    Author     : Desktop
--%>

<%@page import="br.com.projeto4.Db"%>
<%@page import="br.com.projeto4.Question"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
        <%@include file="WEB-INF/jspf/bootstrapHead.jspf"%>
        <title>Teste - 26/10</title>
    </head>
    <body>
        <!--***********Declaração de Variáveis e Checagem de Sessão***********-->
        <%
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
        
        
        <% if (request.getParameter("enviar_test") != null){
            int sum = 0;
            for (Question q: Db.getTest()){
                String userAnswer = request.getParameter(q.getQuestion());
                if(userAnswer.equals(q.getAnswer())){
                    sum++;
                }
            } %>
        <hr><hr>
        <h1 style="color:blue">
            Nota: <u><%= 100*((double)(sum)/10.0) %></u>
        </h1>
        <% } %>
        <div class="container">
            <div class="row">
                <div id="blocoConteudoQuest" class="col-sm-12 borda blocoConteudo">
                <h2>Test</h2>
                <form method="POST" class="form-group">
                    <%for(Question q: Db.getTest()){ %>
                        <h3>Question <%=contadorQuest%> : <%= q.getQuestion() %></h3>
                            <% for(int i=0; i<q.getAlternatives().length; i++){ %>
                            <div id="alternativas">
                                <input type="radio" required name="<%= q.getQuestion() %>" value="<%= q.getAlternatives()[i] %>" ><%=q.getAlternatives()[i] %>
                            </div>
                            <% } 
                            contadorQuest++; 
                            %>
                            
                            <hr>
                            
                    <% } %>
                    <div class="col-sm-6">
                        <input type="submit" value="Enviar" name="enviar_test" class="btn" id="btnLogin">
                    </div>
                    <div class="col-sm-6">
                        <a href="home.jsp" role="button" class="btn" id="btnLogin">Voltar</a>
                    </div>
                    <!--<input type="submit" name="enviar_test" value="Enviar"/>
                    <a href="home.jsp" role="button">Voltar</a>-->
                </form>
                </div>
            </div>
        </div>
    </body>
</html>
