package br.com.nubank.conta;

import br.com.nubank.transacao.Transacao;

import java.util.ArrayList;

public class Conta {
	private float saldo;
	private int numConta;
	private int numAgencia;
	private float extrato;
	private ArrayList<Transacao> transacoes;
	
	public Conta(int saldo_, int numConta_, int numAgencia_) {
		this.saldo = saldo_;
		this.numConta = numConta_;
		this.numAgencia = numAgencia_;
		this.extrato = extrato;
		
		transacoes = new ArrayList<Transacao>();
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	} 
	
	public void depositar(float valorDep) {
		this.saldo += valorDep;
	}
	
	public void sacar(float valorSac) {
		if(this.saldo > valorSac) {
			this.saldo -= valorSac;
		}else {
			System.out.println("SALDO INSUFICIENTE!!");
		}
	}
	
	public float Extrato( ) {
	/*	System.out.println(transacoes);
		System.out.println("Agencia: " + this.numAgencia);
		System.out.println("Numero da conta: " + this.numConta);  */
		return extrato;
	}
	
	public void registrarTrans() {
		
	}
	
}
