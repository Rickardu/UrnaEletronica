package br.hello.controller;

import br.hello.domain.Hello;
import br.hello.servico.HelloServico;

public class HelloController {
	private HelloServico helloServico;
	public HelloController() {		
		this.helloServico= new HelloServico();		
	}
	
	public void salvar(String nome, int idade, String cpf) throws Exception {
		Hello hl=new Hello(nome,idade,cpf);
		helloServico.salvar(hl);
	}
	public void salvar(Hello hl) throws Exception {
	 
		helloServico.salvar(hl);
	}
	

}
