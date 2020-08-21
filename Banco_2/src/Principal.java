import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {

	public static void main(String[] args) throws ParseException {
		
		Cliente c1 = new Cliente("Pedro Alves", "42145687691", new SimpleDateFormat("dd/MM/yyyy").parse("03/03/1978"), 12345.00);

		Cliente c2 = new Cliente("Maria dos Santos", "12345678944", new SimpleDateFormat("dd/MM/yyyy").parse("13/08/1968"));
		
		Conta cta1 = new Conta(1, c1);
		
		System.out.println(cta1);
	}

}
