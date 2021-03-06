package servicos;

import java.util.Random;

import Dominio.Endereco;
import Dominio.enum_.EstadosEnum;
import util.GerardorDados;

public class EnderecoServico {
	public static Endereco gerarEndereco() {
		Endereco endereco1=new Endereco();
		endereco1.setCep(GerardorDados.gerarDocumento(8));
		endereco1.setBairro(GerardorDados.gerarNome(6));
		endereco1.setCidade(GerardorDados.gerarNome(12));	
		//define estado
	    int idxEstado = new Random().nextInt(EstadosEnum.values().length);			 
		endereco1.setEstado(EstadosEnum.values()[idxEstado].name());
		endereco1.setLogradouro(GerardorDados.gerarNome(50));
		endereco1.setNumero(GerardorDados.gerarDocumento(3));
		endereco1.setPais("Brasil");
		return endereco1;
		
	}
}
