package hello.controllers;

import hello.domain.Hello;
import hello.services.HelloServico;

public class HelloController {

	public static void salvar(String nome, int idade, String cpf) throws Exception {
		Hello hl = new Hello(nome, idade, cpf);
		HelloServico hs = new HelloServico();
		hs.salvar(hl);
	}

	public static void salvar(Hello hl) throws Exception {
		HelloServico hs = new HelloServico();
		hs.salvar(hl); 
		 
	}

}
