package br.com.nubank.transacao;

public class Transacao {
	private String operaçao;
	private float valor;
	private String data;
	
	public String getOperaçao() {
		return operaçao;
	}
	public void setOperaçao(String operaçao) {
		this.operaçao = operaçao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
}
