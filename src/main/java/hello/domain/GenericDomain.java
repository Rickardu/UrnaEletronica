package hello.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@SuppressWarnings("serial") // anotação do java 
@MappedSuperclass // anotação do hibernate

public abstract class GenericDomain implements Serializable {
	@Id// anotação do hibernate anotations
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	//@GeneratedValue(strategy = GenerationType.AUTO)// anotação do hibernate
	private Long id; 
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	private boolean status=true;

	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
