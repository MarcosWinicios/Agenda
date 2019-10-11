package br.com.marcos.agenda.teste;

import br.com.marcos.agenda.dao.ContatoDAO;
import br.com.marcos.agenda.model.Contato;

public class Teste1 {
	public static void main(String[] args) {
		Contato c =  new Contato();
		c.setNome("Marcos");
		c.setEndereco("Casa do Marcos");
		c.setTelefone1("62996479470");
		c.setTelefone2("62996212064");
		c.setEmail("pmarcoswinicios@gmial.com");
		c.setDataNascimento("2018-04-18");
		c.setProfissao("Programador");
		c.setSexo("Masculino");
		c.setEstadoCivil("Solteiro");
		c.setEscolaridade("Cursando Ensino Superior");
		
		ContatoDAO cDAO = new ContatoDAO();
		cDAO.inserirContato(c);
	}
	
}
