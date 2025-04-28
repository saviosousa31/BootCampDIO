import java.util.ArrayList;

public class Banco {

	private String nome;
	private ArrayList<Conta> contas = new ArrayList<>();
	
	public Banco(String nome) {
		super();
		this.nome = nome;
	}
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	public void imprimirContas() {
		for(Conta conta : contas) {
			conta.imprimir();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}
