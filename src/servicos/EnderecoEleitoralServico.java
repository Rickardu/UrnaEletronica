package servicos;

import Dominio.EnderecoEleitoral;
import util.GerardorDados;

public class EnderecoEleitoralServico {
	public static EnderecoEleitoral gerarEnderecoEleitoral() {
		
		EnderecoEleitoral enderecoEleitoral= new EnderecoEleitoral();		
		enderecoEleitoral.setZona(GerardorDados.gerarDocumento(6));
		enderecoEleitoral.setSecao(GerardorDados.gerarNome(6));		
		enderecoEleitoral.setEndereco( EnderecoServico.gerarEndereco());
		return enderecoEleitoral;		
	}

}
