package br.com.unifaco.urnaeletronica.servicos;

import br.com.unifaco.urnaeletronica.Dominio.EnderecoEleitoral;
import br.com.unifaco.urnaeletronica.Dominio.enum_.EnderecoEleitoralEnum;
import br.com.unifaco.urnaeletronica.util.GerardorDados;

public class EnderecoEleitoralServico {
	public static EnderecoEleitoral gerarEnderecoEleitoral() {
		
		EnderecoEleitoral enderecoEleitoral= new EnderecoEleitoral();		
		enderecoEleitoral.setZona(GerardorDados.gerarDocumento(6));
		enderecoEleitoral.setSecao(GerardorDados.gerarNome(6));		
		enderecoEleitoral.setEndereco( EnderecoServico.gerarEndereco());
		enderecoEleitoral.setSituacao( EnderecoEleitoralEnum.ativo);
		
		return enderecoEleitoral;		
	}

}
