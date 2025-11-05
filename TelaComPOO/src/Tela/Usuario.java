package Tela;

public class Usuario {
	//private por causa de segurança (encapsulamento)
	private String usuario;
	private String senha;
	private String msg;
	
	//construtor (sempre publico)
	public Usuario (String usuario, String senha) {
		//para enteder que esse usuario e senha se refere a atributo
		this.usuario = usuario;
		this.senha = senha;
		this.msg = "Bem vindo(a)";
	}
	//get para buscar os valores
	public String getUsuario() {
		return usuario;
	}
	public String getSenha() {
		return senha;
	}

	public String msg() {
		return msg;
	}
}
