package br.com.nubank.Negocios;

public class Cliente {
	private String nome;
	private String rg;
	private String endereco;
	
	public Cliente(String nome_, String rg_, String endereco_){
		this.nome = nome_;
		this.rg = rg_;
		this.endereco = endereco_;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
