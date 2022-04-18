package gui;

import java.util.Date;
import java.util.Random;
import java.nio.charset.Charset;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import Dominio.Eleitor;
import Dominio.Endereco;
import Dominio.EnderecoEleitoral;
import Dominio.Partido;
import Dominio.enum_.CargoEnum; 
import Dominio.enum_.DiasEnum;
import Dominio.enum_.EleitorSituacaoEnum;
import Dominio.enum_.EstadosEnum;
import Dominio.enum_.PartidoEnum;
import Dominio.enum_.SexoEnum;
import controladores.EleitorControlador;
import controladores.PartidoControlador;
import repositorios.EleitorRepositorio;
import repositorios.EleitorRepositoryJdbc;
import repositorios.EnderecoEleitoralRepositoryJdbc;
import repositorios.EnderecoRepositoryJdbc;
import repositorios.PartidoRepositorio;
import servicos.EleitorServico;
import servicos.EnderecoEleitoralServico;
import servicos.EnderecoServico;
import util.ConnectionFactory;
import util.DatetimeExtensions;
import util.GerardorDados;

public class Main {
	 
	
	public static ArrayList<Partido> partidosBR=new ArrayList<Partido>();
	public static PartidoRepositorio partidosRepositorio=new PartidoRepositorio(partidosBR);
	public static PartidoControlador  partidoControlador=null;	
	
	
	public static Eleitor gerarEleitor() throws ParseException {
		
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
	
public static Partido gerarPartido() throws ParseException {
		
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