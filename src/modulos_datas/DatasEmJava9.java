package modulos_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava9 {

	public static void main(String[] args) throws ParseException, InterruptedException {

		LocalDate dataBase = LocalDate.parse("2023-12-25");
		
		/*
		System.out.println("A data base é: "+dataBase);
		
		System.out.println("Mais 5 dias: "+dataBase.plusDays(5));
		
		System.out.println("Mais 5 semanas: "+dataBase.plusWeeks(5));

		System.out.println("Mais 5 meses: "+dataBase.plusMonths(5));
		
		System.out.println("Mais 5 anos: "+dataBase.plusYears(5));
		
		System.out.println("Menos 5 dias: "+dataBase.minusDays(5));
		
		System.out.println("Menos 5 semanas: "+dataBase.minusWeeks(5));

		System.out.println("Menos 5 meses: "+dataBase.minusMonths(5));
		
		System.out.println("Menos 5 anos: "+dataBase.minusYears(5));
		*/
		for (int data = 0; data < 12; data++) {
			dataBase = dataBase.plusMonths(2);
			
			System.out.println("Data de vencimento do boleto é : "+dataBase.format(DateTimeFormatter.ofPattern("dd-MM-yyy"))+ "do mẽs: "+data);
			
		}



		
		
		
		
		
	}

}
