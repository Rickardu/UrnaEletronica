<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Actions Example</title>
</head>
<body>

<h1> CADASTRO DE ANIMAL DE CLIENTE</h1>
 <form action="<%= request.getContextPath() %>/AnimalSalvarServlet" method="get">
  CPF CLIENTE: <input type="text" name="cpf">
  <br> <br> 
  Nome: <input type="text" name="nome">
  <br> <br> 
  <input type='hidden' name='id' value='0'/>
  
  Raça: <input type="text" name="raca">
  <br> <br> 
  
  Tipo: <input type="text" name="tipo">
  <br> <br> 
 
  
 
  <input type="submit" value="SALVAR ANIMAL">
 </form>
</body>
</html>