package br.com.marcos.agenda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import br.com.marcos.agenda.conexao.Conexao;

public class ContatoDAO {
	private Connection conexao;
	private PreparedStatement stmt;
	
	public ContatoDAO() {
		Conexao conn = new Conexao();
		this.conexao = conn.getConexao();
	}
	
	
}
