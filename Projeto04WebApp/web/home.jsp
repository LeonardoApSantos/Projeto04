<%-- 
    Document   : home
    Created on : 02/11/2018, 12:40:34
    Author     : Leona
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Comparator"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.com.projeto4.Question"%>
<%@page import="br.com.projeto4.Test"%>
<%@page import="br.com.projeto4.User"%>
<%@page import="br.com.projeto4.Db"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
        <%@include file="WEB-INF/jspf/bootstrapHead.jspf"%>
        <title>Gamer Quiz | Home</title>
    </head>
    <body>
        <!--***********Declaração de Variáveis e Checagem de Sessão***********-->
        <%
        double media = 0;
        int contador = 0;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy 'às' HH:mm:ss");
        DecimalFormat formatoNum = new DecimalFormat("#,###0.0");
        String usuario = "";
        if(session.getAttribute("usuario")!=null){
            usuario = (String)session.getAttribute("usuario");
        }
        if(request.getParameter("botaoEntrar")!=null && Db.usersdoArrayList(request.getParameter("nome"))){
            session.setAttribute("usuario", request.getParameter("nome"));
            usuario = (String)session.getAttribute("usuario");
        }
        if(request.getParameter("botaoSair")!=null){
            usuario = "";
            session.invalidate();
        }%>
        <!--***********Banner do Site***********-->
        <div class="imagem">
            <img src="imgs/BannerGames.png" class="img-responsive"/>
        </div>
        
        <!--***********Navegador do Site (poderá adicionar botões se precisar)***********-->
        <nav id="cabecalho" class="navbar">
            <div class="container">
                <div class="text-center">
                    <h1 class="text-muted"><span class="text-info">Gamer</span> Quiz</h1>
                </div>
            </div>
        </nav>
        <!--***********Área principal do Site***********-->
        <div class="container">
            <div class="row">
                <!--***********Área do Historico***********-->
                <%
                if(usuario!=""){%>
                <div class="col-sm-9 borda">
                    <h2 class="text-center">Seu Historico</h2>
                    <div class="row">
                        <div class="col-sm-8">
                            <!--***********Últimos testes***********-->
                            <h3>Ultimos testes</h3>
                            <!--***********Tabela***********-->
                            <table class="table table-hover table-bordered">
                                <thead>
                                    <th>Nome</th>
                                    <th>Nota</th>
                                    <th>Data</th>
                                </thead>
                                <tbody>
                                    <%
                                    contador=0;
                                    for(Test t: Test.compareData(Db.getTestes())){
                                        if(t.getNomeUsuario().equals(usuario) && contador<10){%>
                                        <tr>
                                            <td><%=t.getNomeUsuario()%></td>
                                            <td><%=formatoNum.format(t.getNota())%></td>
                                            <td><%=formato.format(t.getData().getTime())%></td>
                                        </tr>
                                        <%
                                        contador++;}
                                    }
                                    if(contador==0){%>
                                    <tr>
                                        <td colspan="3">Você ainda não realizou nenhum teste.</td>
                                    </tr>
                                    <%}%>
                                </tbody>
                            </table>
                        </div>
                        <!--***********Rank***********-->
                        <div class="col-sm-4 text-center">
                            <h3>Sua média</h3>
                            <!--Tabela-->
                            
                            <%
                            contador = 0;
                                            
                            for(Test t: Db.getTestes()){
                                if(t.getNomeUsuario().equals(usuario)){
                                    media += t.getNota();
                                    contador++;  
                                }
                            }
                            media/=contador;
                            if(Double.isNaN(media)){
                                media=0;
                            }
                            
                            if(media<6){
                                %><label class="nota" id="notaBaixa"><%=formatoNum.format(media)%></label><%
                            }else{
                                %><label class="nota" id="notaAlta"><%=formatoNum.format(media)%></label><%
                            }
                            %>
                                        
                        </div>
                    </div>
                </div>
                <!--***********Área do login***********-->
                <div id="bordaLogin" class="col-sm-3 borda">
                    
                    <h2 class="text-center">Bem-vindo! <%=(String)session.getAttribute("usuario")%></h2>
                    <form method="POST" class="form-group">
                        <a href="quest.jsp"><input type="button" value="Iniciar teste" name="botaoTeste" class="btn botao" id="btnLogin"></a>
                        <input type="submit" value="Sair" name="botaoSair" class="btn botao" id="btnSair">
                    </form>
                </div>
                <%}
                else{%>
                <div class="col-sm-9 borda">
                    <h2 class="text-center">Historico do Site</h2>
                    <div class="row">
                        <div class="col-sm-8">
                            <!--***********Últimos testes***********-->
                            <h3>Ultimos testes</h3>
                            <!--***********Tabela***********-->
                            <table class="table table-hover table-bordered">
                                <thead>
                                    <th>Nome</th>
                                    <th>Nota</th>
                                    <th>Data</th>
                                </thead>
                                <tbody>
                                    <%
                                    contador = 0;
                                    for(Test t: Test.compareData(Db.getTestes())){
                                        if(contador<10){
                                    %>
                                    
                                    <tr>
                                        <td><%=t.getNomeUsuario()%></td>
                                        <td><%=formatoNum.format(t.getNota())%></td>
                                        <td><%=formato.format(t.getData().getTime())%></td>
                                    </tr>
                                    <%
                                            contador++;
                                        } 
                                    }
                                    %>
                                </tbody>
                            </table>
                        </div>
                        
                        <!--***********Média***********-->
                        <div class="col-sm-4">
                            <h3>Os melhores!</h3>
                            <!--Tabela-->
                            <table class="table table-hover table-bordered">
                                <thead>
                                    <th>Nome</th>
                                    <th>Nota</th>
                                </thead>
                                <tbody>
                                    <%
                                    contador = 0;
                                    for(Test t: Test.compareNota(Db.getTestes())){
                                        if(contador<10){
                                    %>
                                    <tr>
                                        <td><%=t.getNomeUsuario()%></td>
                                        <td><%=formatoNum.format(t.getNota())%></td>
                                    </tr>
                                    <%
                                            contador++;
                                        }
                                    }%>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
                
                <!--***********Área do login***********-->
                <div id="bordaLogin" class="col-sm-3 borda">
                    
                     <h2 class="text-center">Login</h2>
                    
                    <form method="POST" class="form-group">
                        <label for="nome">Nome</label>
                        <input type="text" class="form-control" id="nome" name="nome" required>
                        <%if(request.getParameter("botaoEntrar")!=null && 
                                request.getParameter("nome")!=null &&
                                !Db.usersdoArrayList(request.getParameter("nome") )){%>
                        <span>Digite um nome válido.</span>
                        <%}%>
                        <input type="submit" value="Entrar" name="botaoEntrar" class="btn botao" id="btnLogin">
                        <a href="cadastrar.jsp" class="btn botao" id="btnCadastrar">Cadastrar</a>
                    </form>
                </div>
                
                <%}%>
            </div>
        </div>
        <%@include file="WEB-INF/jspf/bootstrapBody.jspf" %>
    </body>
</html>
