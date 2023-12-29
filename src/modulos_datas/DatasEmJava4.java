package modulos_datas;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatasEmJava4 {

	public static void main(String[] args) throws ParseException {

		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2023-12-02"), LocalDate.now());

		System.out.println("Possui " + dias + " dias");
		
		long mes = ChronoUnit.MONTHS.between(LocalDate.parse("2023-10-02"), LocalDate.now());

		System.out.println("Possui " + mes + " meses");

	}

}
