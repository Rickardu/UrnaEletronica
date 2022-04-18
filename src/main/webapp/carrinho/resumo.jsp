<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Carrinho De Compras</title>
<link href="http://localhost:8080/PethospWeb/assets/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
      

      <h2>CARRINHO DE COMPRA</h2>
      <div class="table-responsive">
	<table class="table table-striped table-sm"  >
		<thead><tr>
			<th>Option</th>
			<th>Id</th>
			<th>NOME</th>			 
			<th>PREÇO</th>
			<th>QUANTIDADE</th>
			<th>SUB TOTAL</th>
		</tr>
		</thead>
          <tbody>
		<c:set var="total" value="0"></c:set>
		<c:forEach var="item" items="${sessionScope.carrinho }">
			<c:set var="total" value="${total + item.getProduto().getPreco() * item.getQuantidade() }"></c:set>
			<tr>
				<td align="center">
					<a href="${pageContext.request.contextPath }/carrinho?action=remove&id=${item.getProduto().getId()}"
					onclick="return confirm('Tem Certeza?')">Remove</a>
				</td>
				<td>${item.getProduto().getId() }</td>
				<td>${item.getProduto().getNome() }</td>
				<!-- <td>
					<img src="${pageContext.request.contextPath }/assets/images/${item.getProduto().getNome() }" width="120">
				</td> -->
				<td>${item.getProduto().getPreco() }</td>
				<td>${item.getQuantidade()}</td>
				<td>${item.getProduto().getPreco() * item.getQuantidade()}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="6" align="right">Total</td>
			<td>${total }</td>
		</tr>
	</table>
	<br>
	<form class="needs-validation" action="<%=request.getContextPath()%>/loja" method="post" novalidate>
	<div class="col-md-5">
								<label for="pagamento" class="form-label">Forma de Pagamento</label> <select
									class="form-select" id="pagamento" name="pagamento"required>
									<option value="">Selecione...</option>
									<c:forEach items="${pagamentoList}" var="pagamento">
										<option value="${pagamento}">${pagamento}</option>
									</c:forEach>
								</select>
								<div class="invalid-feedback">Selecione o pagamento</div>
							</div>
							<div class="col-sm-3">
								<label for="id" class="form-label">ID CLIENTE</label> <input
									type="number" class="form-control" id="id" name="id" placeholder="0"
									value="" required>
								<div class="invalid-feedback">Insira o id do cliente</div>
							</div>
							<button class="w-50 btn btn-primary btn-lg" type="submit">CONFIRMAR COMPRA</button>
							</form>
 <script src="http://localhost:8080/PethospWeb/assets/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>