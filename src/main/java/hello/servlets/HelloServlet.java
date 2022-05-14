package hello.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hello.controllers.HelloController;
 
 
 

 

 

/**
 * Servlet implementation class HelloServlet
 */
 
//@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("nome");
		System.out.println("Nome:"+name);
		try {
		 	String nome = request.getParameter("nome");
			int idade =Integer.parseInt(request.getParameter("idade"));
			String cpf = request.getParameter("cpf");
			System.out.println("Nome:"+nome);
			System.out.println("Idade:"+idade);
			System.out.println("Cpf:"+cpf);
			try {
				HelloController controllerHello=new HelloController();
				HelloController.salvar(nome, idade, cpf) ;
			} catch (Exception e) {
				System.out.println(">>>>error:"+ e.getMessage());
			}
			
			  
			 
			System.out.println("-----");
			response.setContentType("text/html"); 
	        PrintWriter out = response.getWriter(); 
	        out.print("<h2>Cadastro Realizado com sucesso!</h2>"); 
	        out.print("<a href='http://localhost:8080/Hello'>VOLTAR</a>");
	        out.close(); 
		
	} catch (Exception e) {
		System.out.println(e.getMessage()+"ERROOOOOOOO");
	}  
	}

}
