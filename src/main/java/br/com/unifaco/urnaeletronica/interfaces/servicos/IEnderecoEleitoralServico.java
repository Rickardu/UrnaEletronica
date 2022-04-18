package br.com.unifaco.urnaeletronica.interfaces.servicos;

import br.com.unifaco.urnaeletronica.Dominio.EnderecoEleitoral;

public interface IEnderecoEleitoralServico {
	public EnderecoEleitoral consultarPorId(long id);
}
