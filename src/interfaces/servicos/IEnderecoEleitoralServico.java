package interfaces.servicos;

import Dominio.EnderecoEleitoral;

public interface IEnderecoEleitoralServico {
	public EnderecoEleitoral consultarPorId(long id);
}
