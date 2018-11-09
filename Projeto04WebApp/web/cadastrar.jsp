<%-- 
    Document   : cadastrar
    Created on : 07/11/2018, 22:34:21
    Author     : thiag
--%>
<%@page import="br.com.projeto4.Db"%>
<%@page import="br.com.projeto4.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
        <%@include file="WEB-INF/jspf/bootstrapHead.jspf"%>
        <title>Gamer Quiz | Cadastro</title>
    </head>
    <body>
        <div class="imagem">
            <img src="imgs/BannerGames.png" class="img-responsive"/>
        </div>
        
        <nav id="cabecalho" class="navbar">
            <div class="container">
                <div class="text-center">
                    <h1 class="text-muted">Cadastro</h1>
                </div>
            </div>
        </nav>
        
        <div class="container">
            <div class="row">
                <div class="col-sm-4"></div>
                <div id="conteudoCadastro" class="col-sm-4 borda">
                    <%if(request.getParameter("cadastrar")!=null && request.getParameter("nome")!=null && request.getParameter("nome")!=""){
                                    String nome = request.getParameter("nome");
                                    Db.getUser().add(new User(nome));
                                    response.sendRedirect("home.jsp");
                                }%>
                    <form method="POST" class="form-group">
                        <label for="nome">Nome</label>
                        <input type="text" class="form-control" id="nome" name="nome" required>
                        <input type="submit" value="Cadastrar" name="cadastrar" class="btn botao" id="btnCadastrar">
                        <a href="home.jsp" class="btn botao" id="btnVoltar">Voltar</a>
                    </form>
                </div>
                <div class="col-sm-4"></div>
            </div>
        </div>
    </body>
</html>
