package modulos_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance();

		Date date = new Date();

		System.out.println("Data completa: " + date);

		System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());

		System.out.println("O dia do mês é: " + date.getDate());

		System.out.println("O dia do mês no CALENDAR é: " + calendar.get(Calendar.DAY_OF_MONTH));

		System.out.println("A hora do dia é: " + date.getHours());

		System.out.println("A hora do dia no CALENDAR é: " + calendar.get(Calendar.HOUR_OF_DAY));

		System.out.println("O dia da semana no CALENDAR é: " + (calendar.get(Calendar.DAY_OF_WEEK) - 1));

		System.out.println("O minuto da hora é: " + date.getMinutes());

		System.out.println("O minuto da hora no CALENDAR é: " + calendar.get(Calendar.MINUTE));
		
		System.out.println("A hora do dia no CALENDAR é: " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Os segundos do dia: "+date.getSeconds());
		
		System.out.println("Os segundos do dia no CALENDAR é: " + calendar.get(Calendar.SECOND));

		System.out.println("Ano é : " + (1900 + date.getYear()));
		
		System.out.println("O ano no CALENDAR é: " + calendar.get(Calendar.YEAR));

		System.out.println("data em milssegundos: " + date.getTime());

		// ------------------- SIMPLE DATE FORMAT ------------------//

		SimpleDateFormat simpleDateformat = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Data em formato padrão: " + simpleDateformat.format(date));
		
		System.out.println("Data atual em formato CALENDAR: "+simpleDateformat.format(Calendar.getInstance().getTime()));

		simpleDateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		System.out.println("Data em formato DBA: " + simpleDateformat.format(date));

		System.out.println("Object date: " + simpleDateformat.parse("2023-12-19 20:22:33"));

	}
}
