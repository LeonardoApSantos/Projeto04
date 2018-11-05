<%-- 
    Document   : home
    Created on : 02/11/2018, 12:40:34
    Author     : Leona
--%>

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
        <title>Home</title>
    </head>
    <body>
        <!--***********Checagem de Sessão***********-->
        <%
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");   
        String usuario = "";
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
        <nav id="cabecalho" class="navbar navbar-default">
            <div class="container">
                <div class="navbar-header">
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
                                    
                                    for(Test t: Db.getTestes()){
                                        if(t.getNomeUsuario().equals(usuario)){%>
                                        <tr>
                                            <td><%=t.getNomeUsuario()%></td>
                                            <td><%=t.getNota()%></td>
                                            <td><%=formato.format(t.getData().getTime())%></td>
                                        </tr>
                                        <%}
                                    }%>
                                </tbody>
                            </table>
                        </div>
                        
                        <!--***********Rank***********-->
                        <div class="col-sm-4">
                            <h3>Os melhores!</h3>
                            <!--Tabela-->
                            <table class="table table-hover table-bordered">
                                <thead>
                                    <th>Nome</th>
                                    <th>Nota</th>
                                </thead>
                                <tbody>
                                    
                                    <tr>
                                        <td>Leonardo</td>
                                        <td>7.0</td>
                                    </tr>
                                    <tr>
                                        <td>Leonardo</td>
                                        <td>7.0</td>
                                    </tr>
                                    <tr>
                                        <td>Leonardo</td>
                                        <td>7.0</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
                <!--***********Área do login***********-->
                <div class="col-sm-3 borda">
                    
                    <h2 class="text-center">Bem-vindo! <%=(String)session.getAttribute("usuario")%></h2>
                    <form method="POST" class="form-group">
                        <a href="quest.jsp"><input type="button" value="Iniciar teste" name="botaoTeste" class="btn" id="btnLogin"></a>
                        <input type="submit" value="Sair" name="botaoSair" class="btn" id="btnLogin">
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
                                    <%for(Test t: Db.getTestes()){%>
                                    <tr>
                                        <td><%=t.getNomeUsuario()%></td>
                                        <td><%=t.getNota()%></td>
                                        <td><%=formato.format(t.getData().getTime())%></td>
                                    </tr>
                                    <%}%>
                                </tbody>
                            </table>
                        </div>
                        
                        <!--***********Rank***********-->
                        <div class="col-sm-4">
                            <h3>Os melhores!</h3>
                            <!--Tabela-->
                            <table class="table table-hover table-bordered">
                                <thead>
                                    <th>Nome</th>
                                    <th>Nota</th>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>Leonardo</td>
                                        <td>7.0</td>
                                    </tr>
                                    <tr>
                                        <td>Leonardo</td>
                                        <td>7.0</td>
                                    </tr>
                                    <tr>
                                        <td>Leonardo</td>
                                        <td>7.0</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
                
                <!--***********Área do login***********-->
                <div class="col-sm-3 borda">
                    <%if(request.getParameter("botaoCadastrar")!=null){%>
                        <h2 class="text-center">Cadastro</h2>
                        <%if(request.getParameter("cadastrar")!=null && request.getParameter("nomec")!=null){
                            String nome = request.getParameter("nomec");
                            Db.getUser().add(new User(nome));
                        }%>
                        <form method="POST" class="form-group">
                        <label for="nome">Nome</label>
                        <input type="text" class="form-control" id="nome" name="nomec">
                        <input type="submit" value="Cadastrar" name="cadastrar" class="btn" id="btnLogin">
                        </form>
                </div>
                    <%}else{%>
                     <h2 class="text-center">Login</h2>
                    
                    <form method="POST" class="form-group">
                        <label for="nome">Nome</label>
                        <input type="text" class="form-control" id="nome" name="nome">
                        <%if(request.getParameter("botaoEntrar")!=null && 
                                request.getParameter("nome")!=null && 
                                !Db.usersdoArrayList(request.getParameter("nome"))){%>
                        <span>Digite um nome válido.</span>
                        <%}/*else if(request.getParameter("botaoCadastrar")!=null && request.getParameter("nome")!=null ){

                            String nome = request.getParameter("nome");
                            Db.getUser().add(new User(nome));
                        }*/%>
                        <input type="submit" value="Entrar" name="botaoEntrar" class="btn" id="btnLogin">
                        <input type="submit" value="Cadastrar" name="botaoCadastrar" class="btn" id="btnLogin">
                    </form>
                </div>
                    
                <%}%>
                   
                <%}%>
            </div>
        <%@include file="WEB-INF/jspf/bootstrapBody.jspf" %>
    </body>
</html>
