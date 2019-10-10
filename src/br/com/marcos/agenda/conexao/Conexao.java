package br.com.marcos.agenda.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	private static final String DSN = "jdb:mysql://localhost:3306/agenda?useTimezone=true&serverTimezone=UTC";
	private static final String USUARIO = "root";
	private static final String SENHA = "20181032";
}
