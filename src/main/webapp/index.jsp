<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.82.0">
<title>Cadastro Hello</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.0/examples/checkout/">



<!-- Bootstrap core CSS -->
<link
	href="http://localhost:8080/Hello/assets/dist/css/bootstrap.min.css"
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
<link href="form-validation.css" rel="stylesheet">
</head>
<body class="bg-light">

	<div class="container">
		<main>
			<div class="py-5 text-center">
				<img class="d-block mx-auto mb-4"
					src="./assets/images/logo-hello.png" alt="" width="272"
					 >
				<h2>CADASTRO HELLO</h2>
				<p class="lead">Inserir os dados de cadastro de HELLO</p>
			</div>

			<div class="row g-5 justify-content-md-center">

				<div class="col-md-7 col-lg-8">
					 
					<form class="needs-validation"
						action="<%=request.getContextPath()%>/HelloServlet"
						method="post" novalidate>
						<div class="row g-3">
							<div class="col-sm-12">
								<label for="nome" class="form-label">NOME</label> <input
									type="text" name="nome" class="form-control" id="nome" placeholder=""
									value="" required>
								<div class="invalid-feedback">Insira o nome</div>
								<div class="col-sm-12">
									<label for="idade" class="form-label">Idade</label> 
									<input
										type="numeric" name="idade"class="form-control" id="idade" placeholder=""
										value="" required>
									<div class="invalid-feedback">Insira a idade</div>
									<div class="col-sm-12">
										<label for="cpf" class="form-label">CPF</label> <input
											type="text" name="cpf" class="form-control" id="cpf" placeholder=""
											value="" required>
										<div class="invalid-feedback">Insira o CPF</div>
									</div>


									<hr class="my-4">

									<button class="w-100 btn btn-danger btn-lg" type="submit">Salvar</button>
					</form>
				</div>
			</div>
		</main>


	</div>


	<script src="./assets/dist/js/bootstrap.bundle.min.js"></script>

	<script src="form-validation.js"></script>
</body>
</html>
