package gui;

import java.util.Date;
import java.util.Random;
import java.nio.charset.Charset;
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
import repositorios.PartidoRepositorio;
import servicos.EleitorServico;
import servicos.EnderecoEleitoralServico;
import servicos.EnderecoServico;
import util.DatetimeExtensions;
import util.GerardorDados;

public class Main {
	public static ArrayList<Eleitor> eleitoresBR=new ArrayList<Eleitor>();
	public static EleitorRepositorio eleitoresRepositorio=new EleitorRepositorio(eleitoresBR);
	public static EleitorControlador  eleitorControlador=null;	
	
	public static ArrayList<Partido> partidosBR=new ArrayList<Partido>();
	public static PartidoRepositorio partidosRepositorio=new PartidoRepositorio(partidosBR);
	public static PartidoControlador  partidoControlador=null;	
	
	
	public static Eleitor gerarEleitor() throws ParseException {
		
		Eleitor eleitor1=new Eleitor();
    	eleitor1.setNome((GerardorDados.gerarNome(6)+" "+GerardorDados.gerarNome(8)).toUpperCase());
    	eleitor1.setDataNascimento(DatetimeExtensions.toDate("20/03/2000"));
    	eleitor1.setCpf(GerardorDados.gerarDocumento(11));
    	eleitor1.setNumReservista(GerardorDados.gerarDocumento(16));
    	eleitor1.setRg(GerardorDados.gerarDocumento(8));
    	//define sexo
    	String[] sexos= {"Masculino","Feminino","Outros"};
    	int idxSexo = new Random().nextInt(SexoEnum.values().length);	
    	eleitor1.setSexo(SexoEnum.values()[idxSexo]);
    	eleitor1.setEndereco(EnderecoServico.gerarEndereco());
    	eleitor1.setEleitoral(EnderecoEleitoralServico.gerarEnderecoEleitoral()); 
    	eleitor1.setTitulo(GerardorDados.gerarDocumento(18));
    	eleitor1.setSituacao(EleitorSituacaoEnum.ativo);
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
	
	
	
    public static void main(String[]args) throws ParseException{
    	//ELEITOR eee
    	eleitorControlador=new EleitorControlador(eleitoresRepositorio);
    	eleitorControlador.cadastrar(gerarEleitor());
    	eleitorControlador.cadastrar(gerarEleitor());
    	eleitorControlador.cadastrar(gerarEleitor());
    	eleitorControlador.imprimirEleitores();
     
    	//PARTIDO
    	partidoControlador=new PartidoControlador(partidosRepositorio);
    	partidoControlador.cadastrar(gerarPartido());
    	partidoControlador.cadastrar(gerarPartido());
    	partidoControlador.cadastrar(gerarPartido());
    	partidoControlador.imprimirPartidos();
	 
    	
        
    }
    
}
