<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.82.0">
    <title>Checkout example Â· Bootstrap v5.0</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/checkout/">

    

    <!-- Bootstrap core CSS -->
<link href="http://localhost:8080/PethospWeb/assets/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
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
      <img class="d-block mx-auto mb-4" src="../assets/brand/bootstrap-logo.svg" alt="" width="72" height="57">
      <h2>CADASTRO</h2>
      <p class="lead">Below is an example form built entirely with Bootstrapâ€™s form controls. Each required form group has a validation state that can be triggered by attempting to submit the form without completing it.</p>
    </div>

    <div class="row g-5">
       
      <div class="col-md-7 col-lg-8">
        <h4 class="mb-3">CLIENTE</h4>
        <form class="needs-validation"  action="<%= request.getContextPath() %>/ClienteAddServlet" method="get" novalidate>
          <div class="row g-3">
            <div class="col-sm-12">
              <label for="nome" class="form-label">NOME COMPLETO</label>
              <input type="text" class="form-control" id="nome" placeholder="" value="" required>
              <div class="invalid-feedback">
                Insira o nome completo
              </div>
            </div>            

            <div class="col-12">
              <label for="email" class="form-label">Email <span class="text-muted">(Optional)</span></label>
              <input type="email" class="form-control" id="email" placeholder="you@example.com">
              <div class="invalid-feedback">
                Insira um email válido.
              </div>
            </div>

            <div class="col-6">
              <label for="dt_nascimento" class="form-label">Data de Nascimento</label>
              <input type="text" class="form-control" id="dt_nascimento" placeholder="00/00/0000" required>
              <div class="invalid-feedback">
                Insira a data de nascimento.
              </div>
            </div>
             <div class="col-6">
              <label for="cpf" class="form-label">CPF:</label>
              <input type="text" class="form-control" id="cpf" placeholder="000000000000" required>
              <div class="invalid-feedback">
                Insira um cpf.
              </div>
            </div>
            <div class="col-6">
              <label for="complemento" class="form-label">Complemento:</label>
              <input type="text" class="form-control" id="complemento" placeholder="sem numero, edifio" required>
              <div class="invalid-feedback">
                Insira um complemento.
              </div>
            </div>

             <div class="col-6">
              <label for="telefone" class="form-label">Celular</label>
              <input type="text" class="form-control" id="telefone" placeholder="8100000000" required>
              <div class="invalid-feedback">
                Insira um telefone.
              </div>
            </div>
             <div class="col-6">
              <label for="whatsapp" class="form-label">WhatsApp:</label>
              <input type="text" class="form-control" id="whatapps" placeholder="000000000000" required>
              <div class="invalid-feedback">
                Insira o número de WhatsApp.
              </div>
            </div>
		  <hr class="my-4">
		   <h5 class="mb-3">ENDERECO</h5>
			

            <div class="col-md-5">
              <label for="country" class="form-label">Pais</label>
              <select class="form-select" id="pais" required>
                <option value="">Selecione...</option>
                <option>Brasil</option>
              </select>
              <div class="invalid-feedback">
                Insira o nome do pais
              </div>
            </div>

            <div class="col-md-4">
              <label for="state" class="form-label">Estado</label>
              <select class="form-select" id="estado" required>
                <option value="">Selecione...</option>
                <option>PE</option>
              </select>
              <div class="invalid-feedback">
                Insira o nome do estado
              </div>
            </div>
            
            <div class="col-3">
              <label for="cidade" class="form-label">CIDADE</label>
              <input type="text" class="form-control" id="cidade" placeholder="Recife, Olinda" required>
              <div class="invalid-feedback">
                Insira uma cidade
              </div>
            </div>
			<div class="col-12">
              <label for="logradouro" class="form-label">Logradouro</label>
              <input type="text" class="form-control" id="logradouro" placeholder="Rua | Avenida | travessa | etc ..." required>
              <div class="invalid-feedback">
                Insira o nome da rua, avenida, travaessa ...
              </div>
            </div>
           <div class="col-3">
              <label for="numero" class="form-label">Numero</label>
              <input type="text" class="form-control" id="numero" placeholder=" sem numero.. 250 A" required>
              <div class="invalid-feedback">
                Insira o número .
              </div>
            </div>
              <div class="col-6">
              <label for="complemento" class="form-label">Complemento</label>
              <input type="text" class="form-control" id="complemento" placeholder=" Apt... casa..." required>
              <div class="invalid-feedback">
                Insira o complemento .
              </div>
            </div>
            <div class="col-md-3">
              <label for="zip" class="form-label">Cep</label>
              <input type="text" class="form-control" id="cep" placeholder="" required>
              <div class="invalid-feedback">
                Insira o cep
              </div>
            </div>
          </div>

          <hr class="my-4">

          <div class="form-check">
            <input type="checkbox" class="form-check-input" id="same-address">
            <label class="form-check-label" for="same-address">Shipping address is the same as my billing address</label>
          </div>

          <div class="form-check">
            <input type="checkbox" class="form-check-input" id="save-info">
            <label class="form-check-label" for="save-info">Save this information for next time</label>
          </div>

          <hr class="my-4">

          <h4 class="mb-3">Payment</h4>

          <div class="my-3">
            <div class="form-check">
              <input id="credit" name="paymentMethod" type="radio" class="form-check-input" checked required>
              <label class="form-check-label" for="credit">Credit card</label>
            </div>
            <div class="form-check">
              <input id="debit" name="paymentMethod" type="radio" class="form-check-input" required>
              <label class="form-check-label" for="debit">Debit card</label>
            </div>
            <div class="form-check">
              <input id="paypal" name="paymentMethod" type="radio" class="form-check-input" required>
              <label class="form-check-label" for="paypal">PayPal</label>
            </div>
          </div>

          <div class="row gy-3">
            <div class="col-md-6">
              <label for="cc-name" class="form-label">Name on card</label>
              <input type="text" class="form-control" id="cc-name" placeholder="" required>
              <small class="text-muted">Full name as displayed on card</small>
              <div class="invalid-feedback">
                Name on card is required
              </div>
            </div>

            <div class="col-md-6">
              <label for="cc-number" class="form-label">Credit card number</label>
              <input type="text" class="form-control" id="cc-number" placeholder="" required>
              <div class="invalid-feedback">
                Credit card number is required
              </div>
            </div>

            <div class="col-md-3">
              <label for="cc-expiration" class="form-label">Expiration</label>
              <input type="text" class="form-control" id="cc-expiration" placeholder="" required>
              <div class="invalid-feedback">
                Expiration date required
              </div>
            </div>

            <div class="col-md-3">
              <label for="cc-cvv" class="form-label">CVV</label>
              <input type="text" class="form-control" id="cc-cvv" placeholder="" required>
              <div class="invalid-feedback">
                Security code required
              </div>
            </div>
          </div>

          <hr class="my-4">

          <button class="w-100 btn btn-primary btn-lg" type="submit">Continue to checkout</button>
        </form>
      </div>
    </div>
  </main>

  
</div>


    <script src="../assets/dist/js/bootstrap.bundle.min.js"></script>

      <script src="form-validation.js"></script>
  </body>
</html>
