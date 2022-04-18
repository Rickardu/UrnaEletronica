package br.com.unifaco.urnaeletronica.Dominio;

public class BaseEntidade {
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BaseEntidade(long id) {
		 
		this.id = id;
	}
	public BaseEntidade() {
		 
		
	}
	
	

}
