
public class Aplicacao {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Savio");
		Banco banco = new Banco("BB");
		
		ContaCorrente cc = new ContaCorrente(cliente, banco);
		ContaPoupanca poupanca = new ContaPoupanca(cliente, banco);

		banco.imprimirContas();
		
		cc.depositar(1000);
				
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc.transferir(500, poupanca);
		poupanca.sacar(200);

		cc.imprimir();
		poupanca.imprimir();		
	}
}
