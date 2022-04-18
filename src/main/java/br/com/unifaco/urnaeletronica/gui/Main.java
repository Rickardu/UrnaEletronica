package br.com.unifaco.urnaeletronica.gui;

import java.util.Date;
import java.util.Random;
import java.nio.charset.Charset;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import br.com.unifaco.urnaeletronica.Dominio.Eleitor;
import br.com.unifaco.urnaeletronica.Dominio.Endereco;
import br.com.unifaco.urnaeletronica.Dominio.EnderecoEleitoral;
import br.com.unifaco.urnaeletronica.Dominio.Partido;
import br.com.unifaco.urnaeletronica.Dominio.enum_.CargoEnum;
import br.com.unifaco.urnaeletronica.Dominio.enum_.DiasEnum;
import br.com.unifaco.urnaeletronica.Dominio.enum_.EleitorSituacaoEnum;
import br.com.unifaco.urnaeletronica.Dominio.enum_.EstadosEnum;
import br.com.unifaco.urnaeletronica.Dominio.enum_.PartidoEnum;
import br.com.unifaco.urnaeletronica.Dominio.enum_.SexoEnum;
import br.com.unifaco.urnaeletronica.repositorios.EleitorRepositorio;
import br.com.unifaco.urnaeletronica.repositorios.EleitorRepositoryJdbc;
import br.com.unifaco.urnaeletronica.repositorios.EnderecoEleitoralRepositoryJdbc;
import br.com.unifaco.urnaeletronica.repositorios.EnderecoRepositoryJdbc;
import br.com.unifaco.urnaeletronica.repositorios.PartidoRepositorio;
import br.com.unifaco.urnaeletronica.servicos.EleitorServico;
import br.com.unifaco.urnaeletronica.servicos.EnderecoEleitoralServico;
import br.com.unifaco.urnaeletronica.servicos.EnderecoServico;
import br.com.unifaco.urnaeletronica.util.DatetimeExtensions;
import br.com.unifaco.urnaeletronica.util.GerardorDados;
import controladores.EleitorControlador;
import controladores.PartidoControlador;
 

public class Main {
	 
	
	public static ArrayList<Partido> partidosBR=new ArrayList<Partido>();
	public static PartidoRepositorio partidosRepositorio=new PartidoRepositorio(partidosBR);
	public static PartidoControlador  partidoControlador=null;	
	
	
	public static Eleitor gerarEleitor() throws Exception {
		
		Eleitor eleitor1=new Eleitor();
    	eleitor1.setNome((GerardorDados.gerarNome(6)+" "+GerardorDados.gerarNome(8)).toUpperCase());
    	eleitor1.setDataNascimento(DatetimeExtensions.toDate("20/03/2000"));
    	eleitor1.setCpf(GerardorDados.gerarDocumento(11));
    	eleitor1.setNumReservista(GerardorDados.gerarDocumento(15));
    	eleitor1.setRg(GerardorDados.gerarDocumento(8));
    	//define sexo
    	String[] sexos= {"Masculino","Feminino","Outros"};
    	int idxSexo = new Random().nextInt(SexoEnum.values().length);	
    	eleitor1.setSexo(SexoEnum.values()[idxSexo]);
    	eleitor1.setEndereco(EnderecoServico.gerarEndereco());
    	eleitor1.setEnderecoEleitoral(EnderecoEleitoralServico.gerarEnderecoEleitoral()); 
    	eleitor1.setTitulo(GerardorDados.gerarDocumento(18));
    	eleitor1.setSituacao(EleitorSituacaoEnum.ativo);
    	Date date = new Date(System.currentTimeMillis());
    	eleitor1.setDataCadastro(date);
    	return eleitor1;    	 
		
	}
	
public static Partido gerarPartido() throws Exception {
		
		String razaoSocial=(GerardorDados.gerarNome(6)+" "+GerardorDados.gerarNome(8)).toUpperCase();
		String nomeFantasia=razaoSocial;
		Endereco endereco=EnderecoServico.gerarEndereco();
		String cnpj=GerardorDados.gerarDocumento(14);
		Partido partido=new Partido(razaoSocial,nomeFantasia,endereco,cnpj);	
		String[] siglaS = razaoSocial.split(" ");
		String sigla="";
		for (String string : siglaS) {
			sigla+=string.charAt(0);
		}
		partido.setSigla(sigla);
		partido.setDataCriacao(DatetimeExtensions.toDate("20/03/2000"));    	 
		partido.setStatus(PartidoEnum.registroAprovado);
		partido.setRegistro(GerardorDados.gerarDocumento(10));
    	return partido;    	 
		
	}
	
	
	
    public static void main(String[]args) throws Exception{
    	//ELEITOR eee
    	EnderecoRepositoryJdbc enderecoRepositoryJdbc=new EnderecoRepositoryJdbc();
    	EnderecoEleitoralRepositoryJdbc enderecoEleitoralRepositoryJdbc=new EnderecoEleitoralRepositoryJdbc();
    	EleitorRepositoryJdbc eleitoresRepositorio=new EleitorRepositoryJdbc();
    	EleitorControlador  eleitorControlador=null;	
    	
    	EnderecoEleitoral endEle=enderecoEleitoralRepositoryJdbc.consultarPorId(6);    	 
    	Endereco end=enderecoRepositoryJdbc.consultarPorId(11);
    	
    	EleitorServico eleitorServico= new EleitorServico();
    	eleitorServico.cadastrar(new Eleitor());
    	/*Eleitor eleitor= eleitorServico.pesquisarPorCpf("22151029164");
    	System.out.println("Nome:"+eleitor.getNome());
    	System.out.println("RG:"+eleitor.getRg());*/
    	
    	
    	/*eleitor.setEndereco(end);
    	eleitor.setEnderecoEleitoral(endEle);
    	eleitor.setNome("Fulano da Silva");
    	eleitor.setSexo(SexoEnum.Masculino);
    	eleitor.setDataNascimento(DatetimeExtensions.toDate("02/08/1995"));
    	eleitorServico.alterar(eleitor);*/
    	
    	/*Eleitor eleitorRemove= new Eleitor();
    	eleitorRemove.setCpf("96771209717");
    	eleitorServico.remover(eleitorRemove);*/
    	//eleitorControlador=new EleitorControlador(eleitoresRepositorio);
    	/*eleitorControlador.cadastrar(gerarEleitor());
    	eleitorControlador.cadastrar(gerarEleitor());
    	eleitorControlador.cadastrar(gerarEleitor());*/
    	//eleitorControlador.imprimirEleitores();
     
    	//PARTIDO
    /*	partidoControlador=new PartidoControlador(partidosRepositorio);
    	partidoControlador.cadastrar(gerarPartido());
    	partidoControlador.cadastrar(gerarPartido());
    	partidoControlador.cadastrar(gerarPartido());
    	partidoControlador.imprimirPartidos();*/
    	//ConnectionFactory.createConnection();22151029164
	 
    	
        
    }
    
}
