package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;

public class ListaContatosLogica implements Logica{
	public String executa(HttpServletRequest req, HttpServletResponse resp)
	throws Exception{
		List<Contato> contatos = new ContatoDao().getLista();	
	req.setAttribute("contatos", contatos);	
	return "lista-contatos.jsp";
	}
	

}
