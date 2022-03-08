package gui;

import java.util.Date;
import java.text.ParseException;
import java.util.ArrayList;

import Dominio.Eleitor;
import Dominio.enum_.CargoEnum;
import Dominio.enum_.CargoEnum2;
import Dominio.enum_.DiasEnum;
import repositorios.EleitorRepositorio;
import servicos.EleitorServico;
import util.DatetimeExtensions;

public class Main {
	public static ArrayList<Eleitor> eleitoresBR=new ArrayList<Eleitor>();
	public static EleitorRepositorio eleitoresRepositorio=new EleitorRepositorio(eleitoresBR);
	public static EleitorServico  eleitorServico=null;
    public static void main(String[]args) throws ParseException{
    	eleitorServico=new EleitorServico(eleitoresRepositorio);
    	/*System.out.println( (CargoEnum.DeputadoEstadual.ordinal()));
    	System.out.println( (CargoEnum.DeputadoEstadual.getDescricao()));
    	if(CargoEnum.DeputadoEstadual.ordinal()==6) 
    		System.out.println("Deputado Estadual");*/
    	//System.out.println(DiasEnum.Segunda);
    	Date str_obj= DatetimeExtensions.toString("20/03/2000");
    	System.out.println(">>>"+str_obj.getDay());
    	System.out.println(">>>"+str_obj.getMonth());
    	System.out.println(">>>"+str_obj.getYear());
    	 
        
    }
    
}
