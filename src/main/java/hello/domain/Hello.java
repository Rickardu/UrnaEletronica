package hello.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "hello")
public class Hello extends GenericDomain{
	@Column(length = 50, nullable = false)
	private String Nome;
	@Column(nullable = false)
	private int idade;
	@Column(length = 11, nullable = false)
	private String cpf;
	
	public Hello(String nome, int idade, String cpf) {
		 
		Nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	

}
