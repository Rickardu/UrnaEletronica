package Dominio;

import Dominio.enum_.MesarioCargoEnum;

public class Mesario extends Eleitor {
	 public Mesario(long id) {
		super(id);
		 
	}
	private Eleicao eleicao;
	 private EnderecoEleitoral eleitoral;
	 private MesarioCargoEnum cargo;

}
