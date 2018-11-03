<%-- 
    Document   : teste_exibicao_provisorio
    Created on : 03/11/2018, 13:04:09
    Author     : Desktop
--%>

<%@page import="br.com.projeto4.Db"%>
<%@page import="br.com.projeto4.Question"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Teste - 26/10</title>
    </head>
    <body>
        <h1>Quiz</h1>
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
        <h2>Test</h2>
        <form>
            <% for(Question q: Db.getTest()){ %>
                <h3>Question: <%= q.getQuestion() %></h3>
                    <% for(int i=0; i<q.getAlternatives().length; i++){ %>
                    <input type="radio" name="<%= q.getQuestion() %>" value="<%= q.getAlternatives()[i] %>"><%=q.getAlternatives()[i] %>
                    <% } %>
                    <hr>
            <% } %>
            <input type="submit" name="enviar_test" value="Enviar"/>
            <a href="home_quest_provisoria.jsp" role="button">Voltar</a>
        </form>
    </body>
</html>
