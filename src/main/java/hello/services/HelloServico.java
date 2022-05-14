package hello.services;

import java.sql.SQLException;

import hello.domain.Hello;
import hello.enums.HelloExceptionEnum;
import hello.execptions.HelloException;
import hello.interfaces.IHello;
import hello.repositories.HelloRepositorio;
 
 

 
 
public class HelloServico implements IHello {
	private HelloRepositorio helloRespositorio;

	public HelloServico() {
		
		this.helloRespositorio = new HelloRepositorio();
		 
	}

	public void salvar(Hello hello) throws Exception {
		if (hello == null)
			throw new HelloException(HelloExceptionEnum.HelloInvalido.toString()+"HelloInvalido: OBJETO VAZIO");
		if (hello.getNome().length()==0 || hello.getNome().isEmpty()
				||  hello.getNome().length() > 50 || hello.getNome().length() < 5)
			throw new HelloException(HelloExceptionEnum.NomeInvalido.toString()+"NomeInvalido: "+hello.getNome());
		if (hello.getCpf().length()==0 || hello.getCpf().isEmpty() || hello.getCpf().length() != 11)
			throw new HelloException(HelloExceptionEnum.CpfInvalido.toString()+"CpfInvalido: "+hello.getCpf());
		
		try {
			Long.parseLong(hello.getCpf());
			
		} catch (Exception e) {
			throw new HelloException(HelloExceptionEnum.CpfInvalido.toString()+"CpfInvalido: "+e.getMessage());
		}
		
		if (hello.getIdade() < 18)
			throw new HelloException(HelloExceptionEnum.IdadeInvalido.toString()+"IdadeInvalido: "+hello.getIdade());
		System.out.println("1"); 	
		this.helloRespositorio.salvar(hello);
		System.out.println("2");
		System.out.println("HelloSalvo");
		 

	}
	
	public boolean salvar(Hello hello,int n)   {
		if (hello == null)
			return false;
		if (hello.getNome().length()==0 || hello.getNome().isEmpty()
				|| (hello.getNome().length() > 50 && hello.getNome().length() < 5))
			 	return false;
		if (hello.getCpf().length()==0 || hello.getCpf().isEmpty() || hello.getCpf().length() != 11)
			return false;
		if (hello.getIdade() < 18)
			 return false;
		 
		this.helloRespositorio.salvar(hello);
		System.out.println("HelloSalvo");
		return true;
		
		 

	}

}
