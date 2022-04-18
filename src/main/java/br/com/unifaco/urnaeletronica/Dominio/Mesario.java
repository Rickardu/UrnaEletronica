package br.com.unifaco.urnaeletronica.Dominio;

import br.com.unifaco.urnaeletronica.Dominio.enum_.MesarioCargoEnum;

public class Mesario extends Eleitor {
	 public Mesario(long id) {
		super(id);
		 
	}
	private Eleicao eleicao;
	 private EnderecoEleitoral eleitoral;
	 private MesarioCargoEnum cargo;

}
