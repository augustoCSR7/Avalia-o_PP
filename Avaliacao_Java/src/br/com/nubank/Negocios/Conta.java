package br.com.nubank.Negocios;

import java.util.ArrayList;

public class Conta {
	private float saldo;
	private int numConta, saques;
	private int numAgencia;
	private float extrato;
	private Cliente Cliente;
	private ArrayList<Transacao> transacoes;
	
	public Conta(int numConta_, int numAgencia_, Cliente Cliente_) {
		this.saldo = 0.0f;
		this.numConta = numConta_;
		this.numAgencia = numAgencia_;
		this.Cliente = Cliente_;
		
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
	
	public float getExtrato(Conta Conta) {
		
		System.out.println("------------------- Extrato Conta -------------------\n");
		
		System.out.println(" - Saldo  Anterior:        R$ " + Conta.getSaldo());
		
		System.out.println(" - Valor c/ deposito:      R$ " + Conta.getSaldo());
		
		System.out.println(" - Saldo Atual:            R$ " + Conta.getSaldo());
		
		System.out.println(" - Agencia:                   " + Conta.getNumAgencia());
		
		System.out.println(" - Numero:                    " + Conta.getNumConta());
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("\n");
		
		return extrato;
	}
	
	public void registrarTrans() {
		
	}

	public int getSaques() {
		return saques;
	}

	public void setSaques(int saques) {
		this.saques = saques;
	}
	
}
