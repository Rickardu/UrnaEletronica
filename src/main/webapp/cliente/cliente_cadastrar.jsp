<%@ page language="java" contentType="text/html; charset=utf-8"
 pageEncoding="utf-8"%>
  
<!DOCTYPE html>
<html>
<head>
 
<title>JSP Actions Example</title>
</head>
<body>

<h1> CADASTRO DE CLIENTE</h1>
 <form action="<%= request.getContextPath() %>/ClienteAddServlet" method="get">
  Nome: <input type="text" name="nome">
  <br> <br> 
  
  cpf: <input type="text" name="cpf">
  <br> <br> 
  
  Email: <input type="email" name="email">
  <br> <br> 
  
  data Nascimento: <input type="date" name="dataNascimento"><br>
  <br> <br> 
  
  telefone: <input type="tel" name="telefone"><br>
  <br> <br> 
  
  whatapp: <input type="password" name="whatapp"><br>
  
  <br> 
  <input type="submit" value="register">
 </form>
</body>
</html>