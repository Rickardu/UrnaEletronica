package interfaces.servicos;

import Dominio.Endereco; 

public interface IEnderecoServico {
	public Endereco consultarPorId(long id);
}
