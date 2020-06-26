import java.text.SimpleDateFormat;
import java.util.Date;
public class ContaCorrente extends Conta {
	 @Override
	    public void imprimeExtrato() {
	        System.out.println("Extrato de Conta");
	         
	        SimpleDateFormat data = new SimpleDateFormat("dd/mm/aaaa hh:mm:ss");
	        Date date = new Date();
	         
	        System.out.println("Saldo: "+this.getSaldo());
	        System.out.println("Data: "+data.format(date));
	         
	    }
}
