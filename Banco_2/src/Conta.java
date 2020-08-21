
public class Conta {
	
	private int numero;
	private Cliente cliente;
	private Double saldo;
	
	public Conta(int numero, Cliente cliente, Double saldo) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public Conta(int numero, Cliente cliente) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = 0.00;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public String toString() {
	//	return "Conta [numero=" + numero + ", cliente=" + cliente + ", saldo=" + saldo + "]";
		return "Conta [numero=" + numero + ", nomeCliente=" + cliente.getNome() + ", saldo=" + saldo + "]";
	}
	
	
	
}
