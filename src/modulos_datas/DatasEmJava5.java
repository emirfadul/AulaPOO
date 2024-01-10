package modulos_datas;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DatasEmJava5 {

	public static void main(String[] args) throws ParseException{
		
		Date dateInicial = new SimpleDateFormat("dd/MM/yyyy").parse("03/01/2024");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateInicial);
		
		for (int parcela = 1; parcela <= 12; parcela++) {
			
			calendar.add(Calendar.MONTH, 1);
			
			System.out.println("Parcela numero: "+parcela+" vencimento é em "
			+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
			
		}
		
		
		
		
	}

}
