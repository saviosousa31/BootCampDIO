package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da Conta: ");
		numero = entrada.nextInt();
		
		System.out.println("Por favor, digite o número da Agência: ");
		agencia = entrada.next();
		
		System.out.println("Por favor, digite o seu Nome: ");
		nomeCliente = entrada.next();

		System.out.println("Por favor, digite o valor do seu primeiro depósito: ");
		saldo = entrada.nextDouble();
		
		System.out.println("\n\n----------------------------------------------------");
		System.out.printf("\n\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
		
		entrada.close();		
	}
}
