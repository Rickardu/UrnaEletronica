<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%
int i = 0;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.82.0">
<title>Blog Template � Bootstrap v5.0</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.0/examples/blog/">



<!-- Bootstrap core CSS -->
<link href="./assets/dist/css/bootstrap.min.css" rel="stylesheet">

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
<link
	href="https://fonts.googleapis.com/css?family=Playfair&#43;Display:700,900&amp;display=swap"
	rel="stylesheet">
<!-- Custom styles for this template -->
<link href="./assets/dist/css/blog.css" rel="stylesheet">

</head>
<body>

	<div class="container">
		<header class="blog-header py-3">
			<div
				class="row flex-nowrap justify-content-between align-items-center">
				<div class="col-4 pt-1">
					<a class="link-secondary" href="#">Subscribe</a>
				</div>
				<div class="col-4 text-center">
					<a class="blog-header-logo text-dark" href="#">Large</a>
				</div>
				<div class="col-4 d-flex justify-content-end align-items-center">
					<a class="link-secondary" href="#" aria-label="Search"> <svg
							xmlns="http://www.w3.org/2000/svg" width="20" height="20"
							fill="none" stroke="currentColor" stroke-linecap="round"
							stroke-linejoin="round" stroke-width="2" class="mx-3" role="img"
							viewBox="0 0 24 24">
							<title>Search</title><circle cx="10.5" cy="10.5" r="7.5" />
							<path d="M21 21l-5.2-5.2" /></svg>
					</a> <a class="btn btn-sm btn-outline-secondary" href="#">Sign up</a>
				</div>
			</div>
		</header>

		<div class="nav-scroller py-1 mb-2">
			<nav class="nav d-flex justify-content-between">
				<a class="p-2 link-secondary" href="#">World</a> <a
					class="p-2 link-secondary" href="#">U.S.</a> <a
					class="p-2 link-secondary" href="#">Technology</a> <a
					class="p-2 link-secondary" href="#">Design</a> <a
					class="p-2 link-secondary" href="#">Culture</a> <a
					class="p-2 link-secondary" href="#">Business</a> <a
					class="p-2 link-secondary" href="#">Politics</a> <a
					class="p-2 link-secondary" href="#">Opinion</a> <a
					class="p-2 link-secondary" href="#">Science</a> <a
					class="p-2 link-secondary" href="#">Health</a> <a
					class="p-2 link-secondary" href="#">Style</a> <a
					class="p-2 link-secondary" href="#">Travel</a>
			</nav>
		</div>
	</div>

	<main class="container">
		<div class="p-4 p-md-5 mb-4 text-white rounded bg-dark">
			<div class="col-md-6 px-0">
				<h1 class="display-4 fst-italic">PETSHOP - PRODUTOS</h1>

			</div>
		</div>

		<div class="row mb-2">


			<form class="needs-validation"
				action="<%=request.getContextPath()%>/loja" method="post" novalidate>
				<c:forEach items="${listProdutos}" var="produto">

					<div class="col-md-3">
						<div
							class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
							<div class="col p-4 d-flex flex-column position-static">
								<strong class="d-inline-block mb-2 text-success">R$
									${produto.getPreco()}</strong>
								<h3 class="mb-0">${produto.getNome()}</h3>
								<div class="mb-1 text-muted">Para: ${produto.getTipo()}</div>
								<input type="hidden" value="${produto.getId()}"
									name="produtos[${i}].id">
								<p class="mb-auto">${produto.getDescricao()}</p>




							</div>
							<div class="form-check">
								<input type="checkbox" id="comprar"
									name="produtos[${i}].comprar"> <label
									class="form-check-label" for="comprar">Comprar</label>
							</div>
						</div>

					</div>
					<%
					i++;
					%>
				</c:forEach>

				<hr class="my-4">

				<button class="w-50 btn btn-primary btn-lg" type="submit">Finalizar
					Comprar</button>
			</form>
		</div>
	</main>
	<!-- /.container -->

	<footer class="blog-footer">
		<p>
			Blog template built for <a href="https://getbootstrap.com/">Bootstrap</a>
			by <a href="https://twitter.com/mdo">@mdo</a>.
		</p>
		<p>
			<a href="#">Back to top</a>
		</p>
	</footer>

	<script src="./assets/dist/js/bootstrap.bundle.min.js"></script>

	<script src="./form-validation.js"></script>

</body>
</html>