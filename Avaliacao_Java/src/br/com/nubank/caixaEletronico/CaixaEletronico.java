package br.com.nubank.caixaEletronico;

import br.com.nubank.cliente.Cliente;
import br.com.nubank.conta.Conta;

public class CaixaEletronico{

	public static void main(String[] args) {
		Conta pessoa1 = new Conta(1234, 5);
		
		Cliente cliente1 = new Cliente("Cesar", "987654", "002");
		
		
		System.out.println(" - Saldo  Anterior:        R$ " + pessoa1.getSaldo());
		
		pessoa1.depositar(400);
		System.out.println(" - Valor c/ deposito:      R$ " + pessoa1.getSaldo());
		
		pessoa1.sacar(100);
		System.out.println(" - Saldo Atual:            R$ " + pessoa1.getSaldo());
		
		pessoa1.getNumAgencia();
		System.out.println(" - Agencia:                   " + pessoa1.getNumAgencia());
		
		pessoa1.getNumConta();
		System.out.println(" - Numero:                    " + pessoa1.getNumConta());
		
		System.out.println("------------ Extrato Conta -------------------");
		
		
		
		
        System.out.println("Numero da conta: " + pessoa1.getNumConta());
        System.out.println("Agencia: " + pessoa1.getNumAgencia());
        System.out.printf("Saldo atual: %.2f\n",pessoa1.getSaldo());
        System.out.println("Saques realizados hoje: " + pessoa1.getSaques());
        
        
		System.out.println("------------------------------------------------");
	}

}
