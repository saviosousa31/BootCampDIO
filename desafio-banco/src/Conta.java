
public abstract class Conta {

	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 0;

	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	private Banco banco;
	
	public Conta(Cliente cliente, Banco banco) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++; 
		this.cliente = cliente;
		this.banco = banco;
		
		banco.adicionarConta(this);
	}
	
	public Conta(int agencia, int numero, int saldo, Cliente cliente, Banco banco) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
		this.banco = banco; 
		
		banco.adicionarConta(this);
	}

	public void sacar(double valor) {
		saldo -= valor;
		System.out.printf("\nSaque realizado na conta %d no valor de R$ %.2f", numero, valor);
	}
	
	public void depositar(double valor) {
		saldo += valor;
		System.out.printf("\nDepósito realizado na conta %d no valor de R$ %.2f", numero, valor);
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void imprimir() {
		System.out.printf("\nTitular: %s", cliente.getNome());
		System.out.printf("\nBanco: %s", banco.getNome());
		System.out.printf("\nAgencia: %d", agencia);
		System.out.printf("\nNumero Conta: %d", numero);
		System.out.printf("\nSaldo: R$ %.2f", saldo);
		System.out.println("\n----------------------\n");
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}  
}
