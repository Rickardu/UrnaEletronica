package interfaces.repositorios;

import java.util.ArrayList;

import Dominio.Eleitor;

public interface IEleitorRespositorio {	 
	public Eleitor listarPorCpf(String cpf);
	public ArrayList<Eleitor> listarEleitores(Eleitor eleitor);
	public Eleitor listarPorTitulo(String titulo);
	

}
