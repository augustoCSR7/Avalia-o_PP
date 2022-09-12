package br.com.nubank.caixaEletronico;

import br.com.nubank.conta.Conta;

public class CaixaEletronico{

	public static void main(String[] args) {
		Conta pessoa1 = new Conta(1234, 5);
		
		
		System.out.println("Valor antes: " + pessoa1.getSaldo());
		
		pessoa1.depositar(400);
		System.out.println("Valor c/ deposito: " + pessoa1.getSaldo());
		
		pessoa1.sacar(100);
		System.out.println("Valor c/ saque: " + pessoa1.getSaldo());
		
		pessoa1.getNumAgencia();
		System.out.println("Agencia: " + pessoa1.getNumAgencia());
		
		pessoa1.getNumConta();
		System.out.println("Numero da conta: " + pessoa1.getNumConta());
		
		pessoa1.Extrato();
		System.out.println("Extrato: " + pessoa1.Extrato());
	}

}
