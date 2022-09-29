package br.com.nubank.caixaEletronico;

import br.com.nubank.Negocios.Cliente;
import br.com.nubank.Negocios.Conta;

public class CaixaEletronico{

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Cesar", "69263548-7", "Rua Brasil");
		
		Conta conta1 = new Conta(1234567, 27, cliente1);
		
		conta1.depositar(1000);
		conta1.sacar(350);
		conta1.getExtrato(conta1);
		
        System.out.println("Numero da conta: " + conta1.getNumConta());
        System.out.println("Agencia: " + conta1.getNumAgencia());
        System.out.printf("Saldo atual: %.2f\n",conta1.getSaldo());
        System.out.println("Saques realizados hoje: " + conta1.getSaques());
		System.out.println("----------------------------");
	}

}
