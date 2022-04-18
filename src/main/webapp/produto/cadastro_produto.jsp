<!doctype html>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
 
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.82.0">
<title>CADASTRO DE PRODUTO</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.0/examples/checkout/">



<!-- Bootstrap core CSS -->
<link
	href="http://localhost:8080/PethospWeb/assets/dist/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>


<!-- Custom styles for this template -->
<link href="../form-validation.css" rel="stylesheet">
</head>
<body class="bg-light">

	<div class="container">
		<main>
			<div class="py-5 text-center">
				<img class="d-block mx-auto mb-4"
					src="../assets/brand/bootstrap-logo.svg" alt="" width="72"
					height="57">
				<h2>CADASTRO</h2>
				<p class="lead">Cadastre um novo produto</p>
			</div>

			<div class="row g-5">

				<div class="col-md-7 col-lg-8">
					<h4 class="mb-3">Produto</h4>
					<form class="needs-validation" action="<%=request.getContextPath()%>/produto" method="post" novalidate>
						<div class="row g-3">
							<div class="col-sm-6">
								<label for="nome" class="form-label">NOME</label> <input
									type="text" class="form-control" id="nome" name="nome" placeholder=""
									value="" required>
								<div class="invalid-feedback">Insira o nome do produto</div>
							</div>
							<div class="col-sm-6">
								<label for="codigoBarras" class="form-label">Código de Barras</label> <input
									type="text" class="form-control" id="codigoBarras" name="codigoBarras" placeholder=""
									value="" required>
								<div class="invalid-feedback">Código de Barras</div>
							</div>
							<div class="col-sm-12">
								<label for="descricao" class="form-label">Descricao do
									Produto</label> <input type="text" class="form-control" id="descricao" name="descricao"
									placeholder="" value="" required>
								<div class="invalid-feedback">Insira uma descrição para o
									produto</div>
							</div>



							<div class="col-6">
								<label for="dt_validade" class="form-label">Data de
									Validade</label> <input type="date" class="form-control"
									id="dt_validade" name="dt_validade" placeholder="00/00/0000" required>
								<div class="invalid-feedback">Insira a data de validade.</div>
							</div>

							<div class="col-md-5">
								<label for="tipo" class="form-label">Tipo de Animal</label> <select
									class="form-select" id="tipo" name="tipo"required>
									<option value="">Selecione...</option>
									<c:forEach items="${listTipos}" var="tipo">
										<option value="${tipo}">${tipo}</option>
									</c:forEach>
								</select>
								<div class="invalid-feedback">Insira o nome do pais</div>
							</div>
							<div class="col-md-5">
								<label for="categoria" class="form-label">Categoria</label> <select
									class="form-select" id="categoria" name="categoria" required>
									<option value="">Selecione...</option>
									<c:forEach items="${listCategorias}" var="categoria">
										<option value="${categoria}">${categoria}</option>
									</c:forEach>
								</select>
								<div class="invalid-feedback">Insira o nome do pais</div>
							</div>

							<div class="col-md-5">
								<label for="status" class="form-label">Status do Produto</label>
								<select class="form-select" id="status" name="status" required>
									<option value="">Selecione...</option>
									<c:forEach items="${listStatus}" var="status">
										<option value="${status}">${status}</option>
									</c:forEach>
								</select>
								<div class="invalid-feedback">Insira o nome do pais</div>
							</div>



							<div class="col-4">
								<label for="preco" class="form-label">Preço:</label> <input
									type="number" class="form-control" id="preco" name="preco" step="0.01"
									placeholder="0,00" required>
								<div class="invalid-feedback">Insira um valor em R$.</div>
							</div>
							<div class="form-check">
								<input type="checkbox" class="form-check-input" id="perecivel" name="perecivel">
								<label class="form-check-label" for="perecivel">Perecível</label>
							</div>

							<hr class="my-4">

							<button class="w-50 btn btn-primary btn-lg" type="submit">Salvar Cadastro</button>
					</form>
				</div>
			</div>
		</main>


	</div>


	<script src="../assets/dist/js/bootstrap.bundle.min.js"></script>

	<script src="form-validation.js"></script>
</body>
</html>
