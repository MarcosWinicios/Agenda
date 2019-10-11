package br.com.marcos.agenda.model;

public class Contato {
	private int id;
	private String nome;
	private String endereco;
	private String telefone1;
	private String telefone2;
	private String email;
	private String dataNascimento;
	private String profissao;
	private String sexo;
	private String estadoCivil;
	private String escolaridade;
	
	
	
	public Contato() {

	}
	public Contato(int id, String nome, String endereco, String telefone1, String telefone2, String email,
			String dataNascimento, String profissao, String sexo, String estadoCivil, String escolaridade) {

		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.profissao = profissao;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.escolaridade = escolaridade;
	}
	
	@Override
	public String toString() {
		String contato = this.getNome() + this.getEndereco() + this.getTelefone1() + this.getTelefone2() + this.getEmail();
		
		return contato;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	
	
	
	
}
