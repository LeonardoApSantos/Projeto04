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
        <title>JSP Page</title>
    </head>
    <body>
        
            <h2 class="text-center">Cadastro</h2>
            <%if(request.getParameter("cadastrar")!=null && request.getParameter("nome")!=null){
                            String nome = request.getParameter("nome");
                            Db.getUser().add(new User(nome));
                            response.sendRedirect("home.jsp");
                        }%>
            <form method="POST" class="form-group">
                <label for="nome">Nome</label>
                <input type="text" class="form-control" id="nome" name="nome">
                <input type="submit" value="Cadastrar" name="cadastrar" class="btn" id="btnLogin">
                <a href="home.jsp" class="btn" id="btnLogin">Voltar</a>
            </form>
        
        
    </body>
</html>
