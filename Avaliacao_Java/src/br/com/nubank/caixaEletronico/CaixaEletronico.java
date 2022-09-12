package br.com.nubank.caixaEletronico;

import br.com.nubank.conta.Conta;

public class CaixaEletronico{

	public static void main(String[] args) {
		Conta pessoa1 = new Conta(200,1234, 5);
		
		System.out.println("Valor antes: " + pessoa1.getSaldo());
		
		pessoa1.depositar(400);
		System.out.println("Valor c/ deposito: " + pessoa1.getSaldo());
		
		pessoa1.sacar(1000);
		System.out.println("Valor c/ saque: " + pessoa1.getSaldo());
		     
	}

}
