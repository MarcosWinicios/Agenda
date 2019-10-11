package br.com.marcos.agenda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import br.com.marcos.agenda.conexao.Conexao;
import br.com.marcos.agenda.model.Contato;

public class ContatoDAO {
	private Connection conexao;
	private PreparedStatement stmt;
	
	public ContatoDAO() {
		Conexao conn = new Conexao();
		this.conexao = conn.getConexao();
	}
	
	public void inserirContato(Contato c) {
		String sql = "INSERT INTO contato(nome,endereco,telefone1,telefone2,email,dataNascimento,profissao,sexo,estadoCivil,escolaridade)VALUES(?,?,?,?,?,?,?,?,?,?)";
		
		try {
			this.stmt = conexao.prepareStatement(sql);
			this.stmt.setString(1, c.getNome());
			this.stmt.setString(2, c.getEndereco());
			this.stmt.setString(3, c.getTelefone1());
			this.stmt.setString(4, c.getTelefone2());
			this.stmt.setString(5, c.getEmail());
			this.stmt.setString(6, c.getDataNascimento());
			this.stmt.setString(7, c.getProfissao());
			this.stmt.setString(8, c.getSexo());
			this.stmt.setString(9, c.getEstadoCivil());
			this.stmt.setString(10, c.getEscolaridade());
			this.stmt.execute();
			this.stmt.close();			
		}catch(Exception e) {
			 throw new RuntimeException(e);
		}
	}
	
	public Contato pesquisarNome(String nome) {
		String sql = "SELECT * FROM contato WHERE nome = ?";
		try {
			this.stmt = conexao.prepareStatement(sql);
			this.stmt.setString(1, nome);
			ResultSet rs = this.stmt.executeQuery();
			Contato c =  new Contato();
			while(rs.next()) {
				c = new Contato(rs.getInt("id"), rs.getString("nome"), rs.getString("endereco"), rs.getString("telefone1"), rs.getString("telefone2"), rs.getString("email"), rs.getString("dataNascimento"), rs.getString("profissao"), rs.getString("sexo"), rs.getString("estadoCivil"), rs.getString("escolaridade"));
			}
			this.stmt.close();
			return c;
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
