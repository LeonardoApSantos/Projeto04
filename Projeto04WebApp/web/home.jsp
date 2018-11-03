<%-- 
    Document   : home
    Created on : 02/11/2018, 12:40:34
    Author     : Leona
--%>

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
                <div class="col-sm-9 borda">
                    <h2 class="text-center">Historico</h2>
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
                                    <tr>
                                        <td>Leonardo</td>
                                        <td>7.0</td>
                                        <td>02/11/2018</td>
                                    </tr>
                                    <tr>
                                        <td>Leonardo</td>
                                        <td>7.0</td>
                                        <td>02/11/2018</td>
                                    </tr>
                                    <tr>
                                        <td>Leonardo</td>
                                        <td>7.0</td>
                                        <td>02/11/2018</td>
                                    </tr>
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
                    <h2 class="text-center">Login</h2>
                    <form class="form-group">
                        <label for="nome">Nome</label>
                        <input type="text" class="form-control" id="nome">
                        <label for="senha">Senha</label>
                        <input type="password" class="form-control" id="senha">
                        <input type="submit" value="Entrar" name="botaoEntrar" class="btn" id="btnLogin">
                    </form>
                </div>
            </div>
        </div>
        <%@include file="WEB-INF/jspf/bootstrapBody.jspf" %>
    </body>
</html>
