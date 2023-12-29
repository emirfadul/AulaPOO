package modulos_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasEmJava3 {

	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance();

		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("27-12-2023"));

		calendar.add(Calendar.DAY_OF_MONTH, 30);

		System.out.println("Somando 30 dias à data atual: "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 1);

		System.out.println("Somando 1 mês à data atual: "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 1);

		System.out.println("Somando 1 ano à data atual: "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

	}

}
