import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private String nome;
	private String CPF;
	private Date dataNasc;
	private Double rendaMensal;
	
	public Cliente(String nome, String cPF, Date dataNasc, Double renda) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.dataNasc = dataNasc;
		this.rendaMensal = renda;
	}

	@Override
	public String toString() {
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		return "Cliente [nome=" + nome + ", CPF=" + CPF + ", dataNasc=" + formatoData.format(dataNasc) + ", renda=" + rendaMensal + "]";
	}
}
