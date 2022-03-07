package gui;

import java.util.ArrayList;

import Dominio.Eleitor;
import repositorios.EleitorRepositorio;
import servicos.EleitorServico;

public class Main {
	public static ArrayList<Eleitor> eleitoresBR=new ArrayList<Eleitor>();
	public static EleitorRepositorio eleitoresRepositorio=new EleitorRepositorio(eleitoresBR);
	public static EleitorServico  eleitorServico=null;
    public static void main(String[]args){
    	eleitorServico=new EleitorServico(eleitoresRepositorio);
    	int x=6;
    	 
        
    }
    
}
